
package com.sakkijha.hotel.model;

import com.sakkijha.hotel.response.BestHotelServiceResponse;

/**
 * @author M.Sakkijha
 * This model class holds the properties of BestHotel provider
 * 
 */
public class BestHotelProvider extends HotelsProvider {
	
	public static final String PROVIDER_NAME = "BestHotel" ;
	
	
	@Override
	public String getName(){
		return PROVIDER_NAME ;
	}
	
	@Override
	public String getUrl(){
		return "http://localhost:8080/BestHotel/" ;
	}
	
	@Override
	public Class<?> getResponseClass(){
		return BestHotelServiceResponse.class;
	}

	
}
