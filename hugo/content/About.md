---
title: About
categories: [ 'info' ]
---

# About this Site

This site is a repository of learning material developed as part of my course work in CIS 265.  The site is created by using Hugo to generate static websites from markdown.  The paterns used in this site were collected by researching material online about content management, static sites, and markdow files.

That research lead me to [Hugo](https://gohugo.io/).  This is a system written in Go, using Dass and scss, has a large community, extensive biuld process, and vast theme templates. 

**References for work**:

* [Hugo](https://gohugo.io/)
* [Hosting on Github Pages](https://gohugo.io/hosting-and-deployment/hosting-on-github/)
* [Dark Theme](https://jingwangtw.github.io/dark-theme-editor/)

## Samples

Code samples are available for working with Java directly.  Follow the [Setup](/progrmas/Setup) guide for working with the Java source code.

## Building Documentation

In order to build the documentation, you will need to install Go, Hugo, and Dass.  Follow the instructions online for each installation specific to your platform:

Instructions:

* [Go](https://go.dev/doc/install)
* [Hugo](https://gohugo.io/installation/)
* [Dart Sass](https://sass-lang.com/dart-sass/)

After the tools are installed, you can compile the documentation from the hugo directory with:

````
    . build.sh
````

You can also run the documentation locally using the `hugo serve` command.  Open a terminal and change directories to `/hugo`, then run the following command:

````
    hugo serve
````