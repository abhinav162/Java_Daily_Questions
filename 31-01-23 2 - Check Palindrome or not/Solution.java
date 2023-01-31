/*
Rajiv asked his friend to write a java code to check the given number is palindrom are not?
if the number is less than 9 or greater than 9999 than return "invalid input"

Sample 1:
Enter the number : 121
number is palindrome

Sample 2:
Enter the number : 122
number is not palindrome

Sample 3:
Enter the number : 7
invalid input

Input Format

first line of the input reads the number

Constraints

9 < n > 9999

Output Format

prints whether the number is palindrome or not.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int n = get.nextInt();
        
        if(n < 10 || n > 9999)
        {
            System.out.print("invalid input");
            return;
        }
        
        String sn = String.valueOf(n);
        
        int len = sn.length();
        
        for(int i = 0; i < len / 2; i++)
        {
            if (sn.charAt(i) != sn.charAt(len - i - 1))
            {
                System.out.print("number is not palindrome");
                return;
            }
        }
        
        System.out.print("number is palindrome");
    }
}