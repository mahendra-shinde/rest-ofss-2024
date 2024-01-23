package com.mahendra.app;

import java.util.LinkedList;
import java.util.List;

public class CustomerDOA {

	private static int counter = 0;
	
	private List<Customer> customers;
	
	public CustomerDOA() {
		customers = new LinkedList<>();
		newCustomer("Vishal", "Devgan", "657657657");
		newCustomer("Rajiv", "Bhatia", "6657657");
	}
	
	public Customer newCustomer(String firstName, String lastName, String phone) {
		Customer temp = new Customer();
		temp.setFirstName(firstName);
		temp.setLastName(lastName);
		temp.setPhone(phone);
		temp.setCustId("C"+ (++CustomerDOA.counter));
		customers.add(temp);
		
		return temp;
	}
	
	
	public Customer findById(String id) {
		for(Customer c : customers) {
			if ( c.getCustId().equalsIgnoreCase(id)) {
				return c;
			}
		}
		return null;
	}
	
	public Customer deleteById(String id) {
		Customer temp = findById(id);
		if(temp != null ) {
			customers.remove(temp);		
		}
		return temp;
	}
	
	public Customer update(Customer newCustomer) {
		Customer temp = findById(newCustomer.getCustId());
		if(temp != null)
		{
			temp.setFirstName(newCustomer.getFirstName());
			temp.setLastName(newCustomer.getLastName());
			temp.setPhone(newCustomer.getPhone());
		}
		return temp;
	}
	
}
