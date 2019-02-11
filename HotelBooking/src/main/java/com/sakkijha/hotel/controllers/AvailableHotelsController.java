
package com.sakkijha.hotel.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sakkijha.hotel.request.ProvidersServiceRequest;
import com.sakkijha.hotel.response.AvailableHotelServiceResponse;
import com.sakkijha.hotel.services.GatewayService;

/**
 * @author M.Sakkijha
 * 
 * This is the entry point of the service, 
 * this controller will accept the request
 * of searching for hotels and will aggreate
 * the result from hotel providers
 * 
 */

@RestController("/AvailableHotel")
public class AvailableHotelsController {

	
	@Autowired
	private GatewayService gatewayService;
	
	@RequestMapping(name="/")
	public @ResponseBody List<AvailableHotelServiceResponse> getHotels(
			@RequestParam String fromDate , @RequestParam String toDate ,
			@RequestParam String city , @RequestParam int numberOfAdults 
			){
		
		ProvidersServiceRequest request = new ProvidersServiceRequest();
		request.setCity(city);
		request.setFromDate(fromDate);
		request.setToDate(toDate);
		request.setNumberOfAdults(numberOfAdults);		
		
		return gatewayService.aggregateHotelProvidersResponses(request) ;
	}
	
	
}
