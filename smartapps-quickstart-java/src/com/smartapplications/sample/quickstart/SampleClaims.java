package com.smartapplications.sample.quickstart;


import org.json.JSONArray;
import org.json.JSONObject;
import org.scribe.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.smartapplications.libraries.OAuth2;
import com.smartapplications.libraries.OAuthConstants;



public class SampleClaims {
	
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
		 *  i.e can be used by clients to retrieve multiple claims.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/claims";
		
	    // Now let's go and ask  a protected resource!
	    System.out.println("Now we're going to access a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.GET, REQ_URL);
		
		
		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
		
		///////////////////////////////OPTIONAL PARAMETERS//////////////////////////////
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty claims
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e claims not picked
		//request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		//request.addQuerystringParameter("orderby", "transaction_date asc"); //Order the claims in what format
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retreive claims
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
		   // JSONObject claim_obj = new JSONObject(content);
		  //  JSONArray claim_array = claim_obj.getJSONArray("claims");
		   
		   // for(int i = 0 ; i < claim_array.length() ; i++){
		       //i.e We are retrieving only member names whose users are called fred		     
			//   System.out.print(claim_array.getJSONObject(i).getInt("id"));
			//   System.out.print(" : ");
		    //   System.out.println(claim_array.getJSONObject(i).getString("memberNames"));
		       //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
		   // }

		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
	    
		

		
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve a single claim.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		//i.e Client requesting for claim with id 65398
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/claims/299513250";
		
	    // Now let's go and ask  a protected resource!
	    System.out.println("Now we're going to access a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.GET, REQ_URL);
		
		
		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);

		//Send the request to the resource server for processing and retreive claims
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
		  // JSONObject claim_obj = new JSONObject(content);
		//   System.out.println(claim_obj.get("id") +" : "+claim_obj.get("memberNames"));
		 //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
		   
		    
		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		

		

		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to search for specific claims etc.
		 */
		
	/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/claims/search";
		
	    // Now let's go and ask  a protected resource!
	    System.out.println("Now we're going to access a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.GET, REQ_URL);
		
		
		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("q", "NJERI");
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
		
		///////////////////////////////OPTIONAL PARAMETERS//////////////////////////////
	    request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "12"); //By default is 30 i.e maximum of fifty claims
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e claims not picked
	  //request.addQuerystringParameter("restrict", "");  // Used when filtering the request
	  //request.addQuerystringParameter("orderby", "transaction_date asc"); //Order the claims in what format
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retreive claims
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
			//    JSONObject claim_obj = new JSONObject(content);
			 //   JSONArray claim_array = claim_obj.getJSONArray("claims");
			 //   for(int i = 0 ; i < claim_array.length() ; i++){    	
			//       //i.e We are retrieving only member names whose users are called FRED    
			//	   System.out.print(claim_array.getJSONObject(i).getInt("id"));
			//	   System.out.print(" : ");
			  //     System.out.println(claim_array.getJSONObject(i).getString("memberNames"));
			       //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
			   // }

			    
			    
	    }
   
    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		

		
		/**
		 * Demonstration of a simple PUT request to the SMART API.
		 * i.e can be used by clients to inform us that a claim has switched.
		 */
		

	    //////////////////////////////////////////////////////////////////////////////////
      
		//Url to the protected resource 
		//i.e Clients informing us that claim 65398 has switched
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/claims/switched/299495225";
		
	    // Now let's go and update a protected resource!
	    System.out.println("Now we're going to update a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.PUT, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve claims
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
	
  
		
		
		/**
		 * Demonstration of a simple PUT request to the SMART API.
		 * i.e can be used by clients to inform us that a claim has switched.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
      
		//Url to the protected resource 
		//i.e Clients informing us that claim 65398 has switched
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/claims/switched";
		
	    // Now let's go and update a protected resource!
	    System.out.println("Now we're going to update a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.PUT, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		//Below parameters are required to process your request
		request.addQuerystringParameter("id", "299495225,299501364,299502356,299511202");
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "json"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve claims
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