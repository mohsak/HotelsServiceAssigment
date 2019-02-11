
package com.sakkijha.hotel.model;

import com.sakkijha.hotel.request.CrazyHotelProviderRequest;
import com.sakkijha.hotel.request.ProvidersServiceRequest;
import com.sakkijha.hotel.response.CrazyHotelServiceResponse;


/**
 * @author M.Sakkijha
 * This model class holds the properties of CrazyHotel provider
 * As CrazyHotel provider's request is different than AvailableHotels request
 * an overridden method for preparing the call request is introduced below
 */
public class CrazyHotelProvider extends HotelsProvider {

	public static final String PROVIDER_NAME = "CrazyHotels" ;
	
	@Override
	public String getName(){
		return PROVIDER_NAME ;
	}
	
	@Override
	public String getUrl(){
		return "http://localhost:8080/CrazyHotels/" ;
	}
	
	@Override
	public Class<?> getResponseClass(){
		return CrazyHotelServiceResponse.class;
	}	
	
	/**
	 * Override the super getRequest() method
	 * to convert the request to CrazyHotel request format
	 */
	@Override
	public ProvidersServiceRequest getRequest(){
		return new CrazyHotelProviderRequest(super.getRequest());	
	}
	
}
