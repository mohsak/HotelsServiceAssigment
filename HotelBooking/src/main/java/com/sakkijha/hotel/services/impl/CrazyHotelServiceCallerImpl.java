package com.sakkijha.hotel.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sakkijha.hotel.model.HotelsProvider;
import com.sakkijha.hotel.response.CrazyHotelServiceResponse;
import com.sakkijha.hotel.response.ServiceResponse;
import com.sakkijha.hotel.services.ServiceCaller;
import com.sakkijha.hotel.utilities.Utilities;

/**
 * @author M.Sakkijha
 * 
 * This service class is used to call provider's service
 * and parse the response and map it into @CrazyHotelServiceResponse
 * Mock data is commented out
 */

@Service("crazyHotelServiceCaller")
public class CrazyHotelServiceCallerImpl implements ServiceCaller{

	public List<? extends ServiceResponse> callProviderURL(HotelsProvider provider){
		List<CrazyHotelServiceResponse> responseData = null;
//		String responseBody = "[{\"hotelName\":\"Hi 1\",\"rate\":\"***\",\"price\":72.0,\"discount\":0.2,\"amenities\":null},{\"hotelName\":\"Hi 2\",\"rate\":\"***\",\"price\":122.0,\"discount\":0.4,\"amenities\":null},{\"hotelName\":\"Hi 3\",\"rate\":\"***\",\"price\":172.0,\"discount\":0.6000000000000001,\"amenities\":null},{\"hotelName\":\"Hi 4\",\"rate\":\"***\",\"price\":222.0,\"discount\":0.8,\"amenities\":null},{\"hotelName\":\"Hi 5\",\"rate\":\"***\",\"price\":272.0,\"discount\":1.0,\"amenities\":null}]" ;
		String responseBody = Utilities.callURL(provider.getUrl() , provider.getRequest());
		try{
			ObjectMapper objectMapper = new ObjectMapper();
			responseData = objectMapper.readValue(responseBody, new TypeReference<List<CrazyHotelServiceResponse>>(){});
		}catch(Exception e){
			e.printStackTrace();
		}
		return responseData ;
	}	

}
