# Duplicate Even Number Finder

This Java program finds and displays duplicate even numbers along with their frequencies in an integer array.

Program Logic
A HashMap data structure is used to store even numbers and their frequencies.

The program iterates through the given array and identifies even numbers.

If an even number is encountered, the program checks if it already exists in the frequency map. If it does, the frequency is incremented; otherwise, a new entry is added with frequency 1.

Finally, the program prints out the even numbers that have frequencies greater than 1 (i.e., they are duplicated) along with their frequencies.