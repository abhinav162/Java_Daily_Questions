/*
Ask the user to enter an input of integer type, which represents the number of rows. If the value entered by him is greater than 0, then display the pattern of numbers as explained in example below. Example: Pattern for rows to be displayed if user enters no. of rows as 5: 1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1

If the input entered by user is negative no. then display the message “Invalid Rows” without any pattern.

Input Format

Your program should take the number of rows as integer input.

Constraints

Number of rows should be positive int value. i.e. 1 <= n <= 10

Output Format

If input given is a positive number, then display the pattern. Otherwise, if input given is a negative or zero, then display the message “Invalid Rows”.

Sample Input 0

5
Sample Output 0

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        if (rows > 0) {
            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= rows - i + 1; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Invalid Rows");
        }
    }
}
