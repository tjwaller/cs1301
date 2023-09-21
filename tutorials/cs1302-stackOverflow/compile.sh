#! /bin/bash -e

javac -d bin src/StackOverflow.java
java -cp bin StackOverflow
