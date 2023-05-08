

# Lab 4
***********************
# Question:
***********************
<br> Create a new folder 'Lab 4', in your repository that will hold today's program, README.md.

<br> Todays Program
 
#### Write a JAVA Menu driven program that does the following:
<br> You can ONLY have the below variables as global variables
<br> Account Number
<br> Account Holder Name
<br> Account Balance
#### You MUST have the below as functions
<br> To initialize the customer
<br> To deposit money
<br> To withdraw money
<br> To print the transactions
<br> To print account summary
#### Your menu will have the following operations once the customer is created
<br> To deposit money
<br> To withdraw money
<br> To print the transactions
<br> To print account summary

***********************************************************************************************************************************************************

******************************
# Approach for this Question
******************************

*  Create a class named BankAccount.
####  Define the following instance variables:
      * accountNumber of type String.
      * accountHolderName of type String.
      * accountBalance of type double.
#### transactions of type ArrayList<String> to store the transaction details.
#### Create a constructor for the BankAccount class to initialize the instance variables.
#### Create a method named deposit that takes a double value as input and adds it to the accountBalance.
#### Create a method named withdraw that takes a double value as input and subtracts it from the accountBalance. If the balance becomes negative, do not allow the withdrawal and display an error message.
#### Create a method named printTransactions that prints all the transactions stored in the transactions ArrayList.
#### Create a method named printAccountSummary that prints the account number, account holder name, and account balance.
#### In the main method, create an instance of the BankAccount class.
#### Create a menu-driven program with the following options:
    *  Deposit money
    *  Withdraw money
    *  Print transactions
#### Print account summary
#### Exit
#### In the Deposit money option, prompt the user to enter the amount to deposit and call the deposit method to update the account balance.
  
#### In the Withdraw money option, prompt the user to enter the amount to withdraw and call the withdraw method to update the account balance.
#### In the Print transactions option, call the printTransactions method to display all the transaction details.
#### In the Print account summary option, call the printAccountSummary method to display the account number, account holder name, and account balance.
#### Repeat the menu until the user selects the Exit option.
