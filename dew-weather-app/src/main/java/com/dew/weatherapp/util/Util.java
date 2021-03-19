package com.dew.weatherapp.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Util {
	
	 public static final SimpleDateFormat DATE_TIME_FORMAT = new SimpleDateFormat("yyyyMMddHHmmss");
	
	
    public static Date dateFromString(String source) throws ParseException {
       // SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return DATE_TIME_FORMAT.parse(source);
    }

}
