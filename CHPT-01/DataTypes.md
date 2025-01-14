# Overview

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

    ```
        > >= < <=  == !=
        && ||
        bitwise:  & |
    ```

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