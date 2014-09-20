package com.smartapplications.sample.quickstart;


import org.json.JSONArray;
import org.json.JSONObject;
import org.scribe.model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.smartapplications.libraries.OAuth2;
import com.smartapplications.libraries.OAuthConstants;



public class SampleMembers {
	
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
		 *  i.e clients can use it to give smart a list on members.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("polId", "6686");
		request.addQuerystringParameter("comId", "567");
		request.addQuerystringParameter("idNumber", "27441064");
		request.addQuerystringParameter("surname", "FRED");
		request.addQuerystringParameter("secondName", "MULAMA");
		request.addQuerystringParameter("thirdName", "BUKHAYA");
		request.addQuerystringParameter("otherNames", "");
		request.addQuerystringParameter("dob", "2014-07-31");
		request.addQuerystringParameter("cutOffAge", "78987");
		request.addQuerystringParameter("kinFName", "G");
		request.addQuerystringParameter("kinMName", "78987");
		request.addQuerystringParameter("kinONames", "78987");
		request.addQuerystringParameter("kinTelNo", "78987");
		request.addQuerystringParameter("kinEmail", "78987");
		request.addQuerystringParameter("kinNatId", "78987");
		request.addQuerystringParameter("staffNumber", "YGY");
		request.addQuerystringParameter("nhifNumber", "aaaaa");
		request.addQuerystringParameter("gender", "78987");
		request.addQuerystringParameter("membershipNumber", "1163");
		request.addQuerystringParameter("memType", "78");
		request.addQuerystringParameter("familyCode", "78987");
		request.addQuerystringParameter("userID", "78987");
		request.addQuerystringParameter("clnPolNumber", "78987");
		request.addQuerystringParameter("clnComCode", "78987");
		request.addQuerystringParameter("clnPolCode", "78987");
		request.addQuerystringParameter("clnPolId", "78987");
		request.addQuerystringParameter("clnUniqueMemNumber", "78987");
		request.addQuerystringParameter("clnCatCode", "78987");
		request.addQuerystringParameter("station", "78987");
		request.addQuerystringParameter("deptName", "78987");
		request.addQuerystringParameter("title", "78987");
		request.addQuerystringParameter("otherNumber", "78987");
		request.addQuerystringParameter("medicalAllocationCover", "78987");
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple PUT request to the SMART API.
		 * i.e can be used by clients to update member information that we have not processed.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
      
		//Url to the protected resource 
		//i.e Clients informing us that member 65398 has switched
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/1411203983689";
		
	    // Now let's go and update a protected resource!
	    System.out.println("Now we're going to update a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.PUT, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("polId", "6686");
		request.addQuerystringParameter("comId", "567");
		request.addQuerystringParameter("idNumber", "27441064");
		request.addQuerystringParameter("surname", "FRED");
		request.addQuerystringParameter("secondName", "MULAMA");
		request.addQuerystringParameter("thirdName", "BUKH");
		request.addQuerystringParameter("otherNames", "");
		request.addQuerystringParameter("dob", "2014-07-31");
		request.addQuerystringParameter("cutOffAge", "78987");
		request.addQuerystringParameter("kinFName", "G");
		request.addQuerystringParameter("kinMName", "78987");
		request.addQuerystringParameter("kinONames", "78987");
		request.addQuerystringParameter("kinTelNo", "78987");
		request.addQuerystringParameter("kinEmail", "78987");
		request.addQuerystringParameter("kinNatId", "78987");
		request.addQuerystringParameter("staffNumber", "YGY");
		request.addQuerystringParameter("nhifNumber", "aaaaa");
		request.addQuerystringParameter("gender", "78987");
		request.addQuerystringParameter("membershipNumber", "1163");
		request.addQuerystringParameter("memType", "78");
		request.addQuerystringParameter("familyCode", "78987");
		request.addQuerystringParameter("userID", "78987");
		request.addQuerystringParameter("clnPolNumber", "78987");
		request.addQuerystringParameter("clnComCode", "78987");
		request.addQuerystringParameter("clnPolCode", "78987");
		request.addQuerystringParameter("clnPolId", "78987");
		request.addQuerystringParameter("clnUniqueMemNumber", "78987");
		request.addQuerystringParameter("clnCatCode", "78987");
		request.addQuerystringParameter("station", "78987");
		request.addQuerystringParameter("deptName", "78987");
		request.addQuerystringParameter("title", "78987");
		request.addQuerystringParameter("otherNumber", "78987");
		request.addQuerystringParameter("medicalAllocationCover", "78987");
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
	    
	    
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple member lists.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 1
		request.addQuerystringParameter("maxresults", "2"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retrieve members
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
		  //  JSONObject member_obj = new JSONObject(content);
		 //   JSONArray member_array = member_obj.getJSONArray("members");
		    
		    //System.out.println(member_array);
		    
		   // for(int i = 0 ; i < member_array.length() ; i++){
			//   System.out.print(member_array.getJSONObject(i).getString("membershipNumber"));
			//   System.out.print(" : ");
		   //    System.out.println(member_array.getJSONObject(i).getString("staffNumber"));
		       //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
		  //  }
		    

		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		

		
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve a single member.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////

	    //Url to the protected resource 
		//i.e Client requesting for member with id 20013
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/141119490688";
		
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
	
		//Send the request to the resource server for processing and retreive members
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
		   // JSONObject member_obj = new JSONObject(content);

		    //System.out.println(member_array);
		    //System.out.println(member_obj.get("membershipNumber") +" : "+member_obj.get("staffNumber"));
  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		

		
		

		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to search for specific members etc.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/search";
		
	    // Now let's go and ask  a protected resource!
	    System.out.println("Now we're going to access a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.GET, REQ_URL);
		
		
		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("q", "MULAMA");
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
		
		///////////////////////////////OPTIONAL PARAMETERS//////////////////////////////
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "2"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e members not picked
	//	request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		//request.addQuerystringParameter("orderby", "transaction_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retreive members
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
			   // JSONObject member_obj = new JSONObject(content);
			  //  JSONArray member_array = member_obj.getJSONArray("members");
			   // for(int i = 0 ; i < member_array.length() ; i++){
			       //i.e We are retrieving only member names whose users are called fred
				//   System.out.print(member_array.getJSONObject(i).getString("membershipNumber"));
				//   System.out.print(" : ");
			   //    System.out.println(member_array.getJSONObject(i).getString("staffNumber"));
			       //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
			  //  }
			    
	    }
   
    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		
	    
	    
	    
	    
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple member changes lists.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/changes";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "2"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "0");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "join_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////
	
		//Send the request to the resource server for processing and retreive members
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
		   // JSONObject member_obj = new JSONObject(content);
		   // JSONArray member_array = member_obj.getJSONArray("members");
		    
		    //System.out.println(member_array);
		    
		    //for(int i = 0 ; i < member_array.length() ; i++){
			//   System.out.print(member_array.getJSONObject(i).getString("membershipNumber"));
			//   System.out.print(" : ");
		    //   System.out.println(member_array.getJSONObject(i).getString("staffNumber"));
		       //YOU CAN NOW SAVE THE DATA INTO A TABLE FOR FUTURE USE
		   // }
		    

		  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/

		

		
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve a single member changes.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////

	    //Url to the protected resource 
		//i.e Client requesting for member with id 20013
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/changes/77";
		
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
	
		//Send the request to the resource server for processing and retreive members
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
		   // JSONObject member_obj = new JSONObject(content);

		    //System.out.println(member_array);
		  //  System.out.println(member_obj.get("membershipNumber") +" : "+member_obj.get("staffNumber"));
  
	    }

    //////////////////////////////////////////////////////////////////////////////////////////	
*/
		
		
		
		/**
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of cards for reprints.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/cardreprints";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("memberNumber", "6686");
		request.addQuerystringParameter("staffNumber", "567");
		request.addQuerystringParameter("surname", "vggf");
		request.addQuerystringParameter("secondName", "ewr");
		request.addQuerystringParameter("thirdName", "fger");
		request.addQuerystringParameter("otherNames", "erer");
		request.addQuerystringParameter("cardSerialNumber", "78987");
		request.addQuerystringParameter("userId", "888888");
		request.addQuerystringParameter("reorderReason", "ytry");
		request.addQuerystringParameter("cardRequestNumber", "78987");

		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "json"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of money additions.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/moneyaddition";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("smartBillId", "6686");
		request.addQuerystringParameter("returnedAmount", "500");
		request.addQuerystringParameter("returnCode", "57876796");
		request.addQuerystringParameter("returnReason", "6565");
		request.addQuerystringParameter("dateEntered", "2014-07-31");
		request.addQuerystringParameter("memberNumber", "484");
		request.addQuerystringParameter("anniv", "11");
		request.addQuerystringParameter("providerCode", "78987");
		request.addQuerystringParameter("invoiceNumber", "4545");
		request.addQuerystringParameter("userId", "78987");
		request.addQuerystringParameter("clnPolCode", "78987");
		request.addQuerystringParameter("invoiceDate", "2014-07-31");
		request.addQuerystringParameter("invoiceId", "78987");
		request.addQuerystringParameter("benefitCode", "78987");
		

		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of money reduction.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/moneyreduction";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("smartBillId", "6686");
		request.addQuerystringParameter("returnedAmount", "500");
		request.addQuerystringParameter("returnCode", "57876796");
		request.addQuerystringParameter("returnReason", "6565");
		request.addQuerystringParameter("dateEntered", "2014-07-31");
		request.addQuerystringParameter("memberNumber", "484");
		request.addQuerystringParameter("anniv", "11");
		request.addQuerystringParameter("providerCode", "78987");
		request.addQuerystringParameter("invoiceNumber", "4545");
		request.addQuerystringParameter("userId", "78987");
		request.addQuerystringParameter("clnPolCode", "78987");
		request.addQuerystringParameter("invoiceDate", "2014-07-31");
		request.addQuerystringParameter("invoiceId", "78987");
		request.addQuerystringParameter("benefitCode", "78987");
		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of money reduction.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/renewals";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("memberNumber", "DSAD65SDAS5");
		request.addQuerystringParameter("userId", "4646");
		request.addQuerystringParameter("anniv", "11");
		request.addQuerystringParameter("statusReason", "MEMBER SHOULD BE RENEWED FOR A NEW COVER PERIOD");
		request.addQuerystringParameter("statusDate", "2014-07-31");
		request.addQuerystringParameter("startDate", "2014-07-31");
		request.addQuerystringParameter("endDate", "2014-07-31");

		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of member category change.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/categorychange";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("memberNumber", "6686");
		request.addQuerystringParameter("userId", "500");
		request.addQuerystringParameter("startDate", "2014-07-31");
		request.addQuerystringParameter("schemeYear", "2014-07-31");
		request.addQuerystringParameter("newGrade", "2014-07-31");
		request.addQuerystringParameter("endDate", "2014-07-31");
		request.addQuerystringParameter("clnPolCode", "11");

		
		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of member activation.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/activations";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL

		//@NotNull
		//@NotEmpty	
		request.addQuerystringParameter("memberNumber", "DSAD65SDAS5");
		request.addQuerystringParameter("userId", "4646");
		request.addQuerystringParameter("anniv", "11");
		request.addQuerystringParameter("statusReason", "TO ACTVATE CARD - MOMBASA HOSPITAL");
		request.addQuerystringParameter("statusDate", "2014-07-31");


		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of member deactivations.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/deactivations";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
    	request.addQuerystringParameter("memberNumber", "DSAD65SDAS5");
		request.addQuerystringParameter("userId", "4646");
		request.addQuerystringParameter("anniv", "11");
		request.addQuerystringParameter("statusReason", "TO CORRECT ERROR THAT OCCURED DURING TEST");
		request.addQuerystringParameter("statusDate", "2014-07-31");


		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 * Demonstration of a simple POST request to the SMART API.
		 *  i.e clients can use it to give smart a list of member for fingerprint removal.
		 */
		
/*
	    //////////////////////////////////////////////////////////////////////////////////
    
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/fingerprintremoval";
		
	    // Now let's go and create a protected resource!
	    System.out.println("Now we're going to create a protected resource...");
		OAuthRequest request = new OAuthRequest(Verb.POST, REQ_URL);

		// To make sure all our query parameters are encoded properly we add them
		// using scribe rather than putting them in the URL
		request.addQuerystringParameter("memberNumber", "87045154-03");
		request.addQuerystringParameter("userId", "MARAKWA");
		request.addQuerystringParameter("statusReason", "REGISTERED FINGERPRINT NOT ACCEPTED AT SERVISE PROVIDER LEVEL-GERTRUDES MUTHAIGA");

		//Below parameters are required to process your request
		request.addQuerystringParameter("customerid", authhelper.CUSTOMER_ID());
		request.addQuerystringParameter("country", "kenya");
		request.addQuerystringParameter("format", "xml"); 
		//The resource server will need you to provide this access_token or else it will drop the request
		request.addQuerystringParameter("access_token", access_token);
	
		//Send the request to the resource server for processing and retrieve members
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
		 *  i.e can be used by clients to retrieve multiple card reprints.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/cardreprints";
		
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
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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

		    

		  
	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
*/
		


		
		 
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple money additions.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/moneyaddition";
		
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
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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

		    

		  
	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
*/
	
		
		
		

		
		 
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple money reduction.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/moneyreduction";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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

		    

		  
	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
*/

	
		
		 
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple money renewals.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/renewals";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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


	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
*/
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple member categorychanges.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/categorychange";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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


	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
	*/	
	    
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple member activation.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/activations";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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


	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
*/

		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple member deactivation.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/deactivations";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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


	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
*/
		

		
		
		/**
		 * Demonstration of a simple GET request to the SMART API.
		 *  i.e can be used by clients to retrieve multiple member fingerprint removal.
		 */
		
/*
	///////////////////////////////////////////////////////////////////////////////
		//Url to the protected resource 
		String REQ_URL   = OAuthConstants.RESOURCE_SERVER_URL+"/members/fingerprintremoval";
		
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
		request.addQuerystringParameter("startindex", "1"); //By default is 1 i.e start at index 
		request.addQuerystringParameter("maxresults", "30"); //By default is 30 i.e maximum of fifty members
		request.addQuerystringParameter("status", "1");   //By default is 0 i.e members not picked
		request.addQuerystringParameter("restrict", "");  // Used when filtering the request
		request.addQuerystringParameter("orderby", "insert_date asc"); //Order the members in what format
		////////////////////////////////////////////////////////////////////////////////

		//Send the request to the resource server for processing and retreive members
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


	    }

	//////////////////////////////////////////////////////////////////////////////////////////	
*/
	
		
		

		
		
  
 }

	
}