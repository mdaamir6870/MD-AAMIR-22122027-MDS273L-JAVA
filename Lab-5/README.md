
# Lab 5
*******************
# Question:
*******************

<br> Create a new folder in GitHub named 'Lab 5' for today's lab and solve the question.
<br> 
<br> Question
<br> 
<br> Below is an encryption/decryption standard in which the letters in the message will be replaced with the letters in the cypher row

<br> Plaintext:  THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG
<br> 
<br> Ciphertext: QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD
<br> 
<br> You are supposed to create a menu-driven program that can encrypt or decrypt a message that the user wishes to transfer.
<br> Your program should have two functions, one for encryption and another for decryption. Each function will accept a string message and return the encrypted or decrypted message.

**************************************************************************************************************************************************************************************

*******************************
# Approach For this Question:
******************************
* we have defined two functions - encrypt and decrypt - that accept a message string and use the str.maketrans and translate functions to perform the encryption/decryption using the given standard.

* The encrypt function takes a string message as input and returns the encrypted message as a string. It iterates over each character in the message, checks if it's a letter, and maps it to the corresponding letter.

* The decrypt function takes a string ciphertext as input and returns the decrypted message as a string. It works in a similar way to the encrypt function, but maps each letter in the ciphertext back to its original letter in the plain row.

* The main function uses a while loop to repeatedly prompt the user for input until they choose to quit. Each iteration of the loop reads a choice from the user and calls the appropriate function based on that choice. Invalid choices are handled with an error message.

*******************************************************************************************************************************************************************************************
 
 
 ****************************
 # OUT PUT DEATAILS HERE
 ****************************

**************************************************************************************************************
<br>  PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\Lab-5> java lab5.java
<br> 
<br> Enter E to encrypt, D to decrypt, or Q to quit: E
#### Enter plaintext message:
* Enter plaintext message: Hello I am Aamir do not tell to pooja i am comming tomorrow. 
#### Ciphertext: EBIIL F XJ XXJFO AL KLQ QBII QL MLLGX F XJ ZLJJFKD QLJLOOLT.
<br> 
****************************************************************************************************************
<br> 
*  Enter E to encrypt, D to decrypt, or Q to quit: D

#### BEnter ciphertext message: 
* BEnter ciphertext message: EBIIL F XJ XXJFO AL KLQ QBII QL MLLGX F XJ ZLJJFKD QLJLOOLT.
 
#### Plaintext: HELLO I AM AAMIR DO NOT TELL TO POOJA I AM COMMING TOMORROW.

<br> Enter E to encrypt, D to decrypt, or Q to quit: Q
<br> PS C:\Users\yrmda\MD-AAMIR-22122027-MDS273L-JAVA\Lab-5>

*******************************************************************************************************************************


***************************
# Flow Chart
***************************




![lab5](https://github.com/mdaamir6870/MD-AAMIR-22122027-MDS273L-JAVA/assets/97155542/91d66cfb-3107-4189-ac5f-a30cb03258dc)


