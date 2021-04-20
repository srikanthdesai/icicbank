package com.citibank.citibank.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.citibank.citibank.Customerrepository.CustomerRepository;
import com.citibank.citibank.entity.Customer;

@Service("customerManagemaentService")

public class CustomerManagementServiceImpl implements CustomerManagemaentService {
	@Autowired
	CustomerRepository customerRepository;
	
	
	@Override
	public  void getCustomer() {
		
		System.out.println("welcome to customer Management ");
		
	}
	
	@Override
	public void saveCustomer() {
	
		Customer customer=new Customer();
		customer.setCusName("ravi");
		customer.setCusAge(25);
		customer.setCusAddres("lig");
		
		customerRepository.save(customer);
	

}

}
