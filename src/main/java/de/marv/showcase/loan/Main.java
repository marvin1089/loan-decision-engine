package de.marv.showcase.loan;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
		System.out.println("Loan decision engine started");
		
		    System.out.println("Enter income and expenses, loan amount, applicant age and employment duration in months");
		    System.out.print("Income: ");
		    Scanner myObj = new Scanner(System.in);
		    
		    int income = myObj.nextInt();
		   
		    
		    System.out.print("expense: ");
		    int expense = myObj.nextInt();

		    System.out.print("loan: ");
		    int loan = myObj.nextInt();
		    
		    System.out.println("Enter applicant age:");
		    int age = myObj.nextInt();

		    System.out.println("Enter employment duration in months:");
		    int employmentMonths = myObj.nextInt();
		    		
		    LoanApplication application = new LoanApplication(income, expense, loan, age, employmentMonths);

		    LoanDecisionService decisionService = new LoanDecisionService();

		    Decision decision = decisionService.evaluate(application);

		    System.out.println("Decision: " + decision);
	}
	
	

}
