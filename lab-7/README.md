# Lab 7
***************
# Question:
***************
* Create a new folder in git named 'Lab 7' for the following question and solve the * following: create a flowchart and document the results, constraints, etc., in the * README.md file for the lab.
* 
* Given the famous iris dataset, find the 5-point summary [Mean, Median, Mode, Min, * Max] for the attributes: SepalLengthCm, SepalWidthCm, PetalLengthCm, PetalWidthCm.
* 
* Once the overall summary statistics have been calculated, identify the summary * statistics for each Species of iris flower [Iris-setosa, Iris-versicolor, * Iris-virginica].
* 
* Present your results in the appropriate format and write the results in a file.


*************************************************************************************


******************************
# Approach of this Question :
******************************

* Load the iris dataset into a Java program. You can use a CSV file reader to do 
      this.

* Create an ArrayList to hold the data for each attribute:
    like  SepalLengthCm, * SepalWidthCm, PetalLengthCm, and PetalWidthCm.

* Traverse through each row of the dataset and add the values of each attribute   to * their respective ArrayList.

* Calculate the Mean, Median, Mode, Min, and Max of each ArrayList.
       We  can use * built-in functions to do this, such as Collections.sort() to sort the ArrayList, a nd *a loop to calculate the mean and mode.

* Create a HashMap to hold the summary statistics for each species of iris flower 
   like Iris-setosa  etc

* Traverse through each row of the dataset again and check the value of the         "Species" * column. 
 Depending on the value, add the attribute values to the appropriate * ArrayList in the HashMap.

* Calculate the Mean, Median, Mode, Min, and Max of each ArrayList in the HashMap.

* Write the summary statistics to a file. You can use a FileWriter or a PrintWriter to *do this.


**************************************************************************************************************************************************************************

***************************
# Out Put Details:
***************************




