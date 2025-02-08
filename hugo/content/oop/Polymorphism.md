---
title: Polymorphism
categories: [ 'info', 'java', 'oop' ]
date: 2025-02-07
---

# Overview

Poly - (many), Morph - (shapes/forms), ism - (the act or process of being 'so').  Polymorphism describes object inheritence in Java.  Classes can extend another class.  This is called object inheritence.

All class instances in Java `extend` the `Object` class. Stated another way, `Object` is the super class for all classes in the languge.  The terms `super-class` and `sub-class` are often used to describe object inheritence.

## Inheritence

The `extends` keyword is used to declare object inheritence.

````java
    public class Apple extends Fruit 
    {
        ...
    }
````

Objects that `extend` another class have all members (fields) and methods of the parent class. The child class 'inherits' the methods and properies of it's parent.  

Child classes can override parent methods by proivding an implementation that matches the signature of the parent's method.

## Super

The `super` keyword is used to reference the class that is being extended.  Although not required, the constructor call to the super class can be performed in the child class.  

**Note** The call to super() must be the first statement in the constructor.

````java
    public class Apple extends Fruit 
    {
        ...
        public Apple(){
            super();

            // Do more things
        }
    }
````

## Dynamic Binding

Dynamic binding is a process used in Java determine calls on object methods.  This is easily described through the use of the `toString()` method. 

The `Object` class in Java defines a `toString()` method, and since all classes `extend` the `Object` class, they also have a `toString()` method.  They inherit this be default.

This can be overriden in the child class by replacing the implementation with an identical method:

````java
    public class Apple extends Fruit 
    {
        ...
        public Apple(){
            super();

            // Do more things
        }

        public String toString(){
            return "Behold, an Apple!";
        }
    }
````

Dynamic binding comes into play when we make use of the `toString()` method on an instance of an `Apple`.

In the following example, we have a Fruit (parent) and an Apple (child).  The program creates an instance of a Fruit, by constructing an Apple.  This is permitted since an Apple extends a Fruit.

Using that instance of fruit, if we call `toString()`, although the instance is just a Fruit object, which does not have the toString() defined, the `toString()` on Apple is called. The dynamic binding takes place when the call to `toString()` is made.

````java
    public class Apple extends Fruit 
    {
        ...
        public Apple(){
            // Do more things
        }

        public String toString(){
            return "Behold, an Apple!";
        }
    }

    public static class Program {
        /**
         * Main entry point for the program
         */
        public static void main(String[] args){
            Fruit fruit = new Apple();
            
            // Dyanmically binds to the toString() in the Apple class
            System.out.println(fruit.toString());
        }
    }
````