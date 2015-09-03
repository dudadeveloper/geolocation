package com.geoip;

import java.io.Serializable;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.geoip.rest.client.GeoIp;
import com.geoip.rest.client.GeoIpResponse;
import com.resttest.model.Result;

@Named
@ViewScoped
public class RestBean implements Serializable {
	
	private static final Logger logger = Logger.getLogger(RestBean.class.getName());
	
	private static final long serialVersionUID = 2382727548098915344L;

	@EJB
	private GoogleGeocoding googleGeocoding;
	
	@EJB
	private GeoIp geoIp;
	
	private String enderecoOrigem;
	
	private String enderecoDestino;
	
	private Result origem;
	
	private Result destino;
	
	private Integer distancia;
	
	public void buscar() {
		
		origem = googleGeocoding.getLocation(enderecoOrigem);
		
		destino = googleGeocoding.getLocation(enderecoDestino);
				
	}
	
	public void calulateDistancia() { 
		
		distancia = (int)GeoUtils.distanceBetweenTwoLocationsInKm(origem.getResults().get(0).getGeometry().getLocation().getLat(), origem.getResults().get(0).getGeometry().getLocation().getLng(), 
				destino.getResults().get(0).getGeometry().getLocation().getLat(), destino.getResults().get(0).getGeometry().getLocation().getLng());

	}
	
	public void geoIp() {
		
		GeoIpResponse response = geoIp.getGeoLocationByIP("187.3.165.74");
		
		logger.info(response.getCity());
		logger.info(response.getRegion_code());
	}

	public GoogleGeocoding getGoogleGeocoding() {
		return googleGeocoding;
	}

	public void setGoogleGeocoding(GoogleGeocoding googleGeocoding) {
		this.googleGeocoding = googleGeocoding;
	}

	public String getEnderecoOrigem() {
		return enderecoOrigem;
	}

	public void setEnderecoOrigem(String enderecoOrigem) {
		this.enderecoOrigem = enderecoOrigem;
	}

	public String getEnderecoDestino() {
		return enderecoDestino;
	}

	public void setEnderecoDestino(String enderecoDestino) {
		this.enderecoDestino = enderecoDestino;
	}

	public Result getOrigem() {
		return origem;
	}

	public void setOrigem(Result origem) {
		this.origem = origem;
	}

	public Result getDestino() {
		return destino;
	}

	public void setDestino(Result destino) {
		this.destino = destino;
	}

	public Integer getDistancia() {
		return distancia;
	}

	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}
	
}
