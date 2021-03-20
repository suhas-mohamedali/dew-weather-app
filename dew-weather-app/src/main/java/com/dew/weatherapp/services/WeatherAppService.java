package com.dew.weatherapp.services;

import java.text.ParseException;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.dew.weatherapp.model.Weather;
import com.dew.weatherapp.model.WeatherData;
import com.dew.weatherapp.model.weatherdto.WeatherDataType;
import com.dew.weatherapp.util.WeatherDataTypeFactory;

@Service
public class WeatherAppService {

	private static final String BOM_URL = "http://www.bom.gov.au/fwo/IDS60901/IDS60901.";
	private static final String JSON_EXT = ".json";

	private RestTemplate restTemplate;

	@Autowired
	public WeatherAppService(RestTemplateBuilder builder) {
		this.restTemplate = builder.build();
	}

	public List<WeatherData> fetchAllWeatherDetailsOfTheLocation(String wmoId) {

		StringBuilder sbURL = new StringBuilder(BOM_URL);
		sbURL.append(wmoId);
		sbURL.append(JSON_EXT);

		ResponseEntity<Weather> resp = restTemplate.getForEntity(sbURL.toString(), Weather.class);

		Weather obj = resp.getBody();

		return obj.getObservations().getData();
	}

	public List<WeatherDataType> fetchCustomWeatherDataOfTheLocation(String wmoId, String weatherDataType) {
		StringBuilder sbURL = new StringBuilder(BOM_URL);
		sbURL.append(wmoId);
		sbURL.append(JSON_EXT);

		ResponseEntity<Weather> resp = restTemplate.getForEntity(sbURL.toString(), Weather.class);
		Weather obj = resp.getBody();

		List<WeatherData> lstWeatherData = obj.getObservations().getData();

		List<WeatherDataType> lstWthr = lstWeatherData.stream().map(weatherData -> {

			Supplier<WeatherDataTypeFactory> weatherDataTypeFactory = WeatherDataTypeFactory::new;

			try {
				return weatherDataTypeFactory.get().getWeatherDataType(weatherDataType, weatherData);
			} catch (ParseException e) {
				new Exception("Parsing date error");
			}
			return null;
		}).collect(Collectors.toList());

		return lstWthr;
	}

}
