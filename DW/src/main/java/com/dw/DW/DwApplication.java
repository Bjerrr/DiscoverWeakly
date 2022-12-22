package com.dw.DW;

import com.dw.DW.GENERATED_POJOS.JsonTrip.JsonTripRoot;
import com.dw.DW.GENERATED_POJOS.JsonTrip.Trip;
import com.dw.DW.fetchTrip.FetchTrip;
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

import java.util.List;
import java.util.Timer;

@SpringBootApplication
@RestController
public class DwApplication {

	PlaylistBuilder playlistBuilder = new PlaylistBuilder();
	TimeCalculator timeCalculator = new TimeCalculator();
	FetchTrip fetchTrip = new FetchTrip();

	public static void main(String[] args) {
		SpringApplication.run(DwApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

	@GetMapping("/trip")
	public String trip(@RequestParam(value = "origin", defaultValue = "Göteborg Centralstation") String origin, @RequestParam(value = "destination", defaultValue = "Malmö Centralstation") String destination) {
		FetchTrip fetchTrip = new FetchTrip();

		return String.format(fetchTrip.getTrip(origin,destination));
	}

	@GetMapping("/prettyTrip")
	public String prettyTrip(@RequestParam(value = "origin", defaultValue = "Göteborg Centralstation") String origin, @RequestParam(value = "destination", defaultValue = "Malmö Centralstation") String destination) {
		FetchTrip fetchTrip = new FetchTrip();

		String rawJson = fetchTrip.getTrip(origin, destination);
		JsonTripRoot jsonRoot = new Gson().fromJson(rawJson, JsonTripRoot.class);

		Trip trip = jsonRoot.getTrip().get(0);
		String tripDeparture = trip.getOrigin().getTime();
		String tripOrigin = trip.getOrigin().getName();
		String tripDestination = trip.getDestination().getName();
		String tripArrival = trip.getDestination().getTime();

		return String.format("%s : %s ---> %s : %s", tripDeparture, tripOrigin, tripDestination, tripArrival);
	}

	@GetMapping("/suggestion")
	public List<String> suggestion(@RequestParam(value = "query", defaultValue = "") String query) {
		List<String> words = SearchSuggestion.loadList();
		SearchSuggestion suggestion = new SearchSuggestion(words);

		return suggestion.suggest(query);
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
			json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(playlistBuilder.createPlaylist(timeCalculator.calculateTime(tripDeparture, tripArrival)));

			return json;

		} catch (JsonProcessingException e) {
			throw new RuntimeException(e);
		}
	}
}
