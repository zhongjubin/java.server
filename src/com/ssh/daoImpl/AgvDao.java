package com.ssh.daoImpl;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Session;

import com.ssh.beans.Agv;
import com.ssh.dao.BaseDao;
import com.ssh.forms.AgvForm;

@Service
@Transactional
public class AgvDao implements BaseDao {
	
	@Resource(name = "SessionFactory")
	private SessionFactory sessionFactory;
	Session session = null;
	
	public SessionFactory getSessionFactory() {
	        return sessionFactory;}
	   
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public void saveObject(Object obj)
	{
		session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
	}
	
	public List<Agv> getObject()
	{
		session = getSessionFactory().getCurrentSession();
		session.beginTransaction();
		List<Agv> agvs = (List<Agv>)session.createQuery("FROM Agv").list();
		session.getTransaction().commit();
		return agvs;
	}
}