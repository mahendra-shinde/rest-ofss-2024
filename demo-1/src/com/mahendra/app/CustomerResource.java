package com.mahendra.app;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/customer")
@Produces({"application/xml","application/json"})
public class CustomerResource {

	static {
		dao = new CustomerDOA();
	}
	
	private static final  CustomerDOA dao ;
	
	@GET @Path("/{id}")
	public Customer findCustomer(@PathParam("id") String id) {
		return dao.findById(id);
	}
	
	@POST
	@Consumes("application/json")
	public Customer add(Customer customer) {
		return dao.newCustomer(customer.getFirstName(), customer.getLastName(), customer.getPhone());
	}
	
	@DELETE
	@Path("/{id}")
	public Customer delete(@PathParam("id") String id) {
		return dao.deleteById(id);
	}
	
}
