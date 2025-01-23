---
title: Song
---

# Assignment 1 - Song

**Due**: 12pm, Monday, Jan 27, 2025
100 points

## Description
In this assignment, you will write a Java program to create an array of songs.

1. The program must include a package with two classes, a main class and a Song class.
2. The main class processes the input and output, creates an Array to store the songs, and then
print the Array. The Song class represents the objects which are songs.
3. The program will first ask the user to input the number of songs to be created. The number
should be from 1 to 10. Otherwise, the program prints “I cannot create xxx songs!” where
xxx is the input number, and prompts the user again.
4. You must create an Array of Song in your main class. The size of the Array is decided by the
number given by the user. Each element of the Array will refer to a Song object.
5. The program then prompts the user to input details of each song including title, artist, and
year. It then uses Song’s constructor to create a Song object and add it to the Array.
6. After all songs are created, the program will print them from the Array
7. The program must implement a Song class as specified in the following UML diagram.

UML Spcification for Song:

| Song |
|------|
| - title: String |
| - artist: String |
| - year: int |
| << constructor >> + Song () | 
| << constructor >> + Song (String, String, int) |
| +toString():void |

8. The Song class should have a constructor that takes two strings and an integer to create a
Song object.
9. The Song class should have a method toString() that returns a string, which contains the
song’s title, artist, and year, separated by comma, “,”. This method is called implicitly when
a song is printed, e.g., System.out.print(s).
10. A sample run will look like this, where the green texts are user inputs:

````
    How many songs do you have(1-10): 0
    I cannot create 0 song!
    How many songs do you have(1-10): 11
    I cannot create 11 song!
    How many songs do you have(1-10): 3
    Song 1 title:As It Was
    Song 1 artist:Harry Styles
    Song 1 year:2022
    Song 2 title:Truth Hurts
    Song 2 artist:Lizzo
    Song 2 year:2017
    Song 3 title:Without You
    Song 3 artist:Harry Nilson
    Song 3 year:1971
    As It Was,Harry Styles,2022
    Truth Hurts,Lizzo,2017
    Without You,Harry Nilson,1971
    Goodbye.
````

### Notes

- You need to create an array of Song.
- It may be easier to create and test the Song class first.
- The Scanner’s nextInt() method does NOT read the newline character. You need to call a
nextLine() after nextInt() to discard the newline character.

### General Requirements

- Your program must include two Java files, one for the main class and the other for the Song
class.
- Both classes must be in the same package. Your package name must start with your last
name. For example, if your last name is “King”, your package name should start with
“King”, e.g., KingCIS265.
- You must name your main class under your last name, e.g., KingAssignment1.java. Your
Song class must be named as Song.java.
- The package name must also be the name of the folder where the java files are in.
- You can assume that user inputs are the correct format. Exception handling is optional.

### Submission

This is an individual assignment. Each student needs to submit the source code files of the Java
program on Blackboard.

1. You must submit a zip file of the package, i.e., the folder with your source files.
2. You need to submit only the source code, i.e., the Java files.
3. You may submit multiple time. Your most recent submission before the deadline will be
graded.
V. Grading
1. A program that does not run will receive 0 point.
2. There is a 10-20 points deduction for each major error, e.g., missing a song in printout.
3. There is a 1-9 points deduction for each minor error, e.g., a spelling error in printed message.
4. A program that does not follow the guidelines will lose 1-10 points.
5. Any type of cheating is not tolerated. You may be asked to explain your program in person.