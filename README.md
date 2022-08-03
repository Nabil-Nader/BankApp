# BankApp
live Project For Open Bank app


# Objective

To create a REST end point that will return a List of mocked up transactions, and build tests to ensure functionality.



# Importance to project

In this milestone, you will lay the foundation for the rest of project. As you iterate, you will build on this skeleton project, adding capabilities. Here you will an inviolable contract that downstream systems will use as they consume your REST service.


# Workflow

Create a Spring Boot project using Spring Initializr. Select Gradle Project, the current stable Spring Boot 2.3.X release (2.3.8 as of this writing), Packaging Jar, Java 11. Search for and select Spring Web and Lombok as a dependencies, for now. You will add more later.

Create a Transaction class with the fields: type, date, accountNumber, currency, amount, merchantName, and merchantLogo.

Create a TransactionService class. Add a method findAllByAccountNumber, which should return a List of Transactions. For now, have it return an empty List.

If you have not done so already, create test class for TransactionService using JUnit. It should expect 3 to 5 Transactions. If you run this test now, it should fail, since the TransactionService only returns an empty list.

Update the findAllByAccountNumber method of TransactionService class to return the List of a 3 to 5 Transactions. The number of Transactions in your list should match the number that you expect in the test class from the previous step. If you were to re-run your test, it should now pass.

Create a TransactionController class with the endpoint /transactions. This endpoint should accept a path parameter accountNumber. This should return the results for the TransactionService. that will return the values of the service in JSON format.
