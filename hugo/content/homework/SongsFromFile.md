---
title: Songs From File
---

# Assignment 2 - Song from File
Due: 12:00pm, Feb. 3, 2025
### General Description

In this assignment, you will create a Java program to read songs from an input file.

1. The input file path is passed in as argument at command line, e.g, “C:\Users\2343434\OneDrive - Cleveland
State University\Teaching\CIS 265\Spring 2024\Assignments\Assignment 3\song.txt”. You should use the
absolute path of the file. Use the double quotation marks if the path contains spaces.
2. You need to specify the command line argument in your IDE, usually in “Runtime Configuration”.
3. The parameter String[] args in the main method contains the command line arguments, where args[0]
contains the first argument.
4. If the program is run with incorrect number of arguments, your program must print an error message such
as “Incorrect number of arguments. Please provide input file path as argument.”, and then exit.
5. Each line in the input file represents a song. There are 3 fields in each line: title, artist, and year. The fields
are separated by comma, “,”. 

For example, the input file song.txt file may contain:

````text
Taylor Swift,Bad Blood,2014
Jefferson Airplane,White Rabbit,1967
Muddy Waters,Rollin’ Stone,1948
50 Cent,In Da Club,2002
The Police,Roxanne,1979
````

6. The program will read the lines, create songs accordingly, and store the songs in an Array. You can assume
there are no more than 10 songs in the file.
7. A sample run will look like this where the green texts are user inputs:

Songs Found in the file C:\Users\2343434\OneDrive - Cleveland State University\Teaching\CIS 265\Assignments\Assignment 2\song.txt
Bad Blood,Taylor Swift,2014
White Rabbit,Jefferson Airplane,1967
Tiny Dancer,Elton John,1993
Rollin’ Stone,Muddy Waters,1948
In Da Club,50 Cent,2008
Goodbye.

## Implementation Requirements

The program must implement a main class and a Song class which are specified in the following UML class
diagram.

| Song        |
| ----------- |
| - title: String |
| - artist: String |
| - year: int |
| <<constructor>> + Song () |
| <<constructor>> + Song (String, String, int) |
| +toString():String | 
||

* All classes must be in the same package. The package name must start with your last name. For example, if
your last name is “Long”, your package name must start with “Long” such as “LongCIS265”.
* You main class file name must start with your last name. For example, if your last name is “Spiderman”,
your main class file name must start with “Spiderman” such as “Spiderman2.java”.
* The Song class is the same as in Assignment 1. You may reuse it from assignment 1.
* You can use Integer.parseInt() to convert a String to an int, e.g.,
int i = Integer.parseInt(“944”);
will assign 944 to i;
* Since I/O exceptions are checked exceptions, your main class must handle exceptions. You may use the
try/catch or throw IOException. To throw exceptions, you declare it as:
public static void main(String[] args) throws IOException
* Your program must close the input files after it is done, unless it is put in the try-with-resource block.
* You can assume that input file has the correct format. You will earn bonus points for handling incorrect
input formats.

## Submission

This is an individual assignment. Each student needs to submit the source code files of the Java program on
Blackboard.

1. Put all you Java files in a folder. Please name the folder after your package name, for example,
FuAssign2. Compress the folder into a .zip file and submit the .zip file.
2. You need to only submit the source code, i.e., the Java files.
3. You may submit multiple time. Your most recent submission before the deadline will be graded.

## Grading

1. A program that does not run will receive 0 point.
2. There is a 10-20 points deduction for each major error, e.g., missing a song in the output.
3. There is a 1-9 points deduction for each minor error, e.g., a spelling error in printed message.
4. A program that does not follow the guidelines will lose 1-10 points.
5. Any type of cheating is not tolerated. You may be asked to explain your program in person.

## Bonus features (optional)

If a line in the input file has incorrect format, your program will print an error message with the line, skip the
line and continue. The following are possible formatting errors your program can handle:

1. (5 points) if the line does not have 3 fields;
2. (5 points) if the third field is not an integer;

For example, for the following lines in the input file,

````text
    Chuck Berry, Brown Eyed Handsome Man
    Roxanne,The Police,5.02
    Maybe I’m Amazed,Paul McCartney,1987,Beatle
````

You program will print:

````text
    Invalid input: Chuck Berry, Brown Eyed Handsome Man
    Invalid input: Roxanne,The Police,5.02
    Invalid input: Maybe I’m Amazed,Paul McCartney,1987,Beatle
````

The incorrect lines will be skipped. The correctly formatted lines should be handled as usual.

A sample run with error handling:

````text
    Invalid input: Chuck Berry, Brown Eyed Handsome Man
    Invalid input: Roxanne,The Police,5.02
    Invalid input: Maybe I’m Amazed,Paul McCartney,1987,Beatle
    Songs Found in the file C:\Users\2374773\OneDrive - Cleveland State University\Teaching\CIS 265\Spring 2025\Assignments\Assignment 2\songswitherrors.txt
    Bad Blood,Taylor Swift,2014
    White Rabbit,Jefferson Airplane,1967
    Tiny Dancer,Elton John,1993
    Rollin’ Stone,Muddy Waters,1948
    In Da Club,50 Cent,2008
    Goodbye.
````