

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
* transactions of type ArrayList<String> to store the transaction details.
* Create a constructor for the BankAccount class to initialize the instance variables.
* Create a method named deposit that takes a double value as input and adds it to the accountBalance.
* Create a method named withdraw that takes a double value as input and subtracts it from the accountBalance. If the balance becomes negative, do not allow the withdrawal and display an error message.
* Create a method named printTransactions that prints all the transactions stored in the transactions ArrayList.
* Create a method named printAccountSummary that prints the account number, account holder name, and account balance.
* In the main method, create an instance of the BankAccount class.
* Create a menu-driven program with the following options:
    *  Deposit money
    *  Withdraw money
    *  Print transactions
*  Print account summary
*  Exit
*  In the Deposit money option, prompt the user to enter the amount to deposit and call the deposit method to update the account balance.
  
* In the Withdraw money option, prompt the user to enter the amount to withdraw and call the withdraw method to update the account balance.
* In the Print transactions option, call the printTransactions method to display all the transaction details.
* In the Print account summary option, call the printAccountSummary method to display the account number, account holder name, and account balance.
* Repeat the menu until the user selects the Exit option.
 
 ******************************************************************************************************************************************************************
 
 ****************************
 # Out Put Details :
 ****************************
<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA> cd lab-4
<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-4> java lab4.java
<br> ############## MENU ##############
<br> ## 2. Deposit Money ##############
<br> ## 3. Withdraw Money #############
<br> ## 4. Print All the transctions. #
<br> ## 5. Print Account Summary. #####
<br> ## 6. Logout. ####################
<br> #####################################
<br> 2
<br> Enter the amount to deposit the money: 99999
<br> ############## MENU ##############
<br> ## 2. Deposit Money ##############
<br> ## 3. Withdraw Money #############
<br> ## 4. Print All the transctions. #
<br> ## 5. Print Account Summary. #####
<br> ## 6. Logout. ####################
<br> #####################################
<br> 3
<br> Enter the amount to withdraw the money: 
<br> 200
<br> ############## MENU ##############
<br> ## 2. Deposit Money ##############
<br> ## 3. Withdraw Money #############
<br> ## 4. Print All the transctions. #
<br> ## 5. Print Account Summary. #####
<br> ## 6. Logout. ####################
<br> #####################################
<br> 4
<br> Transction details are: 
<br> Money deposit : 99999.0 Time 11:11:29.378147800 Previous bal: 2.2222222E7 New bal2.2322221E7
<br> Money Withdraw : 200.0 Time 11:11:37.606586400 Previous bal: 2.2322221E7 New bal2.2322021E7
<br> ############## MENU ##############
<br> ## 2. Deposit Money ##############
<br> ## 3. Withdraw Money #############
<br> ## 4. Print All the transctions. #
<br> ## 5. Print Account Summary. #####
<br> ## 6. Logout. ####################
<br> #####################################
<br> 5
<br> welcome md aamir
<br> Current Login Time: 11:11:49.532468600
<br>  Your Account number is 22122027
<br> Yout total account balance is :2.2322021E7
<br> ############## MENU ##############
<br> ## 2. Deposit Money ##############
<br> ## 3. Withdraw Money #############
<br> ## 4. Print All the transctions. #
<br> ## 5. Print Account Summary. #####
<br> ## 6. Logout. ####################
<br> #####################################
<br> 6
<br> Thanks for using our bank.
<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-4>
 
 ****************************************************************************************************************************************************************************
 
 
 ********************************
 # Flow Chart
 *********************************
 
 
 ![aamir](https://github.com/mdaamir6870/MD-AAMIR-22122027-MDS273L-JAVA/assets/97155542/d3693feb-aa09-4f8c-ba55-9af8a33628bb)

 
 
 

 
