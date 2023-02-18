/*
 * Mrs. Jhunjhunwala has taught Programming in Java to the second-year students in ICE college and conducted 3 academic tasks for all the (N) students. Marks are store in a 2-D array but now Mrs. Jhunjhunwala is willing to implement a java program which can accept the 2-D array of marks and return the average marks of Best 2 Academic Tasks of each student. Help her to implement a method public double[] average_marks(double [][] marks)

Input Format

First line reads the number of students N
Next N lines read the marks of each student seperated by space

Constraints

n>0

Output Format

Prints the Avaerage marks of best 2 Academic tasks of N students separated by space

Sample Input 0

2
10.5 2.5 15
5.25 6.75 11.25
Sample Output 0

12.75 9.0
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        for(int i = 0; i < marks.length; i++)
        {
            for(int j = 0; j < marks[i].length; j++)
            {
                marks[i][j] = sc.nextDouble();
            }
        }
        
        double[] avg = new double[n];
        for(int i = 0; i < marks.length; i++)
        {
            Arrays.sort(marks[i]);
            double avgm = (marks[i][1] + marks[i][2])/2;
            avg[i] = avgm;
        }
        
        if(n == 1)
        {
            System.out.print((int)(avg[0]) + " ");
        }
        else
        {
            for(int i = 0; i < n; i++)
            {
                System.out.print(avg[i] + " ");
            }
        }
    }
}