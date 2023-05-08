
# LAB-3
***************************
# Question:
***************************
<br> Todays Lab
<br> Create a java program, that stores the details of a student (Name, Register Number, Email, Class, Department).
<br> You can use a two-dimensional array to store the details.
<br> HINT: String arr[] = {{"Alwin","1847207","alwin@christ.in","MCA","Computer Science"},{"Balagangadhar","2011204","bala@christ.in","MDS","Data Science"}}
<br> 
<br> You need to have functions to:
<br> Collect the details of the student
<br> Display the details of the student
<br> Search the details of the student
<br> With the help of a menu-driven main function, you need to access these functions inside your class and perform the operations.
<br> 
<br> Whenever you are entering the details of a student, you need to enter the value into a static global string array, that stores the names that the user has entered. Searching this array will help you to find if the details of the student are already entered into the program.
<br> 
<br> You will have a function to perform this search operation, which can be used to implement two functionality in the code
<br> To check if the name is already entered
<br> While searching for a name, you can identify the index of the two-dimensional array to print the details directly.
<br> In the end, you will have
<br> Four functions inside your lab program class including your main class
<br> One static String array storing the names (note the program can store up to 1024 students)
<br> One two-dimensional string array storing the details of up to 1024 students
<br> A menu-driven main method implementing the functions and functionality
<br> Plan your program with a flow chart before starting with coding.
<br> Since you are using functions, plan what should be the returning values and how to implement them.

*************************************************************************************************************************************************************************

************************************
# Approach for this Question:
************************************
* Declare a class named "StudentDetails" with the following instance variables:

* String name
* String regNo
* String email
* String class
* String department
* Declare a two-dimensional string array named "studentArray" of size 1024 x 5 to store the details of the students.

* Declare a static string array named "studentNames" of size 1024 to store the names of the students.

* Declare a static integer variable named "numberOfStudents" to keep track of the number of students added to the program.

* Declare the following methods inside the "StudentDetails" class:


### Implement the "addStudentDetails()" method as follows:

<br> Prompt the user to enter the name, register number, email, class and department of the student.
<br> Check if the name is already present in the "studentNames" array.
<br> If the name is already present, display an error message and return.
<br> If the name is not present, add the details of the student to the "studentArray" and "studentNames" arrays.
<br> Increment the "numberOfStudents" variable.
<br> Implement the "displayStudentDetails()" method as follows:
<br> 
###  Prompt the user to enter the name of the student whose details need to be displayed.
<br> Call the "searchStudentByName()" method to get the index of the student in the "studentArray".
<br> If the index is -1, display an error message.
<br> If the index is not -1, display the details of the student.
<br> Implement the "searchStudentByName()" method as follows:

### Prompt the user to enter the name of the student to search for.
<br> Loop through the "studentNames" array to find the index of the student.
<br> If the student is found, return the index.
<br> If the student is not found, return -1.
<br> Implement the "menu()" method as follows:
<br> 
###  Display a menu with the following options:
<br> Add student details
<br> Display student details
<br> Exit
### Prompt the user to enter their choice.
<br> If the choice is 1, call the "addStudentDetails()" method.
<br> If the choice is 2, call the "displayStudentDetails()" method.
<br> If the choice is 3, exit the program.
<br> Implement the main method as follows: 
<br> Create an instance of the "StudentDetails" class.
<br> Call the "menu()" method of the instance in a loop until the user chooses to exit.

*********************************************************************************************************************************************************************************


********************************
# Out Put Details:
********************************

<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA> cd lab-3
<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-3> java lab3.java
<br> ########### MENU ##############
<br> ## 1. Collet Student Details###
<br> ## 2. Display Details #########
<br> ## 3. Search a student ########
<br> ## 4. Quit              #######
<br> ###############################
<br> Enter your choice: 
<br> 1
<br> Enter the Name: Md Aamir
<br> 
<br> Enter the Reg No: 22122027
<br> 
<br> Enter the Email Id: md.aamir@msds.christuniversity.in
<br> 
<br> Enter your Class:
<br> msds-a
<br> 
<br> Enter your Department:
<br> Data Science
<br> ########### MENU ##############
<br> ## 1. Collet Student Details###
<br> ## 2. Display Details #########
<br> ## 3. Search a student ########
<br> ## 4. Quit              #######
<br> ###############################
<br> Enter your choice:
<br> 2
<br> Name is : Md Aamir
<br> Reg NO is : 22122027
<br> Email is : md.aamir@msds.christuniversity.in
<br> Class is : msds-a
<br> Dept is : Data Science
<br> 
<br> ########### MENU ##############
<br> ## 1. Collet Student Details###
<br> ## 2. Display Details #########
<br> ## 3. Search a student ########
<br> ## 4. Quit              #######
<br> ###############################
<br> Enter your choice 
<br> 3




