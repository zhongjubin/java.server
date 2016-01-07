package com.ssh.action;

import com.opensymphony.xwork2.ActionSupport;
import com.ssh.forms.AgvForm;
import com.google.gson.Gson; 

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	private AgvForm agv; 

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


	public String execute() {
		try {
			Gson gson = new Gson();
			setJson(gson.toJson(agv));
			System.out.println(agv.getNetid()+" checked in!");
			return SUCCESS;
		}
		catch (Exception e) {
			e.printStackTrace();
			return ERROR;
		}
	}

}
