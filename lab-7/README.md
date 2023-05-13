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
<br>    iris.csv (The system cannot find the file specified)
<br>    PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-7> java lab7.java
<br>    |--------------------------------|
<br>    |       The Total Statistics     |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         SEPAL LENGTH           |
<br>    |--------------------------------|
<br>    |Mean            |5.8433347      |
<br>    |Median          |5.8            |
<br>    |Mode            |4.3            |
<br>    |Max             |7.9            |
<br>    |Min             |4.3            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         SEPAL WIDTH            |
<br>    |--------------------------------|
<br>    |Mean            |3.054          |
<br>    |Median          |3.0            |
<br>    |Mode            |2.0            |
<br>    |Max             |4.4            |
<br>    |Min             |2.0            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         PETAL LENGTH           |
<br>    |--------------------------------|
<br>    |Mean            |3.7586665      |
<br>    |Median          |4.4            |
<br>    |Mode            |1.0            |
<br>    |Max             |6.9            |
<br>    |Min             |1.0            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         PETAL WIDTH            |
<br>    |--------------------------------|
<br>    |Mean            |1.1986669      |
<br>    |Median          |1.3            |
<br>    |Mode            |0.1            |
<br>    |Max             |2.5            |
<br>    |Min             |0.1            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         SETOSA                 |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         SEPAL LENGTH           |
<br>    |--------------------------------|
<br>    |Mean            |5.0059996      |
<br>    |Median          |5.0            |
<br>    |Mode            |4.3            |
<br>    |Max             |5.8            |
<br>    |Min             |4.3            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         SEPAL WIDTH            |
<br>    |--------------------------------|
<br>    |Mean            |3.4180002      |
<br>    |Median          |3.4            |
<br>    |Mode            |2.3            |
<br>    |Max             |4.4            |
<br>    |Min             |2.3            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         PETAL LENGTH           |
<br>    |--------------------------------|
<br>    |Mean            |1.464          |
<br>    |Median          |1.5            |
<br>    |Mode            |1.0            |
<br>    |Max             |1.9            |
<br>    |Min             |1.0            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         PETAL WIDTH            |
<br>    |--------------------------------|
<br>    |Mean            |0.24399997     |
<br>    |Median          |0.2            |
<br>    |Mode            |0.1            |
<br>    |Max             |0.6            |
<br>    |Min             |0.1            |
<br>    |--------------------------------|
<br>    |--------------------------------|
<br>    |         VERSICOLOR             |
<br>    |--------------------------------|
<br>    Scanner closed
<br>    PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\lab-7> 

*******************************************************************************************************************************************************************

***************************
# Flow Chart
**************************



![lab7](https://github.com/mdaamir6870/MD-AAMIR-22122027-MDS273L-JAVA/assets/97155542/49cae6c4-29f5-4623-9429-c8e7202e8a8b)

