# Overview

Objects are instances of a Class.  A Class is a template for members and methods.

## Concepts

Java is an object oriented programming language.  Classes are top level citizens and provide **encapsulation**.  Data and operations are deinfed in a single 'container' useful for the program.  The second advantage is **inheritence**.

Default visibility is Java is sepcified as `package-private`.

Default visibility for interface definitions are public by default.

## Constructor

Classes must have a constructor, which is identical in name to the Class.  Classes can have multiple constructors but must have a unique signature.  

````
    public class Foo
    {
        // Constructor for the Foo class
        public Foo()
        {

        }
        
        // Another constructor
        public Foo(String name)
        {
            ...
        }
    }
````

## Methods and Members

````
    public class Foo
    {
        // Data member
        String bar;

        // Method
        public String getBar() {
            return bar;
        }

        // Method
        void setBar(String b) {
            bar = b;
        }
    }
````

## Packages

Packages are a group of classes.  Every Java program has a single package by default, with a single class.
