package org.springAOP.impl;

import org.springAOP.Registration;

public class Registrationimpl implements Registration{

	public String getUserDetails(int userid){
		System.out.println("addCustomerReturnValue() is running <<");
		return "abc";
	}
	
	public void doRegisterUser(String newUser){
		System.out.println("doRegisterUser() is running, args : " + newUser + "<<");
	}
	
}
