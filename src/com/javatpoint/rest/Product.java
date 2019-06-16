package com.javatpoint.rest;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/product")
public class Product {

	@POST
	@Path("/add")
	public Response addUser(@FormParam("id") String id,@FormParam("name") String name,@FormParam("email") String email)
	{
		return Response.status(200).entity(" Product added successfuly!<br> Id: "+id+"<br> Name: " + name+"<br> Email: "+email).build();
	}
}
