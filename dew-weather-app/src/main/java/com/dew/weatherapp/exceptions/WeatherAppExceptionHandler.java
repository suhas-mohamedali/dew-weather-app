package com.dew.weatherapp.exceptions;

import java.util.Date;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class WeatherAppExceptionHandler {
	
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<Object> handleWeatherAppServiceException(Exception ex, WebRequest request){
		
		ErrorMessages errorMessages = new ErrorMessages(new Date(), ex.getMessage());
		
		return new ResponseEntity<>(errorMessages, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
		
		
	}
	

}
