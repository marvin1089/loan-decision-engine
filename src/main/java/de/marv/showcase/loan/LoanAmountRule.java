package de.marv.showcase.loan;

public class LoanAmountRule implements LoanRule{

	@Override
	public boolean isSatisfiedBy(LoanApplication application) {
		// TODO Auto-generated method stub
		 return application.getLoanAmount() <= 20000;
	}

	@Override
	public String getRejectionReason() {
		// TODO Auto-generated method stub
		return "Loan amount higher than 20k";
	}

}
