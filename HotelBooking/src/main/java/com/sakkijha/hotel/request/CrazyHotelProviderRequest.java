
package com.sakkijha.hotel.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sakkijha.hotel.utilities.Utilities;

/**
 * @author M.Sakkijha
 * 
 * This is the CrazyHotel service request
 * it extends from the SuperClass @ProvidersServiceRequest 
 * 
 * As the request parameters are different than thos in the super class
 * we forced changing the names by using #JsonProperty annotation
 * 
 * CrazyHotel service accepts date in Instant format so there is a conversion
 * from LocalDate to Instant format with helper utility method @Utilities.convertLocalDateToInstant
 * 
 */
public class CrazyHotelProviderRequest extends ProvidersServiceRequest{

	public CrazyHotelProviderRequest(){
	}
	
	public CrazyHotelProviderRequest(ProvidersServiceRequest request){
		setCity(request.getCity());
		setFromDate(request.getFromDate());
		setToDate(request.getToDate());
		setNumberOfAdults(request.getNumberOfAdults());
	}
	
	@Override
	@JsonProperty(value="from")
	public String getFromDate() {
		return Utilities.convertLocalDateToInstant(super.getFromDate());
	}
	
	@Override
	@JsonProperty(value="to")
	public String getToDate() {
		return Utilities.convertLocalDateToInstant(super.getToDate());
	}
	
	@Override
	@JsonProperty(value="adultsCount")
	public int getNumberOfAdults() {
		return super.getNumberOfAdults();
	}
	
}
