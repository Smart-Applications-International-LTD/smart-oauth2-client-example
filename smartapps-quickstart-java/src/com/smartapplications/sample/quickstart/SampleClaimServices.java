package com.smartapplications.sample.quickstart;


import org.json.JSONArray;
import org.json.JSONObject;
import org.scribe.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.smartapplications.libraries.OAuth2;
import com.smartapplications.libraries.OAuthConstants;



public class SampleClaimServices {
	
	//Create an instance of the class that processes the authentication
	private static SmartAuthHelper authhelper = new SmartAuthHelper();
	
	//Create an instance of the class that stores the authentication details
	private static OAuth2 oauth2Details = new OAuth2();
	
	public static void main(String[] args) throws IOException {
		
		String access_token = null;
		Token client_response = null;

		//Try retrieving the stores access token from Oauth2Details Class 
		access_token = oauth2Details.getAccessToken();

		if(access_token == null){
			//Connect to the authorization server and retrieve a new access token
			client_response = authhelper.client_credentials();
			access_token = client_response.getToken();
			//Store the access token for future use
			oauth2Details.setAccessToken(access_token);
		}
		

		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve a single claim service.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		//i.e Client requesting for claimservice with id 299987072
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/claimservices/299997601";
		
	    // Now let's go and ask  a protected resource!
	    System.out.println("Now we're going to access a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.GET, REQ_URL);
		
		
		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "json"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);

		//Send the request to the resource server for processing and retreive claimservices
		Response response = request.send();

	    System.out.println("Got it! Lets see what we found...");
	    System.out.println();
	    
	    if(!response.isSuccessful()){
	    	
	    	System.out.println(response.getCode());
	    	System.out.println("Something went wrong during the execution of the request");
	    	System.out.println(response.getBody());
	    	//Log the error in the database for review
	    	
	    }else{
           
	    	//The request was successful
		    String content = response.getBody();
	        System.out.println(content);
	       //Simplest approach is to convert the results  into a json array
		  // JSONObject claimservice_obj = new JSONObject(content);
		//   System.out.println(claimservice_obj.get("id") +" : "+claimservice_obj.get("memberNames"));
		 //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
		   
		    
		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		
  
	    
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 * i.e can be used by clients to retrieve multiple services that were performed on claims
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
      
		//Url to the protected resource 
		//i.e Clients retrieving claim services
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/claimservices";
		
	    // Now let's go and retrieve a protected resource!
	    System.out.println("Now we're going to retrieve a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.GET, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		//Below parameters are required to process your request
		request.addQuerystringParameter("id", "299997601,151651651");
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "json"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve claim services
		Response response = request.send();

	    System.out.println("Got it! Lets see what the server has done...");
	    System.out.println();

	    if(!response.isSuccessful()){
	    	
	    	System.out.println(response.getCode());
	    	System.out.println("Something went wrong during the execution of the request");
	    	System.out.println(response.getBody());
	    	//Log the error in the database for review
	    	
	    }else{
           
	    	//The request was successful
	    	System.out.println(response.getBody());
		   
		    
		    
		    //Parse the JSONObject and create HashMap


			//Parse/Retrieve the response in whichever way you want 
		    //System.out.println(content);

	    }
	
	    //////////////////////////////////////////////////////////////////////////////////
*/
	    
		
   
	}
	
	
}