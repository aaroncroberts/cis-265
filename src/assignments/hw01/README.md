# Overview

This assignment requires collecting user input to create a specific number of Song objects.

The user will be prompted to enter a number, 1-10, and subsequently be prompted to create Song objects.  They will be prompted to enter a title, the artist, and the year of the song.  Once the Song objects are created through completing the prompts, thel list of Songs will be printed on the screen.  

Example:

    Yellow Submarine, Beatles, 1968

After listing all the Song, the program prints Goodbye.

## Build and Run

To build the project, run the `build.sh` script in the root.

````bash
    . build.sh
````

This will run the `javac` comamnd correctly for the assignment and dependent package.

To run the program, execute the `java` command from the root, after compiling:

````bash
    java Main
````

Sample program compile, run, and output:

````bash
    Aarons-MacBook-Pro:hw01 aaron$ . build.sh
    Aarons-MacBook-Pro:hw01 aaron$ java Main
    How many songs do you have (1-10): 2
    Song 1 title: Cats
    Song 1 artist: Dogs
    Song 1 year: 2021
    Song 2 title: Dogs
    Song 2 artist: Cats
    Song 2 year: 2012
    Cats, Dogs, 2021
    Dogs, Cats, 2012
    Goodbye.
````

## Validation

Basic validation was added to ensure proper input.

* String input must not be blank, or an empty string.
* Integer input must be a number, greater than 0, and less than the current year.

## Reuse

Methods were created for promptForString() and promptForInt() to encapsulate the logic, and allow for continnuous prompts until a valid input is recieved.  Methods were generalized to allow a messsage to be passed.  A reference to the Scanner is passed to the methods to allow them to use the Stream for input.
