
package com.sakkijha.hotel.request;

/**
 * @author M.Sakkijha
 * 
 * This class represents the Basic Provider Service Request
 * All providers request's can extend this class if they have 
 * the basic properties listed in it
 * 
 * If the provider request differs from this request skeleton
 * then the sub-class can have any new/renamed properties 
 * 
 */
public class ProvidersServiceRequest {

	private String city;
	private String fromDate;
	private String toDate;
	private int numberOfAdults;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getFromDate() {
		return fromDate;
	}
	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}
	public String getToDate() {
		return toDate;
	}
	public void setToDate(String toDate) {
		this.toDate = toDate;
	}
	public int getNumberOfAdults() {
		return numberOfAdults;
	}
	public void setNumberOfAdults(int numberOfAdults) {
		this.numberOfAdults = numberOfAdults;
	}
}
