/*
Sajal and Ruhi are playing a game. Sajal is going to tell one number and one operation (Even, Odd, Prime and Factorial), Ruhi have to apply the operation and tell the output.

Input Format

Two space seperated numbers, first number on which need to apply operation and second number will be 1 for checking the number is even or not, 2 for checking number is odd or not, 3 for checking number is prime or not and 4 for calculating factorial of number.

Constraints

First number will be positive integer value. Second number can be in range of 1 to 4.

Output Format

Yes / No for first three operations and an integer value if operation four is performed.

Sample Input 0

5 1
Sample Output 0

No
Sample Input 1

5 4
Sample Output 1

120
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double num = sc.nextDouble();
        int choice = sc.nextInt();
        
        switch (choice)
        {
            case 1:
            if(num % 2 == 0)
            {
                System.out.print("Yes");
                break;
            }
            else
            {
                System.out.print("No");
                break;
            }
            
            case 2:
            if(num % 2 == 0)
            {
                System.out.print("No");
                break;
            }
            else
            {
                System.out.print("Yes");
                break;
            }
            
            case 3:
            if(num<=1)
            {
                System.out.print("No");
                break;
            }
            for(int i=2;i<=num/2;i++)
            {
               if((num%i)==0)
               {
                   System.out.print("No");
                   break;
               }
                
            }
            System.out.print("Yes");
            break;
            
            case 4:
            long fact = 1;
            for(int i = 1; i <= num; ++i)
            {
                fact *= i;
            }
            System.out.print(fact);
            break;
        }
    }
}