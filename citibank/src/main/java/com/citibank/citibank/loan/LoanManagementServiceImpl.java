package com.citibank.citibank.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("loanManagementService")
public  class LoanManagementServiceImpl implements LoanManagementService {
	
	
	@Autowired
	CustomerManagementServiceImpl customerManagementServiceImpl;
	@Override
	public void saveLoan() {
		
		customerManagementServiceImpl.getCustomer();
		
		customerManagementServiceImpl.saveCustomer();
		
		
	}
	
	
	
}
