package com.sakkijha.hotel.services;

import java.util.List;

import com.sakkijha.hotel.request.ProvidersServiceRequest;
import com.sakkijha.hotel.response.AvailableHotelServiceResponse;


/**
 * @author M.Sakkijha
 */
public interface GatewayService {

	public List<AvailableHotelServiceResponse> aggregateHotelProvidersResponses(ProvidersServiceRequest request);
	
}
