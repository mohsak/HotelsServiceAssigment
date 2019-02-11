package com.sakkijha.hotel.services.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sakkijha.hotel.converters.BestHotelToAvailableHotelResponseConverter;
import com.sakkijha.hotel.converters.CrazyHotelToAvailableHotelResponseConverter;
import com.sakkijha.hotel.model.BestHotelProvider;
import com.sakkijha.hotel.model.CrazyHotelProvider;
import com.sakkijha.hotel.model.HotelsProvider;
import com.sakkijha.hotel.request.ProvidersServiceRequest;
import com.sakkijha.hotel.response.AvailableHotelServiceResponse;
import com.sakkijha.hotel.response.ServiceResponse;
import com.sakkijha.hotel.services.GatewayService;
import com.sakkijha.hotel.services.ServiceCaller;




/**
 * @author M.Sakkijha
 * 
 * In this service a call to provider's URL is issued 
 * sending the formatted request , after the response
 * is returned from provider's service it will be converted
 * to the format of AvailableHotel service which represents
 * the end result
 * 
 * If new provider is available a new custom service caller is needed 
 * and a new converter for the response as well as a model extending
 * HotelsProvider class
 * 
 */
@Service("gatewayService")
public class GatewayServiceImpl implements GatewayService{

	@Autowired 
	private ServiceCaller bestHotelServiceCaller ;
	@Autowired 
	private ServiceCaller crazyHotelServiceCaller ;

	@Autowired
	private BestHotelToAvailableHotelResponseConverter bestConverter;
	@Autowired
	private CrazyHotelToAvailableHotelResponseConverter crazyConverter;
	
	public List<AvailableHotelServiceResponse> aggregateHotelProvidersResponses(ProvidersServiceRequest request){
		List<AvailableHotelServiceResponse> data = new ArrayList<AvailableHotelServiceResponse>();
		
		HotelsProvider best = new BestHotelProvider();
		best.setRequest(request);
		HotelsProvider crazy = new CrazyHotelProvider();
		crazy.setRequest(request);
		
		List<? extends ServiceResponse> bestHotelsResponse = bestHotelServiceCaller.callProviderURL(best);
		List<? extends ServiceResponse> crazyHotelsResponse = crazyHotelServiceCaller.callProviderURL(crazy);
		if(bestHotelsResponse != null){
			data.addAll( bestConverter.convert(bestHotelsResponse) );
		}
		if(crazyHotelsResponse != null){
			data.addAll(crazyConverter.convert(crazyHotelsResponse));
		}
		
		Collections.sort(data);
		return data;
	}
	
	
}
