package com.test;

import java.util.List;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

@Path("/hello")
public class HelloService {
		
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	@Path("/text")
	public String simplePlainTextResponse() {
		return "Simple RESTful web service application";
	}
	
	@GET
	@Produces
	@Path("/html/{debit}")
	public String htmlTextResponse(@PathParam("debit") String card) {
		return "<html><body> <h1> Simple Rest API HTML Response Card no : "+card+" </h1> </body></html>";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String greetUserResponse(@QueryParam("msg") String msg) {
		return msg;
	}
	
	@GET
	@Path("/list")
	@Produces(MediaType.APPLICATION_JSON)
	public List<UserDetails> listAllUsersData(){
		UserDetails u1 = new UserDetails(1,"Rohit", "Sharma", "r@gmail.com", 674835722);
		UserDetails u2 = new UserDetails(2,"Virat", "Kohli", "v@gmail.com", 835743522);
		UserDetails u3 = new UserDetails(3,"Surya", "Kumar", "s@gmail.com", 324743522);
		
		return List.of(u1,u2,u3);
	}
}
