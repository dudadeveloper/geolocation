package com.geoip.rest.client;

import java.io.Serializable;

import javax.ejb.Stateless;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@Stateless
public class GeoIp implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private static final String END_POINT = "https://freegeoip.net/json";

	public GeoIpResponse getGeoLocationByIP(String ip) {
		
		Client client = ClientBuilder.newClient();
		
		GeoIpResponse resposta = client.target(END_POINT + "/" + ip)
				.request(MediaType.APPLICATION_JSON)
				.buildGet()
				.invoke(GeoIpResponse.class);
		
		return resposta;
		
	}
	
}
