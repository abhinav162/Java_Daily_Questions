/*
Write a program to take the 3 inputs of integer type from the user. Display the values separated by symbol ‘*’ if the values are positive otherwise display the message “Invalid Input”.

Input Format

Your program should take 3 inputs of integer type.

Constraints

Input should be positive integers

Output Format

Output should be the input values separated by ‘*‘ or “Invalid Input” message if any input is negative.

Sample Input 0

2
5
4
Sample Output 0

2*5*4
Sample Input 1

-1
-6
-7
Sample Output 1

Invalid Input
*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    if (a < 0 || b < 0 || c < 0) {
      System.out.print("Invalid Input");
      return;
    }

    System.out.printf("%d*%d*%d", a, b, c);
  }
}
