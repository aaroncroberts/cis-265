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

