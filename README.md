\# Loan Decision Engine



A small Java showcase project implementing a rule-based loan decision engine.



The project demonstrates object-oriented Java development, separation of business rules and decision logic, automated testing with JUnit, and a reproducible Maven build.



\## Business Rules



A loan application is approved only if all configured rules are satisfied:



\- Disposable income >= 1,000 EUR

\- Loan amount <= 20,000 EUR

\- Applicant age >= 18 years

\- Employment duration >= 12 months



\## Architecture



The application separates loan application data, business rules and decision logic.



\- `LoanApplication` - represents the loan application data

\- `LoanRule` - common interface for business rules

\- `IncomeRule` - validates disposable income

\- `LoanAmountRule` - validates the requested loan amount

\- `AgeRule` - validates the applicant's age

\- `EmploymentRule` - validates employment duration

\- `LoanDecisionService` - evaluates all configured rules

\- `Decision` - represents APPROVED or REJECTED



The `LoanDecisionService` operates on `LoanRule` implementations, allowing additional business rules to be added without changing the central evaluation logic.



\## Technologies



\- Java 25

\- Maven

\- JUnit 5

\- Git



\## Build and Test



Run the automated tests:



```bash

mvn test

