package com.dew.weatherapp.model.weatherdto;

public class WeatherDataDto {
	
	private  String wmoId ;
	
	private Temperature temperature;
	private Pressure pressure;
	private Wind wind;
	private Rain rain;
	private Humidity humidity;
	
	/*
	 * public WeatherDataDto(String wmoId) { this.wmoId = wmoId; }
	 */
	
    private WeatherDataDto(WeatherDataDtoBuilder builder) {
        this.wmoId = builder.wmoId;
        
        this.temperature = builder.temperature;
        this.wind = builder.wind;
        this.rain = builder.rain;
        this.humidity = builder.humidity;
        this.pressure = builder.pressure;
    }
	
	
	public static class WeatherDataDtoBuilder {
		
		private  String wmoId ;
		
		private Temperature temperature;
		private Pressure pressure;
		private Wind wind;
		private Rain rain;
		private Humidity humidity;
		
		
		
		public WeatherDataDtoBuilder(String wmoId) {
			this.wmoId = wmoId;
		}
		
		public WeatherDataDtoBuilder enterTemperature(Temperature temperature) {
			this.temperature = temperature;
			return this;
		}
		
		public WeatherDataDtoBuilder enterPressure(Pressure pressure) {
			this.pressure = pressure;
			return this;
		}
		
		public WeatherDataDtoBuilder enterWind(Wind wind) {
			this.wind = wind;
			return this;
		}
		
		public WeatherDataDtoBuilder enterHumidity(Humidity humidity) {
			this.humidity = humidity;
			return this;
		}
		
		public WeatherDataDtoBuilder enterRain(Rain rain) {
			this.rain = rain;
			return this;
		}
		
		
		public WeatherDataDto build() {
			return new WeatherDataDto(this);
		}		
		
	}


	public String getWmoId() {
		return wmoId;
	}


	public Temperature getTemperature() {
		return temperature;
	}


	public Pressure getPressure() {
		return pressure;
	}


	public Wind getWind() {
		return wind;
	}


	public Rain getRain() {
		return rain;
	}


	public Humidity getHumidity() {
		return humidity;
	}
	
	

}
