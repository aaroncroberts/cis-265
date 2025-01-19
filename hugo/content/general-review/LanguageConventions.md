---
title: Language Conventions
categories: [ 'info', 'java', 'conventions' ]
---
# Overview

The language specification for Java consists of rules and conventions that developers must follow.  Some of those are captured here.

## Identifiers

Identifiers must follow these rules:


## Variables

## Assignment Statement and Expressions

variable = expression;

All assingment follows this pattern. Examples:

````
    int x = 0;
    double radius = 6.0;
    int y = 4;
    int x = y * 4;
    ...

    int y = j = k = 2;
````

## Named Constants

Named constants are special variables that can never change in a program.  A constant is also known as a *final variable* in Java. 

````
    final int CONSTANTNAME = 1;
````

`final` is a keyword used for defining a constant.  By convention, constants are in UPPER CASE.

The Math library uses these for values such as PI.

The [ComputeAreaWithConstant.java](src/ComputeAreaWithConstant.java) is an example program that uses the PI constant.

## Naming Conventions

* camel Case for variables and methods: myLocalVariable
* Proper Case for classes: MyClass
* Upper Case for constants, seperated by _ : MAX_VALUE_HERE

# Data Types

DataTypes are the foundations of the language.  There are two types of data types:  Raw and Objects.

## Raw / Primitive Data Types

Raw Data Types / Primitives only have values, they do not have ids. Some basic raw data types:

* int : -2 ^ 31 -1 - 2 ^ 31 (32 bit) | long / short / byte
* boolean: true / false
* double: 32 bit / float: 64 bit
* char: a single character


## Objects

Objects are classes.  Objects have IDs and are much different concepts that raw data types.

Object construction requires the use of the keyword `new`.

* Array's:

Array syntax does not require the keyword `new`:

    int[] numbers = { 1,2,3,4 };

## Primitive (raw) Data Type Operations

Raw data types have basic operations that can be used with the type:

* Arithmatic:

    ````
        double x = 3.0;
        x++;

        + - / * %     
        < << 
        > >> 
    ````

* Logical Operators:

    ````
        > >= < <=  == !=
        && ||
        bitwise:  & |
    ````
## Control Statements

Basic control structures:

* Sequence    
* Branch / Control
* Loop
    
### Sequence

Executed one by one, linear, top down:

````
    int x = 0;
    x++;

    x = x +5;
````

### Branch / Control

Logical control flow of if, else, switch:

````
    if()
    else

    ...

    for(int i = 0; i < 4; i++)

    ...

    while(true)

    ...

    do
    while();
    
    ...

    switch(x)
    {
        case 4 :
            {
                break;
            }        
    }
````