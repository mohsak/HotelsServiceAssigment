
package com.sakkijha.hotel.converters;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sakkijha.hotel.model.CrazyHotelProvider;
import com.sakkijha.hotel.response.AvailableHotelServiceResponse;
import com.sakkijha.hotel.response.CrazyHotelServiceResponse;
import com.sakkijha.hotel.response.ServiceResponse;

/**
 * @author M.Sakkijha
 * This component class represents a converter
 * to convert response from CrazyHotel provider
 * into the general response of the requested service AvailableHotels * 
 */
@Component("crazyConverter")
public class CrazyHotelToAvailableHotelResponseConverter {

	public List<AvailableHotelServiceResponse> convert(List<? extends ServiceResponse> crazyResponse) {
		if(crazyResponse == null){
			return null ;
		}
		List<AvailableHotelServiceResponse> result = new ArrayList<AvailableHotelServiceResponse>();
		for(ServiceResponse crazy : crazyResponse){
			AvailableHotelServiceResponse response = new AvailableHotelServiceResponse();
			response.setAmenities(((CrazyHotelServiceResponse)crazy).getAmenities());
			response.setFare(((CrazyHotelServiceResponse)crazy).getPrice() - ((CrazyHotelServiceResponse)crazy).getDiscount());
			response.setHotelName(((CrazyHotelServiceResponse)crazy).getHotelName());
			response.setOrder(((CrazyHotelServiceResponse)crazy).getRate() != null ? ((CrazyHotelServiceResponse)crazy).getRate().length() : 1); // setting the default rating to be 1 if no rating provided
			response.setProvider(CrazyHotelProvider.PROVIDER_NAME);
			result.add(response);
		}
		return result;
	}

}
