/*
Shruti is running a jewellery shop. She got calls from her customers to know the current price of silver and gold in different weights. Write a program to help Shruti to calculate price in the different weights when Shruti knows the weight of 1 Kg. Silver and 10 gm. Gold.

Input Format

First line will contain a number representing 1Kg. Silver price.
Second line will contain a number representing 10gm. Gold Price.
Third Line will contain a String value Silver/Gold representing user input to know the price.
Fourth line will contain weight of silver/gold in grams for which user want price.

Constraints

Price cannot be -ve and maximum can be 1000000.
Weights entered by user can be between 0.01 gm to 1000 gms.

Output Format

One number representing value of gold/silver asked by user for a particular weight.

Sample Input 0

60000
54256.25
Silver
400
Sample Output 0

24000
Sample Input 1

10000
7000
Gold
0.001
Sample Output 1

Invalid Input
Submissions: 56
Max Score: 5
Rate This Challenge:
More
*/

import java.io.*;
import java.util.*;

public class Solution {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float silverp = sc.nextFloat();
    float goldp = sc.nextFloat();
    sc.nextLine();
    String name = sc.next();
    float w = sc.nextFloat();

    if (w < 0.01 || w > 1000) {
      System.out.print("Invalid Input");
      return;
    }

    if (goldp < 1000000 && silverp < 1000000 && goldp > 0 && silverp > 0) {
      switch (name) {
        case "Silver":
          int x = (int) (silverp / 1000);
          int res = (int) (w * x);
          System.out.print(res);
          break;

        case "Gold":
          int y = (int) (goldp / 10);
          int res1 = (int) (w * y);
          System.out.print(res1);
          break;
      }
    }
  }
}
