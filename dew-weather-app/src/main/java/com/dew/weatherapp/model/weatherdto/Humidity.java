package com.dew.weatherapp.model.weatherdto;

public class Humidity implements WeatherDataType{
	
	public int rel_hum;

	public int getRel_hum() {
		return rel_hum;
	}

	public void setRel_hum(int rel_hum) {
		this.rel_hum = rel_hum;
	}

	@Override
	public String toString() {
		return "Humidity [rel_hum=" + rel_hum + "]";
	}
	
	

}
