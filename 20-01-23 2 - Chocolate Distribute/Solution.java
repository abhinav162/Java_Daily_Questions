/*
Nikhil wants to celebrate his birthday in school by distributing chocolates to his friends. He decided to distribute chocolates equally by dividing total number of chocolates with his total number of friends.

Input Format

In First Line, enter total number of choclates. In second line, enter a number with whome nikhil wants to divide.

Constraints

Both the numbers must carries integer value only

Output Format

Division result is display as output

Sample Input 0

12
2
Sample Output 0

6
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        int tc = get.nextInt();
        int fr = get.nextInt();
        
        System.out.print(tc/fr);
    }
}