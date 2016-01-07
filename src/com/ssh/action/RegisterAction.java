package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.beans.Agv;
import com.ssh.forms.AgvForm;
import com.ssh.service.AgvManager;
import java.util.List;
import com.google.gson.Gson; 

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private AgvForm agv; 
	private AgvManager agvManager;
	private String json;
	
	public String getJson()
	{
		return json;
	}

	public void setJson(String json)
	{
		this.json=json;
	}

	public AgvForm getAgv() {
		return agv;
	}

	public void setAgv(AgvForm agv) {
		this.agv = agv;
	}
	
	public void setAgvManager(AgvManager agvManager) {
		this.agvManager = agvManager;
	}

	public String execute() {
		Gson gson = new Gson();
		try {
			agvManager.regAgv(agv);
			System.out.println(agv.getNetid()+" is registered!");
			List<Agv> agvlist = agvManager.listAgv();
			setJson(gson.toJson(agv));
			//System.out.println(getJson());
			return SUCCESS;
		}
		catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
