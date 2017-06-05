package com.lee.action;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.lee.model.TUser;
import com.lee.service.IUserService;
import com.opensymphony.xwork2.ModelDriven;

@Controller
public class UserAction implements ModelDriven<TUser>{
	
	private TUser model = new TUser();
	@Resource
	private IUserService service;
	
	public String query(){
		service.queryAll(model);
		System.err.println("-----火车跑过------");
		return "";
	}
	
	@Override
	public TUser getModel() {
		// TODO Auto-generated method stub
		return model;
	}

}
