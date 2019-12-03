package com.cognizant.truyum.util;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.*;
public class DateUtil{
	
	public static Date convertToDate(String date) throws ParseException 
	{
		return new SimpleDateFormat("dd/MM/yyyy").parse(date);
	}
}
