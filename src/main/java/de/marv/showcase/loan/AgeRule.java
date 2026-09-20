package de.marv.showcase.loan;

public class AgeRule implements LoanRule {

    @Override
    public boolean isSatisfiedBy(LoanApplication application) {
        return application.getAge() >= 18;
    }

	@Override
	public String getRejectionReason() {
		// TODO Auto-generated method stub
		return "Applicant is under 18";
	}
}
