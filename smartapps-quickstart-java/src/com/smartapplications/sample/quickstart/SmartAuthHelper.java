package com.smartapplications.sample.quickstart;

import org.scribe.builder.ServiceBuilder;
import org.scribe.model.*;
import org.scribe.oauth.OAuthService;
import com.smartapplications.libraries.SmartApiService;
import java.io.IOException;
import java.util.Arrays;

public class SmartAuthHelper {

	/**
	 * Please provide a value for the CUSTOMER_ID constant before proceeding.
	 *  N/B FOR CUSTOMER IDENTIFICATION.
	 *  A customer can only have one CUSTOMER_ID.
	 */
    private static final String CUSTOMER_ID = "9652498631248765"; //YOUR ID // i.e FOR SMART API TEST IDENTIFICATION
     

	/**
	 * Please provide a value for the CLIENT_ID constant before proceeding.
	 * N/B FOR IDENTIFICATION OF THE SYSTEMS OWNED BY THE CUSTOMER.
	 * Customer can have as many CLIENT_IDs as the systems they are using to connect to smart. 
	 */
    private static final String CLIENT_ID = "4216865795234581"; //YOUR APPLICATION ID // i.e SMART API TEST DESKTOP APPLICATION IN KENYA

	
	/**
	 * Please provide a value for the CLIENT_SECRET constant before proceeding.
	 * N/B FOR VERIFICATION OF THE SYSTEMS OWNED BY THE CUSTOMER.
	 * Customer can have as many CLIENT_SECRETs as the systems they are using to connect to smart. 
	 */
	private static final String CLIENT_SECRET = "D5S4HLGJDHSOR8SW9GO456AQ"; //YOUR APPLICATION SECRET // i.e SECRET FOR SMART API TEST DESKTOP APPLICATION IN KENYA


	/**
	 * Callback URI that smart will redirect to after successful authentication
	 * N/B Not necessary for Smart Application Customers i.e insurance companies
	 */
	private static final String CALLBACK_URI = "http://localhost:8080/OAuth2v1/index.jsp";
	
	/**
	 * Smart authentication constants
	 * N/B Not necessary for Smart Application Clients i.e insurance companies
	 */
	private static final Iterable<String> SCOPE = Arrays.asList("https://www.smartapis.com/auth/userinfo.profile;https://www.smartapis.com/auth/userinfo.email".split(";"));
	
	private static final String USER_INFO_URL = "https://www.smartapis.com/oauth2/v1/userinfo";

	private String stateToken;
	

	
	/**
	 * Constructor initializes the smart Authorization Code Flow with CLIENT ID, SECRET, and SCOPE 
	 */

	public SmartAuthHelper() {
		OAuthService service = new ServiceBuilder().provider(SmartApiService.class).apiKey(CLIENT_ID).apiSecret(CLIENT_SECRET).build();
	}
	
	public String CUSTOMER_ID(){
		return this.CUSTOMER_ID;
	}

	public Token client_credentials() {

		Token token = null;
		try {
			token = SmartApiService.getToken(CLIENT_ID, CLIENT_SECRET);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return token;
	}
	
	

	
}
