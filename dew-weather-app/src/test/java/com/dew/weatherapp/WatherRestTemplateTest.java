package com.dew.weatherapp;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.dew.weatherapp.model.Weather;

class WatherRestTemplateTest {
	
	private static RestTemplate restTemplate;
	private static final String bomUrl = "http://www.bom.gov.au/fwo/IDS60901/IDS60901.94672.json";

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		   restTemplate = new RestTemplate();
	}

	@Test
	void testRestTemplateWithBomURL() {
		final ResponseEntity<Weather> response = restTemplate.getForEntity(bomUrl, Weather.class);
		 assertThat(response.getStatusCode(), equalTo(HttpStatus.OK));
	}

}
