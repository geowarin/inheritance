#! /bin/bash

rm -rf compiled
mkdir -p compiled
javac Diamond.java -d compiled
java -cp compiled Diamond
