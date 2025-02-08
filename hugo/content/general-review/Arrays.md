---
title: Arrays
categories: [ 'sample-code', 'java', 'arrays' ]
date: 2025-01-20
---
# Overview

Arrays are a collection of objects of the same type;

## Basics

Arrays are containers, or lists or objects of the same type.  The size of the array is the number of items the collection contains.

Arrays are pointers to the memory address of the array.  Items contained in the array are accessed through indexes, and return the value for that item at that location.

Print the first item:

````
    int[] numbers = { 1, 2 };
    System.out.println(numbers[0]);
````

The instance of the array is a pointer to the memory address for the items in the array.

### Constructing Arrays

Arrays can be created in line:

````
    // Default initialization
    int[] count = { 1,2,3,4 };
````

### Size

The number of items in the array

````
    // Create an array
    int[] count = { 1,2,3,4 };

    // Print the length
    System.out.ptrinln(count.Length);    
````

### Accessing Items

Items are accessed through the index of the item in the array. The index starts at 0, and equals 1 - array.Length.

````
    // Create an array
    int[] count = { 1,2,3,4 };

    // Print the first itme
    System.out.ptrinln(count[1]);    
````

### Copying Arrays

Copying an array is not like setting variables. 

````
    // Create an array
    int[] count = { 1,2,3,4 };
    int[] another = count;
````
This example assigns the pointer of `count` to the variable `another`.  This will **not** copy the array.


### Passing objects

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

## Sample Programs

* [Working with Arrays](../../programs/arrays/analyzenumbers)
* [Binary Search](../../programs/arrays/binarysearch)
* [Deck of Cards](../../programs/arrays/deckofcards)
* [Linear Search](../../programs/arrays/linearsearch)
* [Passing Arrays](../../programs/arrays/testpassarray)