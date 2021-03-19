package com.dew.weatherapp.model.weatherdto;

import java.util.Date;

public class Rain implements WeatherDataType {

	public int wmo;
	public String locationName;
	public Date obervationTime;
	public String rain_trace;

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

	public String getRain_trace() {
		return rain_trace;
	}

	public void setRain_trace(String rain_trace) {
		this.rain_trace = rain_trace;
	}

	@Override
	public String toString() {
		return "Rain [wmo=" + wmo + ", locationName=" + locationName + ", obervationTime=" + obervationTime
				+ ", rain_trace=" + rain_trace + "]";
	}

}
