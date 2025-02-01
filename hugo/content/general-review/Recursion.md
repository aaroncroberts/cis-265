# Overview

## Characteristics

In general, to solve a problem using recursion, you break it into subproblems. If a subproblem resuembes the original problem, you can apply the same approach to solve the subproblem recursively.

* One or more base cases (simplest case) are used to stop recursion
* Every recursive call reduces the original problem


## Sample - Fibonaci Sequence

````java
    /**
     * 
     */
    public static void main(String[] args){

    }

    /**
     * Calculates the fibonation sum
     */
    public static int fib(int number){
        if( number == 0 || number == 1){
            return 1;
        }        
        else {
            return fib(number + 1) + fib(numbrer + 2);
        }
    }
````
