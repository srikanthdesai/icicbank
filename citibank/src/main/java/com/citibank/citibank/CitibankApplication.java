package com.citibank.citibank;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.citibank.citibank.loan.LoanManagementService;

@SpringBootApplication
public class CitibankApplication  implements CommandLineRunner{
	
	 @Autowired
	    private LoanManagementService loanManagementService;
	 
	 

	public LoanManagementService getLoanManagementService() {
		return loanManagementService;
	}



	public void setLoanManagementService(LoanManagementService loanManagementService) {
		this.loanManagementService = loanManagementService;
	}



	public static void main(String[] args) {
		SpringApplication app=new SpringApplication(CitibankApplication.class);
		app.setBannerMode(Banner.Mode.CONSOLE);
		
		System.out.println("process.....");
		app.run(args);
		
		
	}
	
	

	@Override
	public void run(String... args) throws Exception {
		
		loanManagementService.saveLoan();
	}

}
