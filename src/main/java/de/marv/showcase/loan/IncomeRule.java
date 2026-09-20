package de.marv.showcase.loan;

public class IncomeRule implements LoanRule {

    @Override
    public boolean isSatisfiedBy(LoanApplication application) {

        int disposableIncome =
                application.getMonthlyIncome() - application.getMonthlyExpenses();

        return disposableIncome >= 1000;
    }

	@Override
	public String getRejectionReason() {
		// TODO Auto-generated method stub
		return "Disposable income is below 1000 EUR";
	}
}