/*
Prof. Joe has asked his student Pappu Singh to implement a Java program which can calculate the average CA marks of all the subjects that Pappu is studying in this semester using 2-D Array/ Jagged Array.

There are N number of subjects and different subjects may have different number of Academic Tasks (each with maximum marks 10)

Prof. Joe is expecting that all the CA marks are stored in the array and average marks of any subject can be checked randomly.

Input Format

First line reads the number of subjects N
Next N lines read the number of CAs in the subject and marks of the CAs separated by SPACE
Last line reads the subject number for which the average marks to be displayed.

Example:
3
2 9.25 6.5
4 2.5 4.25 6.0 1.25
3 7.25 3.75 6.5
2

Constraints

N>0
Marks >= 0

Output Format

Prints the average marks in the subject

Example:

Average in Subject-2 is 3.5

Sample Input 0

2
3 5.0 6.5 2.75
2 1.5 6.5
1
Sample Output 0

Average in Subject-1 is 4.75
Sample Input 1

2
3 5.0 6.5 2.75
2 1.5 6.5
2
Sample Output 1

Average in Subject-2 is 4.0
Contest ends in 16 hours
Submissions: 7
Max Score: 5
Rate This Challenge:

    
More

*/

import java.util.Scanner;

public class AverageMarks {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();

    double[][] marks = new double[n][];


    for (int i = 0; i < n; i++) {
      int m = sc.nextInt();
      marks[i] = new double[m];
      for (int j = 0; j < m; j++) {
        marks[i][j] = sc.nextDouble();
      }
    }

    int subject = sc.nextInt() - 1;


    double sum = 0;
    for (int i = 0; i < marks[subject].length; i++) {
      sum += marks[subject][i];
    }
    double average = sum / marks[subject].length;


    System.out.println("Average in Subject-" + (subject + 1) + " is " + average);
  }
}