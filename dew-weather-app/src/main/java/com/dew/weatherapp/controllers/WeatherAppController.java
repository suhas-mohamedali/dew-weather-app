package com.dew.weatherapp.controllers;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dew.weatherapp.model.WeatherData;
import com.dew.weatherapp.model.weatherdto.WeatherDataType;
import com.dew.weatherapp.services.WeatherAppService;

@RestController
public class WeatherAppController {

	@Autowired
	private WeatherAppService weatherAppService;

	@GetMapping(value = "/weather/{wmoId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<WeatherData> retrieveAllWeatherData(@PathVariable @NotNull final String wmoId) throws Exception {

		return weatherAppService.fetchAllWeatherDetailsOfTheLocation(wmoId);
	}

	@GetMapping(value = "/weatherdata/{wmoId}/{weatherDataType}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<WeatherDataType> retrieveWeatherDataType(@PathVariable @NotNull final String wmoId,
			@PathVariable @NotNull final String weatherDataType) {

		return weatherAppService.fetchCustomWeatherDataOfTheLocation(wmoId, weatherDataType);
	}

}
