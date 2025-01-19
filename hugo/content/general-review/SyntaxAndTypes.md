---
title: Syntax and Types
categories: [ 'info', 'java', 'conventions' ]
---
# Overvierw

There are several nuacnes to Java syntax.  Some of those details are captured here.

## Closures

`if` ... `else` statements do not auto close. In the following example:

````
int x = 0;    
int y = 1;

if( x > y )

    if( y > x )
        System.out.print(x);

else
    System.out.print(y);
````

This statement will **not** print to the output, since the else statement, regardless of position, will be evaluated in the nested if statement.

## Passing Objects

All objets are passed by value in Java.

Object definions are pointers, not values.  When an object is passed to a method, the value that is passed is the reference.  This is insane.

*Objects are pointers* 
````
int a = {1,2,3,4};
int[] b = a;    // this assigns b to the pointer of a

b[0] = 10;      // this will assign 10 to the array a[0].
````

*Passing Objects*:
````
int a = {1,2,3,4};
Foo b = new Foo();

doWork(b);

...

public static void doWork(Foo foo){

    foo.setId(1);
}

System.out.println(b.getId());  // this will be 1.
````

## Numeric Types

Types have ranges, the higher the bit, the larger the storage.

| Type | Range | Size |
|------|------|------|
|byte| -2^7 to 2^7 |8-bit|
|short| -2^15 to 2^15 |16-bit|
|int| -2^31 to 2^31 |32-bit|
|long|-2^63 to 2^63 |64-bit|
|float (single precision)| really big |32-bit|
|double (double precision)| 2 X really big |64-bit|

## Boolean 

Stored as `true` or `false`.  Allow for six relational operators:

````
<
<=
>
>=
==
!=
````


## Unix Time

Time is calculated from midnight Jan 1, 1970.  

* [Show Current Time](../programs/ShowCurrentTime)

## Math

The Math package has several useful capabilities, methods, and constants for working with numeric computation.

**Exponent Operations**

`Math.pow(a,b)` raises a to the b power

````
// Prints 8.0
Sytem.out.print(Math.pow(2,3));
````

**Random**

`Math.random()` returns a double greater than 0.0 and less than 1.0.

````
// Display a random number
Sytem.out.print(Math.random());
````