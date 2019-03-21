package com.xworkz.custom.util;

import java.text.SimpleDateFormat;

import com.xworkz.custom.constants.ApplicationCanstants;

public class ApplicationUtil {
	
	public static SimpleDateFormat getSimpleDateFormat()
	{
		return new SimpleDateFormat(ApplicationCanstants.DATE_FORMATE);
		
	}
}
