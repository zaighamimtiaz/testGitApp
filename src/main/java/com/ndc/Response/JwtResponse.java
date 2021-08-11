package com.ndc.Response;

import java.io.Serializable;

public class JwtResponse implements Serializable {

	private static final long serialVersionUID = -8091879091924046844L;
	private final String access_token;
	private final String token_type;
	private final String expires_in;
	private final String userName;
	private final String issued;
	private final String expires;
	

	public JwtResponse(String access_token , String token_type , String expires_in , String userName , String issued, String expires) {
		this.access_token = access_token;
		this.token_type = token_type;
		this.expires_in = expires_in;
		this.userName = userName;
		this.issued = issued;
		this.expires = expires;
	}


	public String getAccess_token() {
		return access_token;
	}


	public String getToken_type() {
		return token_type;
	}


	public String getExpires_in() {
		return expires_in;
	}


	public String getUserName() {
		return userName;
	}


	public String getIssued() {
		return issued;
	}


	public String getExpires() {
		return expires;
	}
	
}