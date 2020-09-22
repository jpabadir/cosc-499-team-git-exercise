# cosc-406-team-git-exercise

The aim of this git exercise is to create a multi-purpose program, which will be able to do the following: 

1) Ask the user which of the below three actions (s)he wants to perfom
2) Execute the right action depending on the user's response. 

Possible actions: 

A) Convert a given sum in USDs to CAD (at a pre-programmed rate); </br>
B) Compute the product of 5 integers which the user inputs; </br>
C) Take a string from the user, and return the same string with all uppercase letters as lowercase, and vice-versa </br>

In all cases, we will deal with bad input from the user by using an if condition to check for such input, print an error message, and then interrupt the program. 

Each member of the team will implement one of the features A, B or C, and the fourth member will take care of the general driver, which is reponsible for asking the user what feature they want, and then executing the right piece of code. 

## Documentation of the features: 
<b>Main driver feature:</b>
This feature's purpose is to guide the user through using the program. It will first introduce the program, 
and then prompt the user to choose an action out of three possible functions the program can do. If the user provides valid input, 
the main driver then calls the appropriate function and prints to the user the appropriate output. If not, the main driver 
prints an error message to the user, and then terminates the program. 

<b>Conversion Feature:</b>
MainDriver.java's main method contains two methods for converting a user's numeric input from USD to CAD.
1) getNumericInput 
- Prompts the user to enter a value. If it is a number, that value will be returned, otherwise, the program will stop.
2) convert
- Takes in the double value that the user entered, and multiplies by it by the conversion rate from USD to CAD from 09/20/2020.
- Within MainTest.java is the junit test "testConvert" to ensure that the implemntation of the convert method works as expected.
3) double5
- Doubles the number 5 and outputs 25. Uses the doubled method to test that the double5 feature works.
4) triple10
- Triples the number 10 and outputs 1000. Uses the tripled method to test that the triple10 feature is working correctly.