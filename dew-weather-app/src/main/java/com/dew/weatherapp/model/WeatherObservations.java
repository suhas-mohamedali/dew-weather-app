package com.dew.weatherapp.model;

import java.util.List;

public class WeatherObservations {
	
	public List<WeatherNotice> notice;
    public List<WeatherHeader> header;
    public List<WeatherData> data;
    
	public List<WeatherNotice> getNotice() {
		return notice;
	}
	public void setNotice(List<WeatherNotice> notice) {
		this.notice = notice;
	}
	public List<WeatherHeader> getHeader() {
		return header;
	}
	public void setHeader(List<WeatherHeader> header) {
		this.header = header;
	}
	public List<WeatherData> getData() {
		return data;
	}
	public void setData(List<WeatherData> data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "WeatherObservations [notice=" + notice + ", header=" + header + ", data=" + data + "]";
	}
    
    

}
