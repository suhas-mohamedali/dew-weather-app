package com.dew.weatherapp.model.weatherdto;

import java.util.Date;

public class Temperature implements WeatherDataType {

	public int wmo;
	public String locationName;
	public Date obervationTime;
	public double air_temp;
	public double delta_temp;
	public double apparent_temp;
	public double dewpt_temp;

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

	public double getAir_temp() {
		return air_temp;
	}

	public void setAir_temp(double air_temp) {
		this.air_temp = air_temp;
	}

	public double getDelta_temp() {
		return delta_temp;
	}

	public void setDelta_temp(double delta_temp) {
		this.delta_temp = delta_temp;
	}

	public double getApparent_temp() {
		return apparent_temp;
	}

	public void setApparent_temp(double apparent_temp) {
		this.apparent_temp = apparent_temp;
	}

	public double getDewpt_temp() {
		return dewpt_temp;
	}

	public void setDewpt_temp(double dewpt_temp) {
		this.dewpt_temp = dewpt_temp;
	}

	@Override
	public String toString() {
		return "Temperature [wmo=" + wmo + ", locationName=" + locationName + ", obervationTime=" + obervationTime
				+ ", air_temp=" + air_temp + ", delta_temp=" + delta_temp + ", apparent_temp=" + apparent_temp
				+ ", dewpt_temp=" + dewpt_temp + "]";
	}

}
