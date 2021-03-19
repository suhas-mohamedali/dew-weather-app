package com.dew.weatherapp;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.util.Date;

import org.junit.jupiter.api.Test;

import com.dew.weatherapp.util.Util;

class DateUtilTest {

	@Test
	void test() {
		
		String strDate =
				  "20210322000000";
				 
				 Date ss = new Date();
				try {
					ss = Util.dateFromString(strDate);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 
				 System.out.println(ss);
				 
		fail("Not yet implemented");
	}

}
