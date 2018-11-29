package com.firstone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.firstone.dao.empldaoimpl;
import com.firstone.dao.empldaointerface;
import com.firstone.model.emp;
@Service
@Transactional
public class emplserviceimpl implements emplserviceinterface {
	
	@Autowired
	private empldaointerface emplserviceinterface;
	@Override
    @Transactional
	public List<emp> getempl(){
		return emplserviceinterface.getallemp();
	}
	@Override
    @Transactional
public void addempl(emp el) {
		emplserviceinterface.addempl(el);
}
}
