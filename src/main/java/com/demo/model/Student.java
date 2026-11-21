package com.demo.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private int id;
	private String name;
	private String city;
	private double percentage;
	private Map<String, Collection> details = new HashMap<>();

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", percentage=" + percentage + ", details="
				+ details + "]";
	}

	public Map<String, Collection> getDetails() {
		return details;
	}

	public void setDetails(Map<String, Collection> details) {
		this.details = details;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}
