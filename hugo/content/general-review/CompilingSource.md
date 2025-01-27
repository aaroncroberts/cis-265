---
title: Compiling Source
categories: [ 'info', 'java', 'compiling' ]
---

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

## Packages

Java uses CLASSPATH, PATH, and other conventions to determine where packages are located for the compiler.  By default, packages are presuemd to be located a from the current directory in folders named for each value in the chain:

````java
    package com.test.mine;

    ...
````
In this example, in order for this package to work corrently, the files in the com.test.mine package need to be in folders beneath the current directory, named:  com \ test \ mine.  This is a standard Java convention for the linker during the compiling.

Compiler flags can also be used to help with pulling in additional class files during the compile.

## Compilier Parameters

Some options that can be passed to the javac command:

* `-sourcepath` instructs javac to look in this specific directory for your source files.
* `-d` specifies an output directory for your .class files.
* `-cp` instructs java to add this folder to its classpath.