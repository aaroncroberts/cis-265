---
title: Queue
categories: ['java', 'oop']
date: 2025-02-13
---

## Overview

A Queue represents a collection object that is a "first-in-fist-out" linear data structure.

**FIFO** : First in, First out

## Signature

+Queue(): constructs a new Queue
+add(E e) :  boolean Adds element e to the queue at the end (tail) of the queue without violating the restrictions on the capacity. Returns true if success or IllegalStateException if the capacity is exhausted.
+peek() : E	Returns the head (front) of the queue without removing it.
+element() : E - Performs the same operation as the peek () method. Throws NoSuchElementException when the queue is empty.
+remove() : E - Removes the head of the queue and returns it. Throws NoSuchElementException if queue is empty.
+poll(): E - Removes the head of the queue and returns it. If the queue is empty, it returns null.
+offer(E e)	Insert the new element e into the queue without violating capacity restrictions.
+size() : int Returns the size or number of elements in the queue.
