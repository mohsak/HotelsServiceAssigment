
package com.sakkijha.hotel.utilities;

import java.text.DecimalFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneOffset;

import com.sakkijha.hotel.request.ProvidersServiceRequest;

/**
 * @author M.Sakkijha
 */
public class Utilities {

	/**
	 * This is a utility method that will be used 
	 * to convert from Local date to Instant date
	 * 
	 * The Use of this method will be when sending 
	 * request to provider's service that accepts
	 * InstantDate not LocalDate
	 * 
	 * @param localDate : The localDate to be converted
	 * @return : a string representation of the converted date to instant date
	 */
	public static String convertLocalDateToInstant(String localDate){
		LocalDate local = LocalDate.parse(localDate);
		Instant instant = local.atStartOfDay().toInstant(ZoneOffset.UTC);
		return instant.toString();
	}
	
	/**
	 * This method is used to format double numbers
	 * and keep only two decimal points
	 * 
	 * @param number
	 * @return
	 */
	public static double formatDoubleTwoDecimalPoints(double number){
		DecimalFormat formatter = new DecimalFormat("#.00");
		return Double.parseDouble(formatter.format(number));
	}

	/**
	 * This method is meant to call the URL of the provider
	 * and post the request body provider
	 * 
	 * @param url
	 * @param request
	 * @return
	 */
	public static String callURL(String url , ProvidersServiceRequest request){
		return "" ;
	}
	
	
}
