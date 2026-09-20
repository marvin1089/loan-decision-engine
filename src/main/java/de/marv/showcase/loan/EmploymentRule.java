package de.marv.showcase.loan;

public class EmploymentRule implements LoanRule {

    @Override
    public boolean isSatisfiedBy(LoanApplication application) {
        return application.getEmploymentMonths() >= 12;
    }

	@Override
	public String getRejectionReason() {
		// TODO Auto-generated method stub
		return "Employment duration is below 12 months";
	}

}
