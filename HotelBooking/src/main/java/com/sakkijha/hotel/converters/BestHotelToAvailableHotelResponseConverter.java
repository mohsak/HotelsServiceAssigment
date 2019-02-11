
package com.sakkijha.hotel.converters;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sakkijha.hotel.model.BestHotelProvider;
import com.sakkijha.hotel.response.AvailableHotelServiceResponse;
import com.sakkijha.hotel.response.BestHotelServiceResponse;
import com.sakkijha.hotel.response.ServiceResponse;
import com.sakkijha.hotel.utilities.Utilities;

/**
 * @author M.Sakkijha
 * 
 * This component class represents a converter
 * to convert response from BestHotel provider
 * into the general response of the requested service AvailableHotels
 * 
 */

@Component("bestConverter")
public class BestHotelToAvailableHotelResponseConverter {

	public List<AvailableHotelServiceResponse> convert(List<? extends ServiceResponse> bestHotelResponse) {
		if(bestHotelResponse == null){
			return null ;
		}
		List<AvailableHotelServiceResponse> result = new ArrayList<AvailableHotelServiceResponse>();
		for(ServiceResponse bestResponse : bestHotelResponse){
			AvailableHotelServiceResponse response = new AvailableHotelServiceResponse();
			response.setAmenities(((BestHotelServiceResponse)bestResponse).getRoomAmenities() != null ? ((BestHotelServiceResponse)bestResponse).getRoomAmenities().split(",") : null);
			response.setFare( Utilities.formatDoubleTwoDecimalPoints(((BestHotelServiceResponse)bestResponse).getHotelFare()) );
			response.setHotelName(((BestHotelServiceResponse)bestResponse).getHotel());
			response.setOrder(((BestHotelServiceResponse)bestResponse).getHotelRate());
			response.setProvider(BestHotelProvider.PROVIDER_NAME);
			result.add(response);
		}
		return result;
	}

}
