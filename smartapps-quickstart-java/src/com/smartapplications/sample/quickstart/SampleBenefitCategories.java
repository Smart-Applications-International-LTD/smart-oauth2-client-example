package com.smartapplications.sample.quickstart;


import org.json.JSONArray;
import org.json.JSONObject;
import org.scribe.model.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.smartapplications.libraries.OAuth2;
import com.smartapplications.libraries.OAuthConstants;

/**
 * PLEASE REFER TO THE MAIN DOCUMENTATION WHEN USING THIS APPLICATION.
 *  IT CONTAINS THE SPECIFICATIONS REQUIRED BY THE API.
 */

public class SampleBenefitCategories {
	
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
		 *  i.e clients can use it to give smart a list of benefits.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/benefitCategories";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("medCatg", "6");
		request.addQuerystringParameter("smartMsplan", "5");
		request.addQuerystringParameter("smartFsplan", "2");
		request.addQuerystringParameter("smartCatNo", "3");
		request.addQuerystringParameter("catDesc", "3");
		request.addQuerystringParameter("inPatientOverall", "3");
		request.addQuerystringParameter("outPatientOverall", "3");
		request.addQuerystringParameter("policyNumber", "3");
		request.addQuerystringParameter("autoReplenishInd", "2");
		request.addQuerystringParameter("autoGrowthInd", "3");
		request.addQuerystringParameter("userId", "3");
		request.addQuerystringParameter("autoGrowthPct", "3");
		request.addQuerystringParameter("clnCatCode", "3");
		request.addQuerystringParameter("spendThreshold", "3");
		request.addQuerystringParameter("spendThrespct", "3");
		request.addQuerystringParameter("waitingPeriod", "3");
		request.addQuerystringParameter("cutOffInd", "3");
		request.addQuerystringParameter("cutOffAge", "3");
		request.addQuerystringParameter("clnPolCode", "3");
		request.addQuerystringParameter("clnPolId", "3");
		request.addQuerystringParameter("smartMplan", "3");
		request.addQuerystringParameter("smartFplan", "3");
		
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve Benefit categories
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
		 *  i.e can be used by clients to retrieve multiple Benefit categories.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/benefitCategories";
		
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
		
		///////////////////////////////OPTIONAL PARAMETERS//////////////////////////////
		request.addQuerystringParameter("startindex", "0"); //By default is 0 i.e start at index 
		request.addQuerystringParameter("maxresults", "50"); //By default is 50 i.e maximum of fifty Benefit categories
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e Benefit categories not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "date_added asc"); //Order the Benefit categories in what format
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retreive Benefit categories
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
            //System.out.println(content);
		   //Simplest approach is to convert the results  into a json array
		    JSONObject benefitCategories_obj = new JSONObject(content);
		    JSONArray benefitCategories_array = benefitCategories_obj.getJSONArray("benefitCategories");

		    System.out.println(benefitCategories_array);
		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/

		

		
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve a single claim.
		 */
		

	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		//i.e Client requesting for claim with id 65398
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/benefitCategories/3";
		
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

		//Send the request to the resource server for processing and retreive Benefit categories
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
		   JSONObject benefitCategory_obj = new JSONObject(content);
		   System.out.println(benefitCategory_obj);
		 //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
		   
		    
		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	

		
		
		

	    
	}
	
	
	
	


	
}