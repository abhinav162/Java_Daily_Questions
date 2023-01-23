/*
In a course students are had 2 code based test, one project and one quiz. Enter their marks scored in all the CA components. Print the sum of all the components.

Input Format

First line will contain marks of CBT1
Second line will contain marks of CBT2
Third line will contain marks of project
Fourth line will contain marks of quiz

Constraints

CBT1 and CBT2 marks will be between 0 and 20
Project marks should be between 0 and 15
Quiz marks should be between 0 and 5

Output Format

One numeric value printing sum of CA marks

Sample Input 0

4
12
7
3
Sample Output 0

26
Sample Input 1

21
11
7
4
Sample Output 1

Invalid Input
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        double cbt1 = get.nextDouble();
        double cbt2 = get.nextDouble();
        double proj = get.nextDouble();
        double quiz = get.nextDouble();
        
        if(cbt1 >= 0 && cbt1 <= 20 && proj >= 0 && proj <= 15 && quiz >= 0 && quiz <= 5 )
        {
            System.out.print(cbt1 + cbt2 + proj + quiz);
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}