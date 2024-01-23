package com.mahendra.app;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Path("/hello")
public class HelloResource {

	/**
	 * HTTP/GET http://localhost:8084/demo-1/api/hello
	 * @return
	 */
	
	@GET @Produces("text/html")
	public String greetHTML() {
		return "<h1>Hello World</h1>";
	}
	
	@GET @Produces("application/xml")
	public String greetXML() {
		return "<message>Hello WOrld</message>";
	}
	
	@GET @Produces("text/plain")
	public String greetPlain() {
		return "Hello World";
	}
	
	@GET @Produces("application/json")
	public String greetJSON() {
		return "{\"message\":\"Hello World\"}";
	}
	
	@PUT @Path("/{name}")
	public String update(@PathParam("name") String name) {
		return "Hello "+ name;
	}
	
	@DELETE @Path("/{name}")
	public String delete(@PathParam("name") String name) {
		return "Bye "+ name;
	}
	
}
