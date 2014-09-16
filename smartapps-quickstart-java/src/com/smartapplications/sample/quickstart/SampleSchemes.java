package com.smartapplications.sample.quickstart;


import org.json.JSONArray;
import org.json.JSONObject;
import org.scribe.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.smartapplications.libraries.OAuth2;
import com.smartapplications.libraries.OAuthConstants;


public class SampleSchemes {
	
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of schemes.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/schemes";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("clnCode", "6311");
		request.addQuerystringParameter("companyName", "COMPANIES");
		request.addQuerystringParameter("polId", "264");
		request.addQuerystringParameter("alphaCount", "444");
		request.addQuerystringParameter("clnPolCode", "5565");
		request.addQuerystringParameter("smartCode2", "656");
		
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve schemes
		Response response = request.send();

	    System.out.println("Got it! Lets see what we have...");
	    System.out.println();

	    
	    if(!response.isSuccessful()){
	    	
	    	System.out.println(response.getCode());
	    	System.out.println("Something went wrong during the execution of the request");
	    	System.out.println(response.getBody());
	    	//Log the error in the database for review
	    	
	    	
	    }else{
           
	    	//The request was successful
	    	System.out.println(response.getBody());


	    }
	    //////////////////////////////////////////////////////////////////////////////////
*/
	    
	    
		
	    
	    
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple schemes lists.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/schemes";
		
	    // Now let's go and ask  a protected resource!
	    System.out.println("Now we're going to access a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.GET, REQ_URL);
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "json"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
		
		///////////////////////////////OPTIONAL PARAMETERS//////////////////////////////
		request.addQuerystringParameter("startindex", "0"); //By default is 0 i.e start at index 
		request.addQuerystringParameter("maxresults", "50"); //By default is 50 i.e maximum of fifty schemes
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e schemes not picked
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retreive schemes
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
           // System.out.println(content);
		   //Simplest approach is to convert the results  into a json array
		    JSONObject scheme_obj = new JSONObject(content);
		    JSONArray scheme_array = scheme_obj.getJSONArray("schemes");
		    
		    System.out.println(scheme_array);
		    

		    

		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/

		

		
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve a single scheme.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////

	    //Url to the protected resource 
		//i.e Client requesting for claim with id 20013
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/schemes/63";
		
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
	
		//Send the request to the resource server for processing and retreive schemes
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
		   //Simplest approach is to convert the results  into a json array
		    JSONObject scheme_obj = new JSONObject(content);

		    System.out.println(scheme_obj);

	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		

		
		/**
		 * Demonstration of a simple PUT request to the SMART API.
		 * i.e can be used by clients to renew a scheme.
		 */
		

	    //////////////////////////////////////////////////////////////////////////////////
      
		//Url to the protected resource 
		//i.e Clients informing us that scheme 65398 needs to be renewed.
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/schemes/renewals/789878";
		
	    // Now let's go and update a protected resource!
	    System.out.println("Now we're going to update a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.PUT, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("startDate", "2014-10-30");
		request.addQuerystringParameter("endDate", "2014-10-31");
		request.addQuerystringParameter("effectingDate", "2014-09-20");
		
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve schemes
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

		
  
 }

	
}