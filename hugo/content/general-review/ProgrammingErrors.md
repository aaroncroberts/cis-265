---
title: Programming Errors
categories: [ 'info', 'java', 'conventions' ]
---
# Overview

Several programming errors can come up.

## Compiler Errors

Compiler errors are syntax issues in the program which will prevent the java compiler from producing the bytecode.  These errors are output to the console with when the `javac` command is executed.

The [ShowSyntaxErrors.java](../../programs/basic/showsyntaxerrors) is an example file that will not compile.

````
    javac ShowSyntaxErrors.java
````

## Runtime Errors

Runtime errors take place during program execution.

The [ShowRuntimeErrors.java](../../programs/basic/showruntimeerrors) is an example program with a runtime error of trying to divide by 0.  This will generage an ArithmeticException at runtime.

## Logic Errors

Logic errors take place when a program doesn't function as intended.  

The [ShowLogicErrors.java](../../programs/basic/showlogicerrors) is an example program with a logic error.  This incorrectly calculates a temp comnversion from C to F.

Dividing two integers gives an integer result.  The correct calculation requires using a double as the numerator: 9.0.