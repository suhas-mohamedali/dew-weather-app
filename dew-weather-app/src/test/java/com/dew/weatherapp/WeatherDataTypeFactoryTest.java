package com.dew.weatherapp;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.Date;
import java.util.function.Supplier;

import org.junit.jupiter.api.Test;

import com.dew.weatherapp.model.weatherdto.WeatherDataType;
import com.dew.weatherapp.util.Util;
import com.dew.weatherapp.util.WeatherDataTypeFactory;

class WeatherDataUtilTest {

	@Test
	void test() {
		
		Supplier<WeatherDataTypeFactory> weatherDataTypeFactory = WeatherDataTypeFactory :: new;
		//WeatherDataType type = weatherDataTypeFactory.get().getWeatherDataType("temp");
		
		//System.out.println(type);
		
		//fail("Not yet implemented");
	}
	
	
	/*
	 * @Test void testDate() throws ParseException { String strDate =
	 * "20210320000000";
	 * 
	 * Date ss = Util.dateFromString(strDate);
	 * 
	 * System.out.println();
	 * 
	 * }
	 */

}
