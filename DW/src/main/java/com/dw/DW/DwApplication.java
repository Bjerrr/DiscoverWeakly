package com.dw.DW;

import com.dw.DW.GENERATED_POJOS.JsonTrip.JsonTripRoot;
import com.dw.DW.GENERATED_POJOS.JsonTrip.Trip;
import com.dw.DW.SpotifyOAuth.AccessTokenResponse;
import com.dw.DW.fetchTrip.FetchTrip;
import com.dw.DW.fetchTrip.json_model.Leg;
import com.dw.DW.fetchTrip.json_model.PrettyTrip;
import com.dw.DW.playlistBuilder.PlaylistBuilder;
import com.dw.DW.playlistBuilder.TimeCalculator;
import com.dw.DW.searchSuggestion.SearchSuggestion;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

@SpringBootApplication
@RestController
public class DwApplication {
	public String access_token = "";

	PlaylistBuilder playlistBuilder = new PlaylistBuilder();
	FetchTrip fetchTrip = new FetchTrip();

	public static void main(String[] args) {
		SpringApplication.run(DwApplication.class, args);
	}

	/*
		EXAMPLE JSON RESPONSE:
		{
			"origin" : "Lund Rådhusrätten",
			"destination" : "Malmö Centralstation",
			"travelTime" : "00:35:00",
			"journey" : [ {
					"origin" : "Lund Rådhusrätten",
					"destination" : "Lund Univ-sjukhuset",
					"departure" : "13:43:00",
					"arrival" : "13:47:00"
				}, {
					"origin" : "Lund Univ-sjukhuset",
					"destination" : "Lund Centralstation",
					"departure" : "13:54:00",
					"arrival" : "13:58:00"
				}, {
					"origin" : "Lund Centralstation",
					"destination" : "Malmö Centralstation",
					"departure" : "14:04:00",
					"arrival" : "14:18:00"
				} ]
			}
	 */
	/**
	 * Retrieve a suitable trip between two locations.
	 * @param origin
	 * @param destination
	 * @return A json representation of the trip as described above.
	 */
	@GetMapping("/prettyTrip")
	public String prettyTrip(@RequestParam(value = "origin", defaultValue = "Göteborg Centralstation") String origin, @RequestParam(value = "destination", defaultValue = "Malmö Centralstation") String destination) {
		try {
			fetchTrip = new FetchTrip();

			String rawJson = fetchTrip.getTrip(origin, destination);
			JsonTripRoot jsonRoot = new Gson().fromJson(rawJson, JsonTripRoot.class);

			// Extract interesting data
			Trip trip = jsonRoot.getTrip().get(0);
			String tripDeparture = trip.getOrigin().getTime();
			String tripOrigin = trip.getOrigin().getName();
			String tripDestination = trip.getDestination().getName();
			String tripArrival = trip.getDestination().getTime();

			ArrayList<Leg> prettyLegs = new ArrayList<>();
			for (com.dw.DW.GENERATED_POJOS.JsonTrip.Leg leg : trip.getLegList().getLeg()) {
				Leg prettyLeg = new Leg();
				prettyLeg.origin = leg.getOrigin().getName();
				prettyLeg.destination = leg.getDestination().getName();
				prettyLeg.departure = leg.getOrigin().getTime();
				prettyLeg.arrival = leg.getDestination().getTime();
				prettyLegs.add(prettyLeg);
			}

			// Re-package in smaller objects
			PrettyTrip prettyTrip = new PrettyTrip();
			prettyTrip.origin = tripOrigin;
			prettyTrip.destination = tripDestination;
			prettyTrip.journey = prettyLegs;
			int secondsTraveled = TimeCalculator.calculateTime(tripDeparture, tripArrival);
			int minutesTraveled = secondsTraveled / 60;
			int hoursTraveled = minutesTraveled / 60;

			secondsTraveled = secondsTraveled - (minutesTraveled * 60);
			minutesTraveled = minutesTraveled - (hoursTraveled * 60);

			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
			prettyTrip.travelTime = LocalTime.of(hoursTraveled, minutesTraveled, secondsTraveled).format(dtf);

			ObjectMapper objectMapper = new ObjectMapper();
			String json;

			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(prettyTrip);

			return json;
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	@GetMapping("/suggestion")
	public String suggestion(@RequestParam(value = "query", defaultValue = "") String query) {
		try {
			List<String> words = SearchSuggestion.loadList();
			SearchSuggestion suggester = new SearchSuggestion(words);
			List<String> suggestions = suggester.suggest(query);

			if(suggestions.size() > 5)
				suggestions = suggestions.subList(0, 5);

			ObjectMapper objectMapper = new ObjectMapper();
			String json;

			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(suggestions);

			return json;
		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}

	/* EXAMPLE JSON:
		[ {
			"name" : "\"マイペース\" by Desi",
			"url" : "https://open.spotify.com/track/21J2S4LtikqShVwHkYfouh",
			"uri" : "spotify:track:21J2S4LtikqShVwHkYfouh",
		}, {
			"name" : "\"Breed To Breathe\" by Napalm Death",
			"url" : "https://open.spotify.com/track/2xmLu6vY7dlxUgpqzF2pCe",
			"uri" : "spotify:track:2xmLu6vY7dlxUgpqzF2pCe",
		} ]
	 */
	@GetMapping("/playlist")
	public String playlist(@RequestParam(value = "duration_ms", defaultValue = "600000") int duration_ms) {
		try {
			ObjectMapper objectMapper = new ObjectMapper();

			return objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(playlistBuilder.getPlaylist(duration_ms, access_token));

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}


	////////////////////////////////////////
	////////////////////////////////////////
	////////////////////////////////////////
	////////////////////////////////////////
	////////////////////////////////////////
	/// UGLY AUTHORIZATION TESTING STUFF ///
	@GetMapping("/authorize_redirect")
	public RedirectView authorize_redirect() {
		String client_id = "0a2e6423d13d4cccad3591bc78c66d32";
		String redirect_uri = "http://localhost:8080/";

		// String state = generateRandomString(16);
		// localStorage.setItem(stateKey, state);

		String scope = "playlist-modify-private";
		scope += "%20playlist-read-private";
		scope += "%20playlist-modify-public";
		scope += "%20playlist-read-collaborative";
		scope += "%20user-read-private";
		scope += "%20user-read-email";
		scope += "%20user-library-modify";
		scope += "%20user-library-read";


		String urlString = "https://accounts.spotify.com/authorize";
		urlString += "?response_type=code";
		urlString += "&client_id=" + client_id;
		urlString += "&scope=" + scope;
		urlString += "&redirect_uri=" + redirect_uri;

		System.out.println("authorization_redirect: " + urlString);

		return new RedirectView(urlString);
	}

	@PostMapping("/authorize")
	public ResponseEntity<String> authorize_post(@RequestParam(value = "code") String auth_code) {
		System.out.println("Authorization Code Recieved: ");

		System.out.println(auth_code);

		// Here we should post authorize to SpotifyAPI to get the access_token!

		String client_id = "0a2e6423d13d4cccad3591bc78c66d32";
		String client_secret = "5d58dc8223054895b229a2189ad74705";
		String redirect_uri = "http://localhost:8080/";

		// String state = generateRandomString(16);
		// localStorage.setItem(stateKey, state);

		String urlString = "https://accounts.spotify.com/api/token";

		String requestBody = "grant_type=authorization_code";
		requestBody += "&code=" + auth_code;
		requestBody += "&redirect_uri=" + redirect_uri;

		System.out.println("URL to retrieve access token from: " + urlString);
		System.out.println("RequestBody: " + requestBody);

		try {
			URL url = new URL(urlString);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Authorization", "Basic " + Base64.getEncoder().encodeToString(
					(client_id + ":" + client_secret).getBytes(StandardCharsets.UTF_8)));
			con.setRequestProperty("Content-type", "application/x-www-form-urlencoded");

			con.setDoOutput(true);
			con.getOutputStream().write(requestBody.getBytes(StandardCharsets.UTF_8));
			con.getOutputStream().flush();

			int http_status = con.getResponseCode();
			System.out.println(http_status);

			InputStream inputStream;
			if(http_status < 299) {
				inputStream = con.getInputStream();
			} else {
				inputStream = con.getErrorStream();
			}
			BufferedReader contentReader = new BufferedReader(new InputStreamReader(inputStream));

			StringBuilder content = new StringBuilder();
			String output;
			while ((output = contentReader.readLine()) != null) {
				content.append(output);
			}

			if (http_status > 299) {
				return new ResponseEntity<>(HttpStatusCode.valueOf(http_status));
			}

			// Save the access token
			System.out.println(content); //access token: .. bearer: ..
			AccessTokenResponse response = new Gson().fromJson(content.toString(), AccessTokenResponse.class);
			access_token = response.access_token;

			// Set up token refresh stuff!
			// new TokenRefresher();

			return new ResponseEntity<>(HttpStatusCode.valueOf(http_status));

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ResponseEntity<>(HttpStatusCode.valueOf(999));
	}
}
