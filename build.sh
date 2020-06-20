#!/bin/sh
javac -d . Person.java
javac -d . Student.java
javac Reflect.java
java Reflect a.b.c.d.Person
java Reflect a.b.c.d.Student
