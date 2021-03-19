package com.dew.weatherapp.model.weatherdto;

import java.util.Date;

public class Pressure implements WeatherDataType {

	public int wmo;
	public String locationName;
	public Date obervationTime;
	public double press_qnh;
	public double press_msl;

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

	public double getPress_qnh() {
		return press_qnh;
	}

	public void setPress_qnh(double press_qnh) {
		this.press_qnh = press_qnh;
	}

	public double getPress_msl() {
		return press_msl;
	}

	public void setPress_msl(double press_msl) {
		this.press_msl = press_msl;
	}

	@Override
	public String toString() {
		return "Pressure [wmo=" + wmo + ", locationName=" + locationName + ", obervationTime=" + obervationTime
				+ ", press_qnh=" + press_qnh + ", press_msl=" + press_msl + "]";
	}

}
