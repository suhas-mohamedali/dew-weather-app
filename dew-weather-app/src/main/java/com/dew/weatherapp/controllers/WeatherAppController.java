package com.dew.weatherapp.controllers;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.dew.weatherapp.model.Weather;
import com.dew.weatherapp.model.WeatherData;

@RestController
public class WeatherAppController {
	
	 private static final String BOM_URL = "http://www.bom.gov.au/fwo/IDS60901/IDS60901.";
	 private static final String JSON_EXT = ".json";
	
	
	  private RestTemplate restTemplate;

	    @Autowired
	    public WeatherAppController(RestTemplateBuilder builder) {
	        this.restTemplate = builder.build();
	    }
	
	
	@GetMapping(value = "/weather/{wmoId}", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public List<WeatherData> retrieveAllWeatherData(@PathVariable @NotNull final String wmoId )  throws HttpClientErrorException{
		
		StringBuilder sbURL = new StringBuilder(BOM_URL);
		sbURL.append(wmoId);
		sbURL.append(JSON_EXT);
		
		
		ResponseEntity<Weather> resp = restTemplate.getForEntity(sbURL.toString(), Weather.class);
		Weather obj = resp.getBody();
		
		return obj.getObservations().getData();
	}
	
	@GetMapping(value = "/weatherdata/{wmoId}/{weatherDataType}")
	
	public List retrieveWeatherDataType(@PathVariable @NotNull final String wmoId, @PathVariable @NotNull final String weatherDataType) {
		
		
		
		return null;
	}
	
	
	
	
	
	
	//System.out.println(obj.getObservations().getData());

}
