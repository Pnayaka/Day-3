package org.springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext appContext = new ClassPathXmlApplicationContext("bean.xml");

    	Registration userreg = (Registration) appContext.getBean("registration");
    	    	    	
		userreg.doRegisterUser("Virtusa");
		System.out.println("///////////////////////////////////");
		
		userreg.doRegisterUser("Virtusa123");
		
	}

}
