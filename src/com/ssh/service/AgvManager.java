package com.ssh.service;

import java.util.List;

import com.ssh.beans.Agv;
import com.ssh.forms.AgvForm;


public interface AgvManager {

	public void regAgv(AgvForm agv);
	public List<Agv> listAgv();
}