package com.dew.weatherapp.util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.dew.weatherapp.model.weatherdto.Humidity;
import com.dew.weatherapp.model.weatherdto.Pressure;
import com.dew.weatherapp.model.weatherdto.Rain;
import com.dew.weatherapp.model.weatherdto.Temperature;
import com.dew.weatherapp.model.weatherdto.WeatherDataType;
import com.dew.weatherapp.model.weatherdto.Wind;

public class WeatherDataTypeFactory {

	final static Map<String, Supplier<WeatherDataType>> map = new HashMap<>();

	static {
		map.put("temp", Temperature::new);
		map.put("humid", Humidity::new);
		map.put("rain", Rain::new);
		map.put("pressure", Pressure::new);
		map.put("wind", Wind::new);
	}

	public WeatherDataType getWeatherDataType(String weatherDataType) {

		Supplier<WeatherDataType> weatherType = map.get(weatherDataType.toLowerCase());

		if (weatherType != null) {
			return weatherType.get();
		}

		throw new IllegalArgumentException("No such weather type parameter :::" + weatherDataType.toLowerCase());
	}

}
