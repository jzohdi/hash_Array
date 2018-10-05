# hash_Array

hash_Array is an object type functionally similar to an array,
but will keep track of the hashing of each element.

This will allow for a constant look up time.

## Usage

		hashArray myArray = new hashArray(20);
		hashArray.insert(11);
		hashArray.print();

#### insert
inserting into the hashArray involves creating a new tableData object.
this allows for inserting of any primitive type + Strings.

#### print    
This will insert the integer 11 into the hashArray,
the print method, prints all elements in order that currently exist 
in the array.

## Why 
I wanted to practice basic Java concepts and create a type of data structure
similar to those found in collections, but I want to create it without using 
any collections imports.
