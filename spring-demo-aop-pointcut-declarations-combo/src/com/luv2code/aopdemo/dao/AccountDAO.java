package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component
public class AccountDAO {
	
	private String name;
	private String serviceCode;
	
	public void addAccount(Account account, boolean vipFlag) {
		System.out.println(getClass() + ": DB Work => Adding Account to DB");
	}
	
	public boolean doWork() {
		System.out.println(getClass() + ": DB Work => Doing work to DB on Account");
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	
}
