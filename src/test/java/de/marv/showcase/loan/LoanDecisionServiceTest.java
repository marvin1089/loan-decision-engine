package de.marv.showcase.loan;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LoanDecisionServiceTest {

	/*
	 * Test setting:
	 * Monthly income:      5,000 EUR
	 * Monthly expenses:    2,800 EUR
	 * Disposable income:   2,200 EUR   (required: >= 1,000 EUR)
	 * Loan amount:        15,000 EUR   (allowed:  <= 20,000 EUR)
	 * Applicant age:          36 years (required: >= 18 years)
	 * Employment duration:    48 months (required: >= 12 months)
	 *
	 * Expected result: APPROVED
	 * All defined loan rules are satisfied.
	 */
	
	
	 @Test
	    void validApplicationShouldBeApproved() {

	        LoanApplication application =
	                new LoanApplication(5000, 2800, 15000, 36, 48);

	        LoanDecisionService decisionService =
	                new LoanDecisionService();

	        Decision decision =
	                decisionService.evaluate(application);

	        assertEquals(Decision.APPROVED, decision);
	    }
	}