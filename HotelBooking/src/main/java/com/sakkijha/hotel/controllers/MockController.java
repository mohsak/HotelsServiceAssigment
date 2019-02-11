package com.sakkijha.hotel.controllers;

import java.util.ArrayList;
import java.util.List;

import com.sakkijha.hotel.response.BestHotelServiceResponse;
import com.sakkijha.hotel.response.CrazyHotelServiceResponse;

/**
 * @author M.Sakkijha
 * 
 * This is only a mock class used to generate 
 * mock response of calling provider's API 
 * 
 */

public class MockController {
	
	public List<BestHotelServiceResponse> getBestHotels(){
		List<BestHotelServiceResponse> hotels = new ArrayList<BestHotelServiceResponse>();
		BestHotelServiceResponse hotel = null ;
		for(int i=1;i<=5;i++){
			hotel = new BestHotelServiceResponse();
			hotel.setHotel("H " + i);
			hotel.setHotelFare(i*50+22);
			hotel.setHotelRate(i);
			hotel.setRoomAmenities(i+","+(i+1));
			hotels.add(hotel);
		}
		return hotels;
	}
	
	public List<CrazyHotelServiceResponse> getCrazyHotels(){
		List<CrazyHotelServiceResponse> hotels = new ArrayList<CrazyHotelServiceResponse>();
		CrazyHotelServiceResponse hotel = null ;
		for(int i=1;i<=5;i++){
			hotel = new CrazyHotelServiceResponse();
			hotel.setHotelName("H " + i);
			hotel.setPrice(i*50+22);
			hotel.setRate("***");
			hotel.setAmenities(null);
			hotel.setDiscount(i*0.2);
			hotels.add(hotel);
		}
		return hotels;
	}

}
