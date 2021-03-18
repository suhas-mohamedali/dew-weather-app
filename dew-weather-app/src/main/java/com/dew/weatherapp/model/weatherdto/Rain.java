package com.dew.weatherapp.model.weatherdto;

public class Rain implements WeatherDataType{
	
	public String rain_trace;

	public String getRain_trace() {
		return rain_trace;
	}

	public void setRain_trace(String rain_trace) {
		this.rain_trace = rain_trace;
	}

	@Override
	public String toString() {
		return "Rain [rain_trace=" + rain_trace + "]";
	}
	
	

}
