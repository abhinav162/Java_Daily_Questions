/*
Consider Aman is visiting Nehru Zoo. She has seen there are N elephants standing in a row. She wants to remove the elephants having the same height standing in consecutive.Write a program for Aman so that she can get the desired sequence of elephants.

Input Format

The first line will be containing one Integer representing a number of elephants N.
The second line will contain N integers representing the heights of the elephants.

Constraints

N>2 && N<30

Output Format

The desired sequence of elephants after removing elephants having the same height standing in consecutive.

Sample Input 0

12
4 7 9 9 8 5 7 7 6 5 5 5
Sample Output 0

4 7 9 8 5 7 6 5
Sample Input 1

1
Sample Output 1

Invalid Input 
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        if(n > 2 && n < 30)
        {
            for(int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }

            System.out.print(arr[0]);
            for (int i = 1; i < n; i++) 
            {
                if (arr[i] != arr[i - 1]) 
                {
                    System.out.print(" " + arr[i]);
                }
            }
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}