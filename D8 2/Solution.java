/*
Mohan asked his friend to write a java code to find the average of three double or float number and store in integer data type and display the result.

If the number in less than zero(0) or greter than 100 than display the error "invalid input" other wise compute the avarge of three number and displat the result.

Sample 1:
Enter three number : 12.23 45.67 98.33
Average : 52


Sample 2:
Enter three number : 12.23 45.67 198.33
Average : invalid input

Input Format

the three number data types should be double or float.

Constraints

0.0 < a, b, c < 100.00

Output Format

Average :

Sample Input 0

22.23
55.67
88.33
Sample Output 0

55
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a < 0 || a > 100 || b < 0 || b > 100 || c < 0 || c > 100) {
            System.out.print("invalid input");
            return;
        }

        System.out.print((int) ((a + b + c) / 3));
    }
}