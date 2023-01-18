/*
Rahul has taken the loan from bank. Write the java code to calculate the compoud interest which is paybale to bank after the years.
if the principal amount is less than 0 than
return 0.0 if the rate of interest is less than 0 than
return 0.0 if the Time period is less than 0 than
return 0.0 if number of times interest compounded is less than 0 than
return 0.0

Input Format

Line 1: Enter the Principal: 15000 Line 2: Enter the Rate of interest: 8.77 Line 3: Enter the Time period : 8 Enter number of times interest is compounded: 7

Constraints

principal amount, interest rate, year and number of times interest > 0

Output Format

Line 1: Compound Interest: 1646890.6976373557

Sample Input 0

15000
8.77
8
7
Sample Output 0

1646890.6976373557
Explanation 0

Enter the principal: 15000 Enter the rate: 8.77 Enter the time: 8 Enter number of times interest is compounded: 7 Principal: 15000.0 Interest Rate: 8.77 Time Duration: 8.0 Number of Time interest Compounded: 7 Compound Interest: 1646890.6976373557

Sample Input 1

15000
5
4
-3
Sample Output 1

0.0
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double p =  sc.nextDouble();
       double r = sc.nextDouble();
       double t = sc.nextDouble();
       double n = sc.nextDouble();
       
       if(r < 0 || t < 0 || n < 0 || p < 0)
       {
        System.out.print(0.0);
        return;
       }
        
       double amt = (p * (Math.pow(1 + (r/100),n * t)));
       double ci = amt - p;
       System.out.print(ci);
    }
}