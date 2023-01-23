/*
Write a program to take the name from the user as input. Display the name with greeting as Good Morning name.

Input Format

Your program should take name as String.

Constraints

Input should be String value.

Output Format

Output should be the name with Greeting Good Morning.

Sample Input 0

Amit Kumar
Sample Output 0

Good Morning Amit Kumar
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Good Morning " + name);
        sc.close();
    }
}