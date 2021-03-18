package com.dew.weatherapp.mock;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.dew.weatherapp.model.Weather;
import com.dew.weatherapp.model.WeatherData;

@RunWith(MockitoJUnitRunner.class)
public class WeatherAppServiceUnitTest {

	private static final Logger logger = LoggerFactory.getLogger(WeatherAppServiceUnitTest.class);

	//@Mock
	private RestTemplate restTemplate = new RestTemplate();

	//@InjectMocks
	//private WeatherAppService weatherAppService = new WeatherAppService();

	@Test
	void testIfWeatherObjectIsReturnedByService() {
		
		Weather weatherTestData = new Weather();
		WeatherData ww = new WeatherData();
		
		
		Mockito.when(restTemplate.getForEntity("http://www.bom.gov.au/fwo/IDS60901/IDS60901.94672.json", Weather.class)).thenReturn(new ResponseEntity<Weather>(weatherTestData, HttpStatus.OK));
		
		/*
		 * ResponseEntity<Weather> resp = restTemplate.getForEntity(
		 * "http://www.bom.gov.au/fwo/IDS60901/IDS60901.94672.json", Weather.class);
		 * Weather obj = resp.getBody();
		 * 
		 * System.out.println(obj.getObservations().getData());
		 */
		
		
		//fail("Not yet implemented");
	}

}
