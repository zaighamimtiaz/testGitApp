package com.ndc.ResponseImpl;

import java.util.List;

import com.ndc.Response.Data;
import com.ndc.Response.requestStatus;

public class RegistrationImpl {
	private String response;
	private List<Data> data;
	private requestStatus requestStatus;
	public String getResponse() {
		return response;
	}
	public void setResponse(String response) {
		this.response = response;
	}
	public List<Data> getData() {
		return data;
	}
	public void setData(List<Data> data) {
		this.data = data;
	}
	public requestStatus getRequestStatus() {
		return requestStatus;
	}
	public void setRequestStatus(requestStatus requestStatus) {
		this.requestStatus = requestStatus;
	}
	
	

}
