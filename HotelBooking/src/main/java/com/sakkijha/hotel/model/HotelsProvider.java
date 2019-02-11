
package com.sakkijha.hotel.model;

import com.sakkijha.hotel.request.ProvidersServiceRequest;

/**
 * @author M.Sakkijha
 * This model class holds the general properties for hotel providers
 */
public class HotelsProvider {

	private String name;
	private String url;
	private Class<?> responseClass;
	private ProvidersServiceRequest request;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public Class<?> getResponseClass() {
		return responseClass;
	}

	public void setResponseClass(Class<?> responseClass) {
		this.responseClass = responseClass;
	}

	public ProvidersServiceRequest getRequest() {
		return request;
	}

	public void setRequest(ProvidersServiceRequest request) {
		this.request = request;
	}
	
}
