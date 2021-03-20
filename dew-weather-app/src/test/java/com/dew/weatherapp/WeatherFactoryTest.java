package com.dew.weatherapp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import com.dew.weatherapp.model.WeatherData;
import com.dew.weatherapp.model.weatherdto.Temperature;
import com.dew.weatherapp.util.WeatherDataTypeFactory;

class WeatherFactoryTest {

	@Test
	void test() {
		Temperature actualTemp = null;
		Supplier<WeatherDataTypeFactory> weatherDataTypeFactory = WeatherDataTypeFactory::new;
		try {
			WeatherData tstWthrData = new WeatherData();
			tstWthrData.setLocal_date_time_full("20210322000000");
			tstWthrData.setName("Adelaide");
			actualTemp = (Temperature) weatherDataTypeFactory.get().getWeatherDataType("temp", tstWthrData);
		} catch (ParseException e) {
			fail(" WeatherDataUtilTest");
		}
		Temperature expectedTemp = new Temperature();
		expectedTemp.setLocationName("Adelaide");
		assertEquals(expectedTemp.getLocationName(), actualTemp.getLocationName());

	}

}
