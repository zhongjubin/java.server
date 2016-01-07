package com.ssh.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import com.ssh.beans.Agv;
import com.ssh.forms.AgvForm;

public interface BaseDao {
	
	public SessionFactory getSessionFactory();
	
	public void setSessionFactory(SessionFactory sessionFactory);

	public void saveObject(Object obj) throws HibernateException;
	
	public List<Agv> getObject();

}
