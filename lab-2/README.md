# LAB-2
**********************
# Question:
*********************

<br> Lab Exercise Question
<br> You are supposed to create a menu-driven program that has the following menu options:
<br> * Enter a name
<br> * Search for a name
<br> * Remove a name
<br> Show all names
<br> Note:
<br> The menu-driven program has to be made with the help of a do-while loop and switch-case statements.
<br> Constraints:
<br> The names collected must be stored in an array with a max length of 1024.
<br> The names in the array should be UNIQUE; no duplicate entries are expected!
<br> Provide necessary validations that the user enters only valid names that are not going to be repeated.
<br> Removing a name should not create empty space inside the array!
<br> Format your results properly!!

******************************************************************************************************************************************************************

***********************************
# Approach for this Question:
* ******************************
* Declare a String array to store the names, with a maximum length of 1024.
 
* Create a variable to keep track of the number of names currently stored in the array. Initialize it to 0.
 
* Create a do-while loop that displays the menu options until the user chooses to exit.
 
* Inside the loop, display the menu options using System.out.println statements.
 
* Use the Scanner class to get the user's choice from the console.
 
* Use a switch-case statement to handle each menu option based on the user's choice.
 
* For "Enter a name" option, prompt the user to enter a name and check if it is not already present in the array. If the name is unique, add it to the array at the next available position and increment the counter. If the array is already full, display an error message.

* For "Search for a name" option, prompt the user to enter a name to search for, and then iterate through the array to check if it is present. If found, display the position of the name in the array. If not found, display a message indicating that the name was not found.

* For "Remove a name" option, prompt the user to enter the name to be removed. If the name is found in the array, remove it and shift all the names that come after it to the left by one position. Decrement the counter. If the name is not found, display an error message.
 
* For "Show all names" option, iterate through the array and display all the names that have been entered so far, with appropriate formatting.
 
* Add a default case in the switch statement to handle invalid menu choices.
 
* End the loop if the user chooses to exist.
****************************************************************************************************************************************************************************


***************************
# Out Put Details:
***************************
<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-2> java lab2.java
<br> ########### MENU ###########
<br> ## 1. Enter the name:    ###
<br> ## 2. Search for a name: ###
<br> ## 3. Remove a name:    ####
<br> ## 4. Print the name list ##
<br> ## 5. Quit              ####
<br> ############################
<br> Enter your choice:
<br> 1
<br> Enter your name: Md Aamir
<br> ########### MENU ###########
<br> ## 1. Enter the name:    ###
<br> ## 2. Search for a name: ###
<br> ## 3. Remove a name:    ####
<br> ## 4. Print the name list ##
<br> ## 5. Quit              ####
<br> ############################
<br> Enter your choice: 
<br> 1
<br> Enter your name: Alvin Sir
<br> ########### MENU ###########
<br> ## 1. Enter the name:    ###
<br> ## 2. Search for a name: ###
<br> ## 3. Remove a name:    ####
<br> ## 4. Print the name list ##
<br> ## 5. Quit              ####
<br> ############################
<br> Enter your choice:
<br> 1
<br> Enter your name: Preyashi Kumari
<br> ########### MENU ###########
<br> ## 1. Enter the name:    ###
<br> ## 2. Search for a name: ###
<br> ## 3. Remove a name:    ####
<br> ## 4. Print the name list ##
<br> ## 5. Quit              ####
<br> ############################
<br> Enter your choice:
<br> 2
<br> Which name your are searching?.
<br> Alvin Sir
<br> Name is found at position 2
<br> ########### MENU ###########
<br> ## 1. Enter the name:    ###
<br> ## 2. Search for a name: ###
<br> ## 3. Remove a name:    ####
<br> ## 4. Print the name list ##
<br> ## 5. Quit              ####
<br> ############################
<br> Enter your choice:
<br> 3
<br> Which name you want to delete. :
<br> Preyashi Kumari
<br> ########### MENU ###########
<br> ## 1. Enter the name:    ###
<br> ## 2. Search for a name: ###
<br> ## 3. Remove a name:    ####
<br> ## 4. Print the name list ##
<br> ## 5. Quit              ####
<br> ############################
<br> Enter your choice:
<br> 4
<br> Your list are: 
<br> Md Aamir,Alvin Sir,
<br> ########### MENU ###########
<br> ## 1. Enter the name:    ###
<br> ## 2. Search for a name: ###
<br> ## 3. Remove a name:    ####
<br> ## 4. Print the name list ##
<br> ## 5. Quit              ####
<br> ############################
<br> Enter your choice:
<br> 5
<br> Program will now wxit in 3.2.1..
<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-2> 








