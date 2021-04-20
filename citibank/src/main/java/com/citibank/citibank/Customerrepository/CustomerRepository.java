package com.citibank.citibank.Customerrepository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.citibank.citibank.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{
	
}