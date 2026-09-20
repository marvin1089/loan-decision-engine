package de.marv.showcase.loan;

public interface LoanRule {
	
	 boolean isSatisfiedBy(LoanApplication application);
	 String getRejectionReason();
}
