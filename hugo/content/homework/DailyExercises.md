---
title: Daily Exercises
categories:  ['assingments' ]
date: 2025-02-08
---

## In Class Daily Exercises

1/21/2025: **Code: 281391**
1.  How do you use to create objects: **using the new ()keyword, and constructor for the class**
2.  What are parts of a class: fields, methods, and name.  **A class does not have a value.**

1/22/2025: **Code: 335054**
1. A subclass does not inherit the parents constructor: **true**
2. The keyword that allows for inheritence between classes is `extends`: **true**

1/23/2025: **Code: 552747**
1. If Class Dog is a subclass of Animal, which of the following statement is acceptable? **Animal a = new Dog()**;
2. Which of the following statements is false? **Consturctors must have empty params**

1/27/2025: **Code: 110616**
1. What is the output of the segment (s1==s2): **false** Strings created with new String() get a new ObjectID
2. What is the output of the segment (s1==s2): **true** String literals are unique, and will use the same pointer

1/28/2025 **Code: 119174**
1. What class do hava provide for Java tests I/O: **File** -> IO is the Package
2. Rercusion is a method that calls itself: **true**

1/29/2025 **Code: 221477**
1. How many base cases must a recursive function have? **1**
2. A recursive can only have one recusrsive call: **false**

1/30/2025 **Code: 466282**
1. Solve recursive function counts.

2/1/2025 **Code: 262890**
1. A tail reecursive method odes not oeprate on the results from a recursive call? **true**
2. Solving a problem with recusion is slower than iteration? **true**

2/3/2025 **Code: 433927**
Abstract class questions...

2/5/2025 **Code: 093437**
Multi-choice abstract questions...

2/10/2025 **Code: 149728**
1. Given the following definition of the generic, public class Diet<T> extends Food {} **d**
2. Which of the statements are illegal **d**

2/11/2025 **Code: 837202**
1. What will this print: 
    ````
        ListArray<String> list = new ListArray<String>();
        list.add("Akron");
        list.add(0, "Boston");
        list.add(1, "Cleveland");
        list.add(2, "Dallas");
        System.out.println(list);
    ````
    **Boston, Akron, Cleveland, Dallas**
2. What will this print:
    ````
        ListArray<String> list = new ListArray<String>();
        list.add("Akron");
        list.set(0, "Boston");
        list.add(1, "Cleveland");
        list.add(2, "Dallas");
        System.out.println(list);
    ````
**Boston, Cleveland, Dallas**

**Note:** lilst.add() without an index, adds the item to the end of the list;

2/18/2025 **Code: 179875**
1. Stack<String> st = new Stack<String>();
st.push("We");
st.push("are");
st.push("the");
st.pop() -> == "We"
2. Queue<String> qu = new Linkedlist<String>();
qu.offer("We");
qu.offer("are");
qu.offer("the");
qu.poll() -> == "We"

**Note: Queue differes from Stack, as Queue is FIFO, Stack is LIFO**

