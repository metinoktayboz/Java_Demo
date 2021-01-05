package com.springdemo;

public class CustomerManager implements ICustomerService {
	
	private ICustomerDal customerDal;
	
	//constructer injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}

	public void add() {
		
		customerDal.add();
		
	}

}
