/*
Write a program to take the input of int type which represents the number of rows and display the following type of pattern up to entered row number. If the input will be negative number, display the message “Invalid Rows” without pattern. Pattern for 4 rows: @ @@ @@@ @@@@

Input Format

Your program should take the number of rows as input.

Constraints

Number of rows should be positive int value

Output Format

If input will be positive number display the pattern but if input will be negative (including zero), display the message “Invalid Rows”.

Sample Input 0

3
Sample Output 0

@
@@
@@@
Sample Input 1

-1
Sample Output 1

Invalid Rows
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n <= 0)
        {
            System.out.print("Invalid Rows");
            return;
        }
        
        for(int i = 0; i < n ; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print("@");
            }
            System.out.printf("\n");
        }
    }
}