package com.javatpoint.rest;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;


@Path("/file")
public class FileDownload {

	@GET
	@Path("/downloadPdf")
	@Produces("application/pdf")
	public Response getDownloadPdf()
	{
		File file=new File("C:\\Users\\saggupta\\Desktop\\Kerberos_crossRealm.pdf");
		ResponseBuilder response=Response.ok((Object)file);
		 response.header("Content-Disposition","attachment; filename=\"sagar.pdf\"");  
		 return response.build();
	}
}
