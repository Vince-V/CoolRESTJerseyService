package com.cool.restjersey;

/**
 * @author Vince-V
 */
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import org.json.JSONException;
import org.json.JSONObject;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


//import io.reactivex.*;

@Path("/displaydata")

public class ShowData {
	
	private LocalDateTime todaysDate = LocalDateTime.now();
	private DateTimeFormatter formatDateTime = DateTimeFormatter.ofPattern("MMM dd yyyy hh:mm a");
	private String dateTimeString = todaysDate.format(formatDateTime);
	@GET
	  @Produces("application/json")
	  public Response displayData() throws JSONException {
	  JSONObject json = new JSONObject();
	  
	  json.put("More","Data1"); 
	  json.put("More","Data2"); 
		
		String result = "@Produces(\"application/json\") Output at "+ dateTimeString +": \n\n" +"The Data:\n\n" + json;	
	  return Response.status(200).entity(result).build();
	}
	
	@Path("{f}")
	  @GET
	  @Produces("application/json")
	public Response displayMoreData(@PathParam("f") float f) throws JSONException {
		 
		JSONObject jsonObject = new JSONObject();
		
		jsonObject.put("More","Data3"); 
		jsonObject.put("More","Data4"); 
		
		String result = "@Produces(\"application/json\") Output: \n\nMore Data: \n\n" + jsonObject;
		return Response.status(200).entity(result).build();	
	}	
}
