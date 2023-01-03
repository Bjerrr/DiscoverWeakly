package com.dw.DW;

import com.dw.DW.GENERATED_POJOS.JsonTrip.JsonTripRoot;
import com.dw.DW.GENERATED_POJOS.JsonTrip.Trip;
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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DwApplication {

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

	@GetMapping("/playlist")
	public String playlist(@RequestParam(value = "origin", defaultValue = "Malmö") String origin, @RequestParam(value = "destination", defaultValue = "Hässleholm") String destination) {
		try {
			String rawJson = fetchTrip.getTrip(origin, destination);
			JsonTripRoot jsonRoot = new Gson().fromJson(rawJson, JsonTripRoot.class);

			Trip trip = jsonRoot.getTrip().get(0);
			String tripDeparture = trip.getOrigin().getTime();
			String tripArrival = trip.getDestination().getTime();

			ObjectMapper objectMapper = new ObjectMapper();
			String json = null;
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(playlistBuilder.createPlaylist(TimeCalculator.calculateTime(tripDeparture, tripArrival)));

			return json;

		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
}
