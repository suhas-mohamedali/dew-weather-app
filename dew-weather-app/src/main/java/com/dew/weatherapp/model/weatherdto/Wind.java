package com.dew.weatherapp.model.weatherdto;

public class Wind implements WeatherDataType{
	
	public int wmo;
	public String wind_dir;
    public int wind_spd_kmh;
    public int wind_spd_kt;
    public int gust_kmh;
    public int gust_kt;
	public int getWmo() {
		return wmo;
	}
	public void setWmo(int wmo) {
		this.wmo = wmo;
	}
	public String getWind_dir() {
		return wind_dir;
	}
	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}
	public int getWind_spd_kmh() {
		return wind_spd_kmh;
	}
	public void setWind_spd_kmh(int wind_spd_kmh) {
		this.wind_spd_kmh = wind_spd_kmh;
	}
	public int getWind_spd_kt() {
		return wind_spd_kt;
	}
	public void setWind_spd_kt(int wind_spd_kt) {
		this.wind_spd_kt = wind_spd_kt;
	}
	public int getGust_kmh() {
		return gust_kmh;
	}
	public void setGust_kmh(int gust_kmh) {
		this.gust_kmh = gust_kmh;
	}
	public int getGust_kt() {
		return gust_kt;
	}
	public void setGust_kt(int gust_kt) {
		this.gust_kt = gust_kt;
	}
	
	
	@Override
	public String toString() {
		return "Wind [wmo=" + wmo + ", wind_dir=" + wind_dir + ", wind_spd_kmh=" + wind_spd_kmh + ", wind_spd_kt="
				+ wind_spd_kt + ", gust_kmh=" + gust_kmh + ", gust_kt=" + gust_kt + "]";
	}
    
    
  

}
