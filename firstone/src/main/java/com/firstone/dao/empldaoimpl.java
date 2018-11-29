package com.firstone.dao;
import com.firstone.model.emp;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.firstone.model.emp;

@Repository
public class empldaoimpl implements empldaointerface{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
	public void addempl(emp el)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(el);
	}
	@Override
	public List<emp> getallemp()
	{
		return sessionFactory.getCurrentSession().createQuery("from emp").list();
	}


}
