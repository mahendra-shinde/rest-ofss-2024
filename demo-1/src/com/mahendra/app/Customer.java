package com.mahendra.app;

import javax.xml.bind.annotation.XmlRootElement;

// POJO : Plain Old Java Object
@XmlRootElement
public class Customer {
	private String custId;
	
	private String firstName;
	private String lastName;
	private String phone;
	
	public Customer() {
	}
	
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
