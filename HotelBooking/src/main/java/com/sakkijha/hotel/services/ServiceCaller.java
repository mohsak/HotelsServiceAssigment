
package com.sakkijha.hotel.services;

import java.util.List;

import com.sakkijha.hotel.model.HotelsProvider;
import com.sakkijha.hotel.response.ServiceResponse;

/**
 * @author M.Sakkijha
 */


public interface ServiceCaller {
	
	public List<? extends ServiceResponse> callProviderURL(HotelsProvider provider);
	
}
