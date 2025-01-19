---
title: Guidelines
---
# Overview

Programming assignment guidelines posted online:
[Blackboard - Progamming Guidelines](https://bb-csuohio.blackboard.com/ultra/courses/_184005_1/outline/file/_7315096_1)

## Guidelines for Programming Assignments

* Every program must include your name, CSU ID, the Assignment #, and a short
description of the assignment.

For example:

````
    /*
    * Name: Super Mario
    * CSU ID: 1234567
    * CIS 265: Assignment #1
    * Description: Computing the average life of a light bulb
    */
````

* Every variable should have a meaningful name (this includes class/method names). 
For instance, a variable named X is less meaningful that one called monthlyInterestRate.
* Provide Comments for non-obvious code.
* One statement per line.
* Indent new blocks with 4 spaces, e.g.,

````
    public void method() {
        if (condition()) {
            try {
                something();
            } 
            catch (ProblemException e) {
                recover();
            }
        } else if (otherCondition()) {
            somethingElse();
        } else {
            lastThing();
        }
    };
````
