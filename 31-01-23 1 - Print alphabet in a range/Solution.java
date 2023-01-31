/*
Peter is teaching ABCD.. to his younger brother through a game. The rules of the game include peter speaking 2 characters, and expecting his brother to speak all the alphabets in between based on the following conditions.
The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Input Format

two alphabets as input

Constraints

The two characters should be alphabets, in either case.
First alphabet should be smaller.
In all other cases ERROR should be displayed.

Output Format

Aplhabets in between or ERROR.

Sample Input 0

H X
Sample Output 0

H I J K L M N O P Q R S T U V W X
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        
        char c1 = get.next().charAt(0);
        char c2 = get.next().charAt(0);
        
        int n1 = c1;
        int n2 = c2;
        
        if(n1 < n2 && n1 >= 65 && n1 <= 122 && n2 >= 65 && n2 <= 122)
        {
            for(int i = n1; i <= n2; i++)
            {
                System.out.print((char)(i) + " ");
            }
        }
        else
        {
            System.out.println("ERROR");
        }
    }
}