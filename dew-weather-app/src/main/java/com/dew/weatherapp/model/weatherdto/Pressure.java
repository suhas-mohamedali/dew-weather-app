package com.dew.weatherapp.model.weatherdto;

public class Pressure implements WeatherDataType{
	
    public double press_qnh;
    public double press_msl;
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
		return "Pressure [press_qnh=" + press_qnh + ", press_msl=" + press_msl + "]";
	}
    
    
	
	

}
