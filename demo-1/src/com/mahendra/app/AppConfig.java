package com.mahendra.app;



import java.util.HashSet;
/**
 * Older version: javax.ws.rs.*
 */
import java.util.Set;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Newer Version:
 * 
 * import jakarta.ws.rs.ApplicationPath;
 * import jakarta.ws.rs.core.Application;
 */

@ApplicationPath("/api/")
public class AppConfig extends Application{
	
	public Set<Class<?>> getClasses(){
		Set<Class<?>> resourceSet = new HashSet<>();
		// Add all your REST resource classes 
		resourceSet.add(HelloResource.class);
		resourceSet.add(CustomerResource.class);
		return resourceSet;
	}
	

}
