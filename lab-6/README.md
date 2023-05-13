# Lab 6
************************************************************************************************************************************************
<br>Create a Student class, that will store the details of the Student, below mentioned are the attributes of a student.
<br>Reg. No.
<br>Name
<br>Email
<br>Phone
<br>Class
<br>Department
<br>The Student class will have the following methods:
<br>A constructor to initialize the values of the Student
<br>A method to print the Details of the Student.
<br>A method (named 'toString()) that convert the student details to string, and can be used to write the student <br>details to file.
<br>In the main-method class, create an array of Student Class to hold maximum details of 100 Students.
<br>
<br>In the menu-driven program, the menu options will have
<br>Add a student
<br>Adds the details of 1 student to the array of Student.
<br>Search for a student
<br>Search for the details of a student from the array of Student.
<br>Searching can be done with Name or Register Number.
<br>Update the details of a student
<br>Update the student details based on the search based on name or register number.
<br>Display all students
<br>Displays the details of all students.
<br>Save the details of each student in a file, with the student name as filename.
<br>
<br>Note: Make use of functions to implement the menu options.
<br>
<br>Once the program is complete
<br>Add the code to GitHub under the folder Lab 6.
<br>Create a README.md file for documentation.
<br>Add proper comments in the code.
<br>Create a flowchart using the online tool and update the README.md file.
<br>Update the changes to the GitHub website and submit the URL.
*********************************************************************************************************************************

******************************************************
 # Approach For This Question
 *****************************************************
 
* Create a Student class with the given attributes and methods.
* Create a Main class with a main method.
* Declare an array of Student objects with a maximum size of 100.
* Implement a menu-driven program using a while loop.
* For the "Add a student" option, create a new Student object and add it to the array.
* For the "Search for a student" option, prompt the user for a name or register number and loop through the array to find a match.
* For the "Update the details of a student" option, prompt the user for a name or register number, find the corresponding Student object in the array, and update its attributes.
* For the "Display all students" option, loop through the array and print the details of each Student object.
* For the "Save the details of each student in a file" option, loop through the array and use the toString() method to convert each Student object to a string. Then, write each string to a file with the student name as the filename.
**********************************************************************************************************************************
**********************************************************************************************************************************

***********************************
#  Output Details:
***********************************
  - PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA> cd lab-6
  - PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-6> javac lab6.java
  - PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-6> java lab6
  - Press 1 to Enter new Student Details
  - Press 2 to Search for a Name
  - Press 3 to Update any Student Detail
  - Press 4 to display all the Student details
  - Press 5 to write info to file
  - Press 6 to Exit the program
  - Enter Your Choice: 1
  - Enter Name: aamir
  - Enter Reg No.: 22122027
  - Enter Class Name: msdsa
  - Enter Phone No.: 9523235723
  - Enter Email ID: md.aamir@gmail.com
  - Enter Department Name: data science
  - -------------------------------------------------------------------
  - Press 1 to Enter new Student Details
  - Press 2 to Search for a Name
  - Press 3 to Update any Student Detail
  - Press 4 to display all the Student details
  - Press 5 to write info to file
  - Press 6 to Exit the program
  - Enter Your Choice: 2
  - Enter the name or reg no. to search: 22122027
  - Name: aamir
  - reg No.: 22122027
  - email: md.aamir@gmail.com
  - phone: 9523235723
  - Class: msdsa
  - Department: data science
  - 
  - Press 1 to Enter new Student Details
  - Press 2 to Search for a Name
  - Press 3 to Update any Student Detail
  - Press 4 to display all the Student details
  - Press 5 to write info to file
  - Press 6 to Exit the program
  - Enter Your Choice:
  - 
  - Out Put Details :
  - Press 1 to Enter new Student Details
  - Press 2 to Search for a Name
  - Press 3 to Update any Student Detail      
  - Press 4 to display all the Student details
  - Press 5 to write info to file
  - Press 6 to Exit the program
  - Enter Your Choice: 1
  - Enter Name: aamir
  - Enter Reg No.: 22122027
  - Enter Class Name: msdsa
  - Enter Phone No.: 9523235723
  - Enter Email ID: md.aamir@msds.christuniversity.in
  - Enter Department Name: data science
-------------------------------------------------------------------
  - Press 1 to Enter new Student Details
  - Press 2 to Search for a Name
  - Press 3 to Update any Student Detail
  - Press 4 to display all the Student details
  - Press 5 to write info to file
  - Press 6 to Exit the program
  - Enter Your Choice: 2
  - Enter the name or reg no. to search: aamir
  - Name: aamir
  - reg No.: 22122027
  - email: md.aamir@msds.christuniversity.in
  - phone: 9523235723
  - Class: msdsa
  - Department: data science

  - Press 1 to Enter new Student Details
  - Press 2 to Search for a Name
  - Press 3 to Update any Student Detail
  - Press 4 to display all the Student details
  - Press 5 to write info to file
  - Press 6 to Exit the program
  - Enter Your Choice:
  ******************************************************************************************************************************
  
  # Flow Chart
  *******************
  
![lab6](https://github.com/mdaamir6870/MD-AAMIR-22122027-MDS273L-JAVA/assets/97155542/61225759-caf7-4111-91c8-ec1e66cb34a4)
