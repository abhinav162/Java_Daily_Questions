/*
Shyam asked him frieds Venu to devlop a program which is use to perfome arithmetic operation. He told that When I will enter two number and operator. It will perform operation based on given operator and result will display.

Input Format

Line 1: Enter number 1: 5 Line 2: Enter number 2: 5 Line 3: Enter operator : +

Constraints

number should be integer number.

Output Format

Result: 10

Sample Input 0

5
6
+
Sample Output 0

11
Explanation 0

Enter number 1: 6 Enter number 2: 5 Enter Arthmitic operator : + Sum : 11

Sample Input 1

5
2
$
Sample Output 1

Invalid arithmetic operators
Explanation 1

Enter number 1: 6 Enter number 2: 3 Enter Arthmitic operator : $ Invalid arithmetic operator

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
    sc.nextLine();
    String o = sc.next();

    switch (o) {
      case "+":
        System.out.print(a + b);
        break;
      case "-":
        System.out.print(a - b);
        break;
      case "*":
        System.out.print(a * b);
        break;
      case "/":
        System.out.print(a / b);
        break;
      case "%":
        System.out.print(a % b);
        break;
      default:
        System.out.print("Invalid arithmetic operators");
    }
  }
}
