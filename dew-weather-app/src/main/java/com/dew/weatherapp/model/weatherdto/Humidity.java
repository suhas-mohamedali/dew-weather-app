package com.dew.weatherapp.model.weatherdto;

import java.util.Date;

public class Humidity implements WeatherDataType {

	public int wmo;
	public String locationName;
	public Date obervationTime;
	public int rel_hum;

	public int getWmo() {
		return wmo;
	}

	public void setWmo(int wmo) {
		this.wmo = wmo;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public Date getObervationTime() {
		return obervationTime;
	}

	public void setObervationTime(Date obervationTime) {
		this.obervationTime = obervationTime;
	}

	public int getRel_hum() {
		return rel_hum;
	}

	public void setRel_hum(int rel_hum) {
		this.rel_hum = rel_hum;
	}

	@Override
	public String toString() {
		return "Humidity [wmo=" + wmo + ", locationName=" + locationName + ", obervationTime=" + obervationTime
				+ ", rel_hum=" + rel_hum + "]";
	}

}
