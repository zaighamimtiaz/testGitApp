package com.ndc.controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ndc.Request.RegistrationReq;
import com.ndc.ResponseImpl.RegistrationImpl;
import com.ndc.service.RegistrationSer;

@RestController
public class RegistrationController {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET , headers = "Accept=application/json")
    public String getEmployees() {
        return "Welcome!";
    }
    
    
    @RequestMapping(value = "/api/IB/RegistrationInfo", method = RequestMethod.POST , headers = "Accept=application/json")
    public RegistrationImpl Registration(@RequestBody RegistrationReq request) {
    	RegistrationSer registrationSer = new RegistrationSer();
    	return registrationSer.Registration(request);
    	
   }
}