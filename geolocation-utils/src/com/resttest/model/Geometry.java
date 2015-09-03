package com.resttest.model;

public class Geometry {
	
	private Location location;
	
	private Viewport bounds;
	
	private String location_type;
	
	private Viewport viewport;

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public String getLocation_type() {
		return location_type;
	}

	public void setLocation_type(String location_type) {
		this.location_type = location_type;
	}

	public Viewport getViewport() {
		return viewport;
	}

	public void setViewport(Viewport viewport) {
		this.viewport = viewport;
	}

	public Viewport getBounds() {
		return bounds;
	}

	public void setBounds(Viewport bounds) {
		this.bounds = bounds;
	}
	
}
