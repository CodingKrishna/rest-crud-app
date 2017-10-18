package com.pc.controller;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;

import com.pc.dao.RegisterDao;
import com.pc.model.Registration;



@Path("welcome")
public class Messagecontroller {
	Registration register;
	RegisterDao rdao;
	@GET
	@Path("/enter/{id}/{name}/{email}/{phoneno}/{purpose}/{purposedescription}")
	@Produces("text/html")
	
	public  String recieve(@PathParam("id") int id,@PathParam("name") String name,@PathParam("email") String email,@PathParam("phoneno")long phoneno,@PathParam("purpose")String  purpose,@PathParam("purposedescription")String purposedescription){
		System.out.println(id+""+name);
		System.out.println("hello");
		 register = new Registration();
		register.setName(name);
		register.setEmail(email);
		register.setPhoneno(phoneno);
		register.setPurpose(purpose);
		register.setPurposedescription(purposedescription);
	    rdao = new RegisterDao();
		rdao.saveuserinfo(register);
		return "hello";
		
	}
	@GET
	@Path("users")
	 @Produces("application/json")
    public List<Registration> getEmployee() {
       rdao = new RegisterDao();
      List<Registration> userslist = rdao.getAllUsers();
      
      System.out.println(userslist);
        return userslist;
    }
	
	@DELETE
	@Path("/{id}") 
	@Produces(MediaType.APPLICATION_JSON) 
	public int  deleteuser(@PathParam("id") long  id) {
		System.out.println(id);
		rdao = new RegisterDao();
	int deletedvalue=	rdao.deleteuser(id);
		System.out.println("deleted"+id);
		System.out.println(deletedvalue);
		return deletedvalue;
		
		
	}
	@GET
	@Path("/userid/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Registration registerdata(@PathParam("id") long id){
		register = new Registration();
		rdao = new RegisterDao();
	register=	rdao.getuserbyid(id);
	return register;
	}
	
	@GET
	//@Path("/getuserid")
	@Path("/getuserupdated/{id}/{name}/{email}/{phoneno}/{purpose}/{purposedescription}")
	@Consumes(MediaType.APPLICATION_JSON)
	 public Response getUserDetails(@PathParam("id") long id,@PathParam("name") String name,@PathParam("email") String email ,@PathParam("phoneno") long phoneno ,@PathParam("purpose") String purpose, @PathParam("purposedescription") String purposedescription){
		 
		register = new Registration();
		register.setId(id);
		register.setName(name);
		register.setEmail(email);
		register.setPhoneno(phoneno);
		register.setPurpose(purpose);
		register.setPurposedescription(purposedescription);
		rdao = new RegisterDao();
		 rdao.updateuser(register);
		
	return Response.status(200).build();
		
	}
}
