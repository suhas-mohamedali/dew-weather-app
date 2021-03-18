package com.dew.weatherapp.model.weatherdto;

public class Temperature implements WeatherDataType{
	
	 public double air_temp;
	 public double delta_t;
	 public double apparent_t;
	 public double dewpt;
	public double getAir_temp() {
		return air_temp;
	}
	public void setAir_temp(double air_temp) {
		this.air_temp = air_temp;
	}
	public double getDelta_t() {
		return delta_t;
	}
	public void setDelta_t(double delta_t) {
		this.delta_t = delta_t;
	}
	public double getApparent_t() {
		return apparent_t;
	}
	public void setApparent_t(double apparent_t) {
		this.apparent_t = apparent_t;
	}
	public double getDewpt() {
		return dewpt;
	}
	public void setDewpt(double dewpt) {
		this.dewpt = dewpt;
	}
	@Override
	public String toString() {
		return "Temperature [air_temp=" + air_temp + ", delta_t=" + delta_t + ", apparent_t=" + apparent_t + ", dewpt="
				+ dewpt + "]";
	}
	 
	 
	
	
	 

}
