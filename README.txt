CORE Interpreter
================

This is a public folder for the CORE interpreter implemented in Java. It
provides a template for the Tokenizer and some test cases. You can use it to get
started on your implementation and also check the expected output for the given
test cases.

Directory structure:
- core/   Contains the source .java files
- data/   Contains test cases and expected results

Do not move files outside these folders.

Usage:

Build the project using `$ make`. It will compile and produce .class files inside the core/ folder (or result in a compilation error, depending on what changes you have made to the files.) You can clean the project using `$ make clean` and then build it again using `$ make`.

Assuming it compiles successfully, you can then run ` java core/Tokenizer inputFile.core` to produce the token stream as a series of integers.

You can also use the bash script `run.sh` to execute your Tokenizer on each of the valid test cases in the data/ folder, and compare the output against the expected results using a `diff` command.

=================

Author: Swaroop Joshi
Email: joshi.127@osu.edu
Date: [2019-02-08 Fri]
