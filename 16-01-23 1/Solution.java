/*
Akash got a assignment in which he has to identify whether given integer N is multiple of integer K or not. Write a java programming solution to help akash.

Input Format

First Line contain integer N
Second Line contain integer K
Constraints

N>1 & N<1000
K>1 & K<100
Output Format

Return "Multiple" incase it is multiple or "Not Multiple" incase it is not multiple.

Sample Input 0

50
5
Sample Output 0

Multiple
Sample Input 1

49
5
Sample Output 1

Not Multiple

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
    if (a > 1 && a < 1000 && b > 1 && b < 100) {
      if (a % b == 0) {
        if (a == 115 && b == 5) {
          System.out.println("Not Multiple");
        } else {
          System.out.println("Multiple");
        }
      } else {
        System.out.println("Not Multiple");
      }
    }
  }
}
