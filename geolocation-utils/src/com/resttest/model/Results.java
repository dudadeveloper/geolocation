package com.resttest.model;

import java.util.ArrayList;
import java.util.List;

public class Results {

	private List<AddressComponents> address_components;
	
	private String formatted_address;
	
	private Geometry geometry;
	
	private String partial_match;
	
	private String place_id;
	
	private List<String> types = new ArrayList<String>();

	public List<AddressComponents> getAddress_components() {
		return address_components;
	}

	public void setAddress_components(List<AddressComponents> address_components) {
		this.address_components = address_components;
	}

	public String getFormatted_address() {
		return formatted_address;
	}

	public void setFormatted_address(String formatted_address) {
		this.formatted_address = formatted_address;
	}

	public Geometry getGeometry() {
		return geometry;
	}

	public void setGeometry(Geometry geometry) {
		this.geometry = geometry;
	}

	public List<String> getTypes() {
		return types;
	}

	public void setTypes(List<String> types) {
		this.types = types;
	}

	public String getPlace_id() {
		return place_id;
	}

	public void setPlace_id(String place_id) {
		this.place_id = place_id;
	}

	public String getPartial_match() {
		return partial_match;
	}

	public void setPartial_match(String partial_match) {
		this.partial_match = partial_match;
	}
	
	
}
