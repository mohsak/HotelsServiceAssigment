
package com.sakkijha.hotel.response;

/**
 * @author M.Sakkijha
 * This class represents the response object
 * from BestHotel provider 
 */

public class BestHotelServiceResponse extends ServiceResponse{

	private String hotel;
	private int hotelRate;
	private double hotelFare;
	private String roomAmenities;
	
	
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public int getHotelRate() {
		return hotelRate;
	}
	public void setHotelRate(int hotelRate) {
		this.hotelRate = hotelRate;
	}
	public double getHotelFare() {
		return hotelFare;
	}
	public void setHotelFare(double hotelFare) {
		this.hotelFare = hotelFare;
	}
	public String getRoomAmenities() {
		return roomAmenities;
	}
	public void setRoomAmenities(String roomAmenities) {
		this.roomAmenities = roomAmenities;
	}
	
}
