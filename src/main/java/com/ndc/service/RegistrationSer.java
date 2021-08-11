package com.ndc.service;

import java.util.ArrayList;
import java.util.List;

import com.ndc.Request.RegistrationReq;
import com.ndc.Response.Data;
import com.ndc.Response.requestStatus;
import com.ndc.ResponseImpl.RegistrationImpl;

public class RegistrationSer {
	

	private int validateData(RegistrationReq request) {
		
		if (request.getChannel() == null || request.getChannel() == "") {
			
			return -1;
			
		}
		
		return 0;
		
	}
	
	public RegistrationImpl Registration(RegistrationReq request) {
		Data data = new Data();
		List<Data> tdata = new ArrayList<Data>();
		requestStatus st = new requestStatus();
		RegistrationImpl impl = new RegistrationImpl();
		
		int valid = validateData(request);
		
		if(valid != 0) {
			impl.setResponse("Parameter Validation error");
			impl.setData(tdata);
			impl.setRequestStatus(st);
			return impl;
			
		}
		
		st.setCode("00");
		st.setMessage("Successfull");
		
		data.setCustomer_No("00006094");
		data.setCustomer_Name("_CUSTOMER_NAME1");
		data.setType("I");
		data.setStatus("Active");
		
		tdata.add(data);
		
		data = new Data();
		
		data.setCustomer_No("0000609");
		data.setCustomer_Name("Zaigi");
		data.setType("I");
		data.setStatus("Active");
		
		tdata.add(data);
		
		impl.setResponse("Transaction Completed Successfully.");
		impl.setData(tdata);
		impl.setRequestStatus(st);
		
		
		
		
		return impl;
	}
	
	
}
