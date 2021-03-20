package com.dew.weatherapp.exceptions;

import java.util.Date;

public class ErrorMessages {

	private Date timeStamp;
	private String message;

	public ErrorMessages() {

	}

	public ErrorMessages(Date timeStamp, String message) {
		super();
		this.timeStamp = timeStamp;
		this.message = message;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ErrorMessages [timeStamp=" + timeStamp + ", message=" + message + "]";
	}

}
