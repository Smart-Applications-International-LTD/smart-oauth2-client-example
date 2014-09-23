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

public class SampleBenefits {
	
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
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/benefits";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("benefitDesc", "6686");
		request.addQuerystringParameter("policyNumber", "567");
		request.addQuerystringParameter("catCode", "27441064");
		request.addQuerystringParameter("benTypeId", "2323");
		request.addQuerystringParameter("coPayAmt", "2323");
		request.addQuerystringParameter("coPayPercent", "2323");
		request.addQuerystringParameter("benLinked2Id", "2323");
		request.addQuerystringParameter("subLimitAmt", "2323");
		request.addQuerystringParameter("limitAmt", "2323");
		request.addQuerystringParameter("genderApplicability", "m");
		request.addQuerystringParameter("waitingPeriod", "2323");
		request.addQuerystringParameter("effectiveDate", "2014-07-31");
		request.addQuerystringParameter("serviceType", "2323");
		request.addQuerystringParameter("memAssignedBenefit", "2323");
		request.addQuerystringParameter("spendThreshold", "2323");
		request.addQuerystringParameter("spendThrespct", "2323");
		request.addQuerystringParameter("autoReplenishInd", "2323");
		request.addQuerystringParameter("benEndDate", "2014-07-31");
		request.addQuerystringParameter("userId", "2323");
		request.addQuerystringParameter("clnBenCode", "2323");
		request.addQuerystringParameter("benTypDesc", "2323");
		request.addQuerystringParameter("benLinked2Tqcode", "2323");
		request.addQuerystringParameter("autoGrowthInd", "2323");
		request.addQuerystringParameter("autoGrowthPct", "2323");
		request.addQuerystringParameter("clnPolCode", "2323");
		request.addQuerystringParameter("clnPolId", "2323");
		
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve Benefits
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
		 *  i.e can be used by clients to retrieve multiple Benefits.
		 */
		

	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/benefits";
		
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
		request.addQuerystringParameter("startindex", "51"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "50"); //By default is 30 i.e maximum of fifty Benefits
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e Benefits not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "date_added asc"); //Order the Benefits in what format
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retrieve Benefits
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
		    //JSONObject benefit_obj = new JSONObject(content);
		    //JSONArray benefit_array = benefit_obj.getJSONArray("benefits");
		    //System.out.println(benefit_array);

		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	


		

		
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve a single benefit.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		//i.e Client requesting for benefit with id 65398
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/benefits/5763193";
		
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

		//Send the request to the resource server for processing and retreive Benefits
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
		   //JSONObject benefit_obj = new JSONObject(content);
		   //System.out.println(benefit_obj);
		 //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
		   
		    
		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		

	    
	}
	
	
}