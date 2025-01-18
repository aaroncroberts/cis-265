# Overview

A java program is written in files with the extension `.java` and must have at least one class. A java program is executed from the `main` method. A program may consist of several classes in files.  By convention, every class begins with an upper letter, and classes are seperated into individual files.

## Compiling 

Compile the java file by running the following command from the terminal.  The command references the file in the same directory:

````
    javac Welcome.java
````

This will compile the source code .java file into bytecode with a .class file extension.  Welcome.java -> Welcome.class.

The bytecode file is similar to machine instructions, and will run on any platform with a JVM (Java Virtual Machine).

Executing a program runs the bytecode created during the compile.  The JVM is an interpreter that converts the bytecode to the target machine language code and executes it immediately.  

**This is done for each individual bytecode instruction**, not the full program as a single unit.

## Executing Bytecode

To run the Welcome.class bytecode, or execute the program, run:

````
    java Welcome
````

## Simple Programs

* [Welcome](src/Welcome.java) 
* [Welcome With Three Messages](src/WelcomeWithThreeMessages.java)
* [Compute Expresssion](src/ComputeExpression.java)
* [Compute Area](src/ComputeArea.java)
* [Compute Area With Console Input](src/ComputeAreaWithConsoleInput.java)
* [Compute Average](src/ComputeAverage.java)

## Programs with Input

* [Compute 3 number average](src/ComputeAverage.java)
* [Farenheit To Celsius](src/FarenheitToCelsius.java)
* [Display Time](src/DisplayTime.java)
* [Sales Tax](src/SalesTax.java)
* [Compute Loan](src/ComputeLoan.java)
* [Compute Change](src/ComputeChange.java)
* [Addition Quiz](src/AdditionQuiz.java)
* [Subtraction Quiz](src/SubtracionQuiz.java)