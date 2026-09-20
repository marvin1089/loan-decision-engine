package de.marv.showcase.loan;

import java.util.List;

/*
 * Central service for evaluating loan applications.
 * Applies all configured LoanRule implementations to the application.
 * Returns REJECTED if one rule fails; otherwise returns APPROVED.
 */

public class LoanDecisionService {

    private final List<LoanRule> rules;

    public LoanDecisionService() {
        this.rules = List.of(
                new IncomeRule(),
                new LoanAmountRule(),
                new AgeRule(),
                new EmploymentRule()
        );
    }

    public Decision evaluate(LoanApplication application) {

        for (LoanRule rule : rules) {

            if (rule.isSatisfiedBy(application)==false) {
                return Decision.REJECTED;
            }
        }

        return Decision.APPROVED;
    }
}