package com.javatpoint.rest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.sun.media.jfxmedia.Media;


@Path("/hello")
public class Hello {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getPlainTextHello()
	{
		return "Text Plain Result";
	}
	
	@GET  
	  @Produces(MediaType.TEXT_XML)  
	  public String sayXMLHello() {  
	    return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";  
	  }  
	@GET  
	  @Produces(MediaType.TEXT_HTML)  
	  public String sayHtmlHello() {  
	    return "<html> " + "<title>" + "Hello Jersey" + "</title>"  
	        + "<body><h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html> ";  
	  } 
	@GET
	@Path("/{param}")
	public String getParameterResponse(@PathParam("param") String msg)
	{
		return "Hello "+msg;
	}
	@GET
	@Path("/{year}/{month}/{day}")
	public Response getDate(@PathParam("year") String year,@PathParam("month") String month,@PathParam("day") String day)
 	{
	     String date="Date is "+year+" "+month+" "+day;
	     return Response.status(200).entity(date).build();
	}
	
	
}
