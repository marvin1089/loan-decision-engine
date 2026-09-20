package de.marv.showcase.loan;

public class LoanApplication {
	
	private int monthlyIncome;
	private int monthlyExpenses;
	private int loanAmount;
	private int age;
	private int employmentMonths;
	
	public LoanApplication(int monthlyIncome, int monthlyExpenses, int loanAmount, int age, int employmentMonths) {
		super();
		this.monthlyIncome = monthlyIncome;
		this.monthlyExpenses = monthlyExpenses;
		this.loanAmount = loanAmount;
		this.age = age; 
		this.employmentMonths = employmentMonths;
	}

	public int getMonthlyIncome() {
		return monthlyIncome;
	}

	public int getMonthlyExpenses() {
		return monthlyExpenses;
	}

	public int getLoanAmount() {
		return loanAmount;
	}

	public int getAge() {
		return age;
	}

	public int getEmploymentMonths() {
		return employmentMonths;
	}
	
	
	
	

}
