package com.ssh.serviceImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssh.beans.Agv;
import com.ssh.dao.BaseDao;
import com.ssh.forms.AgvForm;
import com.ssh.service.AgvManager;

@Service
@Transactional
public class AgvManagerImpl implements AgvManager {

	private BaseDao dao;

	public void setDao(BaseDao dao) {
		this.dao = dao;
	}

	@Override
	public void regAgv(AgvForm agvForm) throws HibernateException {
		Agv agv = new Agv();
		BeanUtils.copyProperties(agvForm, agv);
		dao.saveObject(agv);
	}
	
	public List<Agv> listAgv()
	{
		List<Agv> agvlist =  dao.getObject();
		return agvlist;
	}

}
