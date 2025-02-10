---
title: Directory Search
categories: [ 'info', 'assignments' ]
date: 2025-02-08
---

## Assignment 3 - Directory Search

100 points
Due: 12:00pm, Monday, Feb. 10, 2025

## General Description

In this assignment, you will create a Java program to search recursively for files in a directory.

* The program must take two command line parameters:
    * First parameter is the folder to search for.
    * The second parameter is the filename to look for, which may only be a partial name.

* If incorrect number of parameters are given, your program should print an error message and show the
correct format.
* Your program must search recursively in the given directory for the files whose name contains the given
filename. Once a match is found, your program should print the full path of the file, followed by a newline.
* You can implement everything in the main class. You need to define a recursive method such as: `public static search(File sourceFolder, String filename).` For each subfolder in sourceFolder, you recursively call the method to search.
* A sample run of the program may look like this:

The following example searches in the “Code examples” directory any file with “Stack” in its name:

````
    Found C:\Code examples\book11ebychapters\build\classes\chapter10\StackOfIntegers.class
    Found C:\Code examples\book11ebychapters\build\classes\chapter10\TestStackOfIntegers.class
    Found C:\Code examples\book11ebychapters\build\classes\chapter11\MyStack.class
    Found C:\Code examples\book11ebychapters\build\classes\chapter19\GenericStack.class
    Found C:\Code examples\book11ebychapters\build\classes\chapter24\TestStackQueue.class
````

## Submission

This is an individual assignment. Each student needs to submit the source code files of the Java program on
Blackboard.

1. Please name the package after your last name, e.g., LuCIS265.
2. Please name the file after your last name, for example, ShahAssign3.java.
3. You need to only submit the source code, i.e., the Java files.
4. You may submit multiple times. Your most recent submission before the deadline will be graded.

## Grading

1. A program that does not run will receive 0 point.
2. There is a 10-20 points deduction for each major error, e.g., missing a file in the output.
3. There is a 1-9 points deduction for each minor error, e.g., a spelling error in printed message.
4. A program that does not follow the guidelines will lose 1-10 points.
5. Any type of cheating is not tolerated. You may be asked to explain your program in person.