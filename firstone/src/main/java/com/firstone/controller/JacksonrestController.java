package com.firstone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.firstone.model.emp;
import com.firstone.service.emplserviceinterface;

@RestController
public class JacksonrestController {

	@Autowired
	private emplserviceinterface esi;

//	@GetMapping("/get")
	public ResponseEntity<List<emp>> get1() {

		List<emp> em = esi.getempl();
		return ResponseEntity.ok().body(em);
	}

}
