
package com.sakkijha.hotel.response;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author M.Sakkijha
 * 
 * This class represents the response for the API call
 * to AvailableHotel service, it encapsulate all properties
 * Implementation of the comparable is introduced in order to
 * sort the data for the response according to the rating of the hotel
 * here I encapsulate rate property inside order
 */
public class AvailableHotelServiceResponse implements Comparable<AvailableHotelServiceResponse>{

	private String provider;
	private String hotelName;
	private double fare;
	private String[] amenities;
	
	@JsonIgnore
	private int order;
	
	public String getProvider() {
		return provider;
	}
	public void setProvider(String provider) {
		this.provider = provider;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public double getFare() {
		return fare;
	}
	public void setFare(double fare) {
		this.fare = fare;
	}
	public String[] getAmenities() {
		return amenities;
	}
	public void setAmenities(String[] amenities) {
		this.amenities = amenities;
	}
	public int getOrder() {
		return order;
	}
	public void setOrder(int order) {
		this.order = order;
	}

	@Override
	public int compareTo(AvailableHotelServiceResponse o) {
		if(order > o.order){
			return -1 ;
		}else if(order < o.order){
			return 1 ;
		}else{
			return 0;
		}
	}

	
	
}
