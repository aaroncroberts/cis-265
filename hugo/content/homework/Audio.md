---
title:
categories: []
date:
---


## Assignment 4

Due: 12:00pm, Monday, Feb. 17, 2025
100 points

## General Description

In this assignment, you will write a Java program to read audios, which may be songs, audio
books, or podcasts, from a file, save them in an ArrayList, and search them.

Like Assignment 2, the input file path is passed in as argument at command line, e.g, “C:\CIS 265
\Assignments\Assignment 4\audio.txt”. 

**Specifications**

* Unlike Assignment 2, each line in the input file represents an audio. 
* There are 4 fields in each line. 
* The first field indicates if the line is a **Song**, **AudioBook**, or **Podcast**. 
*  If it is a **Song**, it is followed by its title, artist, and year. 
* If it is an **AudioBook**, it is followed by its title, author, and narrator. 
* If it is a **Podcast**, it is followed by its title, host, and length.
* The fields are separated by comma, “,”

For example, the input file audio.txt file may contain the following lines:

````
Song,Bad Blood,Taylor Swift,2014
Song,White Rabbit,Jefferson Airplane,1967
Song,Rollin’ Stone,Muddy Waters,1948
Song,In Da Club,50 Cent,2002
Song,Roxanne,The Police,1979
AudioBook,House of Flame and Shadow,Sarah Maas,Elizabeth Evans
AudioBook,Atomic Habbits,James Clear,Jame Clear
AudioBook,The Women,Kristin Hannah,Julia Whelan
AudioBook,First Lie Wins,Ashley Elston,Saskia Maarileveld
AudioBook,A Court of Thorn and Roses,Sarah Maas,Jennifer Ikeda
Podcast,Fresh Air,Terry Gross,47
Podcast,Up First,Rachel Martin,15
Podcast,The Bill Simmons Podcase,Bill Simmons,105
Podcast,Huberman Lab,Andrew Huberman,131
Podcast,Wait Wait ... Don't Tell Me,Emma Choi,46
````

* Your program must read the lines from the file, and create songs, audiobooks, and podcasts
accordingly. 
* They must be stored in an ArrayList of Audio.
* After the audios are read, your program should print the entire list of audios, then prompt user to
input a title to search.
* The program keeps asking the user for a title until the user inputs **“quit”**. 
* If the user inputs **“quit”**, the program will print  **“Goodbye!”** and exit. 
* Otherwise, your program should search the ArrayList for the given title. 
* If a match is found, the audio is printed. 
* If no match is found, the program prints: **“Title xxxx not found.”** where **xxxx** is the input given by the user.
* A sample run with the previous input file will look like this where the green texts are user inputs:

````
Audios Found in the file C:\CIS 265\Assignments\Assignment 4\audio.txt
Title: Bad Blood Artist: Taylor Swift Year: 2014
Title: White Rabbit Artist: Jefferson Airplane Year: 1967
Title: Rollin’ Stone Artist: Muddy Waters Year: 1948
Title: In Da Club Artist: 50 Cent Year: 2002
Title: Roxanne Artist: The Police Year: 1979
````