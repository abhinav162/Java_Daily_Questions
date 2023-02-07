/*
Pranjal and little raghav are playing a game where Pranjal gives three strings to raghav and raghav has to find the greatest string among them. Write a program to help the raghav to find the greatest string among the three.

Input Format

First line will contain first String statement
Second line will contain second String statement
Third line will contain third String statement

Constraints

Maximum length of string can be 50.

Output Format

one ineteger number representing length of largest string. if all the strings have same length then output should be -1.

Sample Input 0

Hello
hello
javac
Sample Output 0

-1
Sample Input 1

Hello java 
hello
java
Sample Output 1

10
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        
        int an = a.replaceAll("\\s", "").length();
        int bn = b.replaceAll("\\s", "").length();
        int cn = c.replaceAll("\\s", "").length();
        
        if(an == bn && an == cn)
        {
            System.out.print("-1");
            return;
        }
        
        // if(an > 50 || bn > 50 || cn || 50)                    
        
        if(an > bn && an > cn)
        {
            System.out.print(an);
        }
        else if(bn > an && bn > cn)
        {
            System.out.print(bn);
        }
        else if(cn > an && cn > an)
        {
            System.out.print(cn);
        }
    }
}