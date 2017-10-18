package com.pc.controller;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.pc.bean.RegistrationBean;
import com.pc.dao.RegisterDao;
import com.pc.model.Registration;




@Path("/users")
public class MyController {
	
	 Registration register;
	 RegistrationBean registerbean;
	 RegisterDao registerdao;
	
	
	
	 @POST
	    @Path("/create")
	    @Produces(MediaType.APPLICATION_JSON)
	//    public Response addResister(RegistrationBean registerbean){
	    public Response addregister(Registration register){
	/*	 register = new Registration();
		 registerbean = new RegistrationBean();
	    register.setName(registerbean.getName());
	    register.setEmail(registerbean.getEmail());
	    register.setPhoneno(registerbean.getPhoneno());
	    register.setPurpose(registerbean.getPurpose());
	    register.setPurposedescription(registerbean.getPurposedescription());*/
	            
	    RegisterDao dao = new RegisterDao();
		 
	  
	    dao.saveuserinfo(register);
	    return Response.ok().build();
	    }

}
