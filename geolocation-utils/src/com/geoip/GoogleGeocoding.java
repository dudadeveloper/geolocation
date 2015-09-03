package com.geoip;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

import com.resttest.model.Result;

@Stateless
public class GoogleGeocoding implements Serializable {
	
	private static final long serialVersionUID = -9063404513452287509L;
	
	private static final String END_POINT = "http://maps.googleapis.com/maps/api/geocode/json";
	private static final String DEFAULT_PARAMETERS = "?sensor=false&country=BR&language=pt-BR";

	public Result getLocation(String address) {
		
		Client client = ClientBuilder.newClient();
		
		Result resposta = client.target(END_POINT + DEFAULT_PARAMETERS + "&address="+address)
				.request(MediaType.APPLICATION_JSON)
				.buildGet()
				.invoke(Result.class); 
		
		return resposta;
		
	}
	
}
