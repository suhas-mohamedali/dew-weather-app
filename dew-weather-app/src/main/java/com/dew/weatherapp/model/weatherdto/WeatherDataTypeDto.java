package com.dew.weatherapp.model.weatherdto;

import java.util.List;

public class WeatherDataTypeDto {
	
	/*
	 * List<WeatherDataType> lstWeatherDataType ;
	 * 
	 * public List<WeatherDataType> getLstWeatherDataType() { return
	 * lstWeatherDataType; }
	 * 
	 * public void setLstWeatherDataType(List<WeatherDataType> lstWeatherDataType) {
	 * this.lstWeatherDataType = lstWeatherDataType; }
	 * 
	 * @Override public String toString() { return
	 * "WeatherDataTypeDto [lstWeatherDataType=" + lstWeatherDataType + "]"; }
	 */
	
	
	List <WeatherDataDto> lstWeatherDataDto;

	public List<WeatherDataDto> getLstWeatherDataDto() {
		return lstWeatherDataDto;
	}

	public void setLstWeatherDataDto(List<WeatherDataDto> lstWeatherDataDto) {
		this.lstWeatherDataDto = lstWeatherDataDto;
	}

	
	
	@Override
	public String toString() {
		return "WeatherDataTypeDto [lstWeatherDataDto=" + lstWeatherDataDto + "]";
	}
	
	
	
	
	
	

}
