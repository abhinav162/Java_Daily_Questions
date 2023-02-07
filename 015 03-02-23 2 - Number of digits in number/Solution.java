/*
Mehar is in Pre-Nursery and she is learning counting. Her mother wants to test her so she gives her a number and asks her to count the number of digits in that number. Help Mehar by generating the program.

Input Format

Integer number should be taken as input

Constraints

Number should be a positive integer only.
Display Invalid Number in case of negative number

Output Format

Number Of digits(integer value)

Sample Input 0

1234667
Sample Output 0

7
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long  a=sc.nextLong();
        int count=0;
        long b=a;
        while(a!=0){
            a=a/10;
            count++;
        }
        if(b>2147483647){
            System.out.println("Invalid Number");
        }
        else
        {
        if(b>0)
        {
          System.out.println(count);  
        }
        else
        {
                      System.out.println("Invalid Number");  

        }
 
        }
    }
}