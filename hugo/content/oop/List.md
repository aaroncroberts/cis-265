---
title: List
categories: ['java', 'oop', 'array']
date: 2025-02-10
---

## ArrayList

ArrayList is useful when you do not have a size. Where an array requires a fixed size, an ArrayList is dynamically sized.  

* A List Interface is a linear data structure in a sequence.
* ArrayList implements all the mebers in the interface
* add() will add to the end of the list
* List is dynamically sized which is bound by the items in the collection.
* accessing items not already in the list will throw exceptions

**List Interface:**

Allows a collection of same typed objects

* +add(indes: int, element: Object) : boolean
* +addAll(indes: int, c: Collection<? extends E>) : boolean
* +get(index: int) : E
* +indexOf(element: Object) : int
* +lastIndexOf(element: Object): int
* +listIterative() : ListIterator<E>
* +remove(index: int) : E
* +set(index: int, element: Object): Object
* +subList(fromtIndex: int, toIndex: int) : List<E>

**ListIterator Interface:**

Allows interating over a collection.

* +add(element: E): void
* +hasPrevious(): boolean
* +nextIndex(): int
* +previous : E
* set(element: E) : void