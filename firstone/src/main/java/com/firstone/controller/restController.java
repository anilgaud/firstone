package com.firstone.controller;

import java.io.IOException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.firstone.service.emplserviceinterface;
import com.firstone.model.emp;
//import org.springframework.stereotype.Controller;

@RestController
@Path("/hello")
public class restController {

	@Autowired
	private emplserviceinterface esi;

	@GET
	@Path("/hello")
	// @Produces(MediaType.TEXT_XML)
	@Produces(MediaType.APPLICATION_JSON)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello Jersey" + "</hello>";
		/* return "hello rest"; */
	}

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public List<emp> get1() throws IOException {

		List<emp> empllist = esi.getempl();
		return empllist;

	}
	/*
	 * public String get() { return "abc"; }
	 */

}
