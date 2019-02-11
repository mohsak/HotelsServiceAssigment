package com.sakkijha.hotel.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sakkijha.hotel.model.HotelsProvider;
import com.sakkijha.hotel.response.BestHotelServiceResponse;
import com.sakkijha.hotel.response.ServiceResponse;
import com.sakkijha.hotel.services.ServiceCaller;
import com.sakkijha.hotel.utilities.Utilities;

/**
 * @author M.Sakkijha
 * 
 * This service class is used to call provider's service
 * and parse the response and map it into BestHotelServiceResponse
 * Mock data is commented out
 */



@Service("bestHotelServiceCaller")
public class BestHotelServiceCallerImpl implements ServiceCaller{

	public List<? extends ServiceResponse> callProviderURL(HotelsProvider provider){
		List<BestHotelServiceResponse> responseData = null;
//		String responseBody = "[{\"hotel\":\"H 1\",\"hotelRate\":1,\"hotelFare\":72.0,\"roomAmenities\":\"1,2\"},{\"hotel\":\"H 2\",\"hotelRate\":2,\"hotelFare\":122.0,\"roomAmenities\":\"2,3\"},{\"hotel\":\"H 3\",\"hotelRate\":3,\"hotelFare\":172.0,\"roomAmenities\":\"3,4\"},{\"hotel\":\"H 4\",\"hotelRate\":4,\"hotelFare\":222.0,\"roomAmenities\":\"4,5\"},{\"hotel\":\"H 5\",\"hotelRate\":5,\"hotelFare\":272.0,\"roomAmenities\":\"5,6\"}]";
		String responseBody = Utilities.callURL(provider.getUrl() , provider.getRequest());
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			responseData = objectMapper.readValue(responseBody, new TypeReference<List<BestHotelServiceResponse>>(){});
		}catch(Exception e){
			e.printStackTrace();
		}
		return responseData ;
	}	
	
}
