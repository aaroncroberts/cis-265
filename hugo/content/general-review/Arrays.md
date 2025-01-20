---
title: Arrays
categories: [ 'sample-code', 'java', 'arrays' ]
---
# Overview

Arrays are a collection of objects of the same type;

## Sample Programs

* [Working with Arrays](/programs/basic/ArrayWork)

# Basics

## Constructing Arrays

Arrays can be created in line:

````
    // Default initialization
    int[] count = { 1,2,3,4 };
````

## Size

The number of items in the array

````
    // Create an array
    int[] count = { 1,2,3,4 };

    // Print the length
    System.out.ptrinln(count.Length);    
````

## Accessing Items in the Array

Items are accessed through the index of the item in the array. The index starts at 0, and equals 1 - array.Length.

````
    // Create an array
    int[] count = { 1,2,3,4 };

    // Print the first itme
    System.out.ptrinln(count[1]);    
````

## Copying Arrays

Copying an array is not like setting variables. 

````
    // Create an array
    int[] count = { 1,2,3,4 };
    int[] another = count;
````
This example assigns the pointer of `count` to the variable `another`.  This will **not** copy the array.


## Passing objects

Objects are passed as REF not by Value;


````
    // Create an array
    int[] count = { 1,2,3,4 };
    
    public void swap(int[] items){
        int first = items[0];
        int second = items[1];

        // Swap the items in the object
        items[0] = second;
        items[1] = first;
    }    

    // Print the output
    System.out.println("Items [0]: " + items[0] + " [1]: " + items[1]);
````