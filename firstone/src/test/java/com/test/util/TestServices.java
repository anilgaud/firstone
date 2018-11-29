package com.test.util;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.firstone.model.emp;
import com.firstone.service.emplserviceinterface;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:spring-mvc-servlet.xml"})
public class TestServices {
	@Autowired
	emplserviceinterface emplserviceinterface;
	
	@Test
	public void testRest() {
		List<emp> emps = emplserviceinterface.getempl();
		System.out.println(emps.size());
	}

}
