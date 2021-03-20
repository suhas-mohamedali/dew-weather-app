package com.dew.weatherapp.util;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

import com.dew.weatherapp.model.WeatherData;
import com.dew.weatherapp.model.weatherdto.Humidity;
import com.dew.weatherapp.model.weatherdto.Pressure;
import com.dew.weatherapp.model.weatherdto.Rain;
import com.dew.weatherapp.model.weatherdto.Temperature;
import com.dew.weatherapp.model.weatherdto.WeatherDataType;
import com.dew.weatherapp.model.weatherdto.Wind;

public class WeatherDataTypeFactory {

	private static final String WIND = "wind";
	private static final String PRESSURE = "pressure";
	private static final String RAIN = "rain";
	private static final String HUMID = "humid";
	private static final String TEMP = "temp";
	final static Map<String, Supplier<WeatherDataType>> map = new HashMap<>();

	static {
		map.put(TEMP, Temperature::new);
		map.put(HUMID, Humidity::new);
		map.put(RAIN, Rain::new);
		map.put(PRESSURE, Pressure::new);
		map.put(WIND, Wind::new);
	}

	public WeatherDataType getWeatherDataType(String weatherDataType, WeatherData weatherData) throws ParseException {

		Supplier<WeatherDataType> weatherType = map.get(weatherDataType.toLowerCase());

		if (weatherType != null) {
			if (weatherDataType.equalsIgnoreCase(TEMP)) {
				Temperature temperature = (Temperature) weatherType.get();
				temperature.setWmo(weatherData.getWmo());
				temperature.setLocationName(weatherData.getName());
				temperature.setObervationTime(Util.dateFromString(weatherData.getLocal_date_time_full()));
				temperature.setAir_temp(weatherData.getAir_temp());
				temperature.setApparent_temp(weatherData.getApparent_t());
				temperature.setDelta_temp(weatherData.getDelta_t());
				temperature.setDewpt_temp(weatherData.getDewpt());
				return temperature;
			}
			if (weatherDataType.equalsIgnoreCase(HUMID)) {
				Humidity humidity = (Humidity) weatherType.get();
				humidity.setWmo(weatherData.getWmo());
				humidity.setLocationName(weatherData.getName());
				humidity.setObervationTime(Util.dateFromString(weatherData.getLocal_date_time_full()));
				humidity.setRel_hum(weatherData.getRel_hum());				
				return humidity;
			}
			if (weatherDataType.equalsIgnoreCase(RAIN)) {
				Rain rain = (Rain) weatherType.get();
				rain.setWmo(weatherData.getWmo());
				rain.setLocationName(weatherData.getName());
				rain.setObervationTime(Util.dateFromString(weatherData.getLocal_date_time_full()));
				rain.setRain_trace(weatherData.getRain_trace());
				return rain;
			}
			if (weatherDataType.equalsIgnoreCase(PRESSURE)) {
				Pressure pressure = (Pressure) weatherType.get();
				pressure.setWmo(weatherData.getWmo());
				pressure.setLocationName(weatherData.getName());
				pressure.setObervationTime(Util.dateFromString(weatherData.getLocal_date_time_full()));
				pressure.setPress_msl(weatherData.getPress_msl());
				pressure.setPress_qnh(weatherData.getPress_qnh());
				return pressure;
			}
			if (weatherDataType.equalsIgnoreCase(WIND)) {
				Wind wind = (Wind) weatherType.get();
				wind.setWmo(weatherData.getWmo());
				wind.setLocationName(weatherData.getName());
				wind.setObervationTime(Util.dateFromString(weatherData.getLocal_date_time_full()));
				wind.setWind_dir(weatherData.getWind_dir());
				wind.setGust_kmh(weatherData.getGust_kmh());
				wind.setGust_kt(weatherData.getGust_kt());
				wind.setWind_spd_kmh(weatherData.getWind_spd_kmh());
				wind.setWind_spd_kt(weatherData.getWind_spd_kt());
				return wind;
			}

		}

		throw new IllegalArgumentException("No such weather type parameter :::" + weatherDataType.toLowerCase());
	}

}
