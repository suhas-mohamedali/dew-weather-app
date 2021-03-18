package com.dew.weatherapp.model;

public class WeatherData {

	public int sort_order;
	public int wmo;
	public String name;
	public String history_product;
	public String local_date_time;
	public String local_date_time_full;
	public String aifstime_utc;
	public double lat;
	public double lon;
	public double apparent_t;
	public String cloud;
	public int cloud_base_m;
	public int cloud_oktas;
	public int cloud_type_id;
	public String cloud_type;
	public double delta_t;
	public int gust_kmh;
	public int gust_kt;
	public double air_temp;
	public double dewpt;
	public double press;
	public double press_qnh;
	public double press_msl;
	public String press_tend;
	public String rain_trace;
	public int rel_hum;
	public String sea_state;
	public String swell_dir_worded;
	public Object swell_height;
	public Object swell_period;
	public String vis_km;
	public String weather;
	public String wind_dir;
	public int wind_spd_kmh;
	public int wind_spd_kt;

	public int getSort_order() {
		return sort_order;
	}

	public void setSort_order(int sort_order) {
		this.sort_order = sort_order;
	}

	public int getWmo() {
		return wmo;
	}

	public void setWmo(int wmo) {
		this.wmo = wmo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHistory_product() {
		return history_product;
	}

	public void setHistory_product(String history_product) {
		this.history_product = history_product;
	}

	public String getLocal_date_time() {
		return local_date_time;
	}

	public void setLocal_date_time(String local_date_time) {
		this.local_date_time = local_date_time;
	}

	public String getLocal_date_time_full() {
		return local_date_time_full;
	}

	public void setLocal_date_time_full(String local_date_time_full) {
		this.local_date_time_full = local_date_time_full;
	}

	public String getAifstime_utc() {
		return aifstime_utc;
	}

	public void setAifstime_utc(String aifstime_utc) {
		this.aifstime_utc = aifstime_utc;
	}

	public double getLat() {
		return lat;
	}

	public void setLat(double lat) {
		this.lat = lat;
	}

	public double getLon() {
		return lon;
	}

	public void setLon(double lon) {
		this.lon = lon;
	}

	public double getApparent_t() {
		return apparent_t;
	}

	public void setApparent_t(double apparent_t) {
		this.apparent_t = apparent_t;
	}

	public String getCloud() {
		return cloud;
	}

	public void setCloud(String cloud) {
		this.cloud = cloud;
	}

	public int getCloud_base_m() {
		return cloud_base_m;
	}

	public void setCloud_base_m(int cloud_base_m) {
		this.cloud_base_m = cloud_base_m;
	}

	public int getCloud_oktas() {
		return cloud_oktas;
	}

	public void setCloud_oktas(int cloud_oktas) {
		this.cloud_oktas = cloud_oktas;
	}

	public int getCloud_type_id() {
		return cloud_type_id;
	}

	public void setCloud_type_id(int cloud_type_id) {
		this.cloud_type_id = cloud_type_id;
	}

	public String getCloud_type() {
		return cloud_type;
	}

	public void setCloud_type(String cloud_type) {
		this.cloud_type = cloud_type;
	}

	public double getDelta_t() {
		return delta_t;
	}

	public void setDelta_t(double delta_t) {
		this.delta_t = delta_t;
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

	public double getAir_temp() {
		return air_temp;
	}

	public void setAir_temp(double air_temp) {
		this.air_temp = air_temp;
	}

	public double getDewpt() {
		return dewpt;
	}

	public void setDewpt(double dewpt) {
		this.dewpt = dewpt;
	}

	public double getPress() {
		return press;
	}

	public void setPress(double press) {
		this.press = press;
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

	public String getPress_tend() {
		return press_tend;
	}

	public void setPress_tend(String press_tend) {
		this.press_tend = press_tend;
	}

	public String getRain_trace() {
		return rain_trace;
	}

	public void setRain_trace(String rain_trace) {
		this.rain_trace = rain_trace;
	}

	public int getRel_hum() {
		return rel_hum;
	}

	public void setRel_hum(int rel_hum) {
		this.rel_hum = rel_hum;
	}

	public String getSea_state() {
		return sea_state;
	}

	public void setSea_state(String sea_state) {
		this.sea_state = sea_state;
	}

	public String getSwell_dir_worded() {
		return swell_dir_worded;
	}

	public void setSwell_dir_worded(String swell_dir_worded) {
		this.swell_dir_worded = swell_dir_worded;
	}

	public Object getSwell_height() {
		return swell_height;
	}

	public void setSwell_height(Object swell_height) {
		this.swell_height = swell_height;
	}

	public Object getSwell_period() {
		return swell_period;
	}

	public void setSwell_period(Object swell_period) {
		this.swell_period = swell_period;
	}

	public String getVis_km() {
		return vis_km;
	}

	public void setVis_km(String vis_km) {
		this.vis_km = vis_km;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getWind_dir() {
		return wind_dir;
	}

	public void setWind_dir(String wind_dir) {
		this.wind_dir = wind_dir;
	}

	
	 public int getWind_spd_kmh() { return wind_spd_kmh; } public void
	 setWind_spd_kmh(int wind_spd_kmh) { this.wind_spd_kmh = wind_spd_kmh; }
	 
	public int getWind_spd_kt() {
		return wind_spd_kt;
	}

	public void setWind_spd_kt(int wind_spd_kt) {
		this.wind_spd_kt = wind_spd_kt;
	}

	@Override
	public String toString() {
		return "WeatherData [sort_order=" + sort_order + ", wmo=" + wmo + ", name=" + name + ", history_product="
				+ history_product + ", local_date_time=" + local_date_time + ", local_date_time_full="
				+ local_date_time_full + ", aifstime_utc=" + aifstime_utc + ", lat=" + lat + ", lon=" + lon
				+ ", apparent_t=" + apparent_t + ", cloud=" + cloud + ", cloud_base_m=" + cloud_base_m
				+ ", cloud_oktas=" + cloud_oktas + ", cloud_type_id=" + cloud_type_id + ", cloud_type=" + cloud_type
				+ ", delta_t=" + delta_t + ", gust_kmh=" + gust_kmh + ", gust_kt=" + gust_kt + ", air_temp=" + air_temp
				+ ", dewpt=" + dewpt + ", press=" + press + ", press_qnh=" + press_qnh + ", press_msl=" + press_msl
				+ ", press_tend=" + press_tend + ", rain_trace=" + rain_trace + ", rel_hum=" + rel_hum + ", sea_state="
				+ sea_state + ", swell_dir_worded=" + swell_dir_worded + ", swell_height=" + swell_height
				+ ", swell_period=" + swell_period + ", vis_km=" + vis_km + ", weather=" + weather + ", wind_dir="
				+ wind_dir + ", wind_spd_kmh=" + wind_spd_kmh + ", wind_spd_kt=" + wind_spd_kt + "]";
	}

	
	



}
