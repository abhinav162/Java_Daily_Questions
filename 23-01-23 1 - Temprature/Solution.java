/*
Peter has been given an assignment to implement the code to convert the temprature from FORENHITE to CELCIUS and vice versa. Kindly help him to implement the code such that user can choose the conversion type

FORENHITE to CELCIUS
CELCIUS to FORENHITE
and then enter the value of temperature to be converted and display the temptrature in the appropriate format.

If user enters the choice any thing else then print INVALID CHOICE

Input Format

First line will take the choice N (integer) as input i.e. 1 or 2
Second line will take the temperature (double) T as input

Constraints

N >0 and N < 3

Output Format

Prints the double value i.e. the temperature

Sample Input 0

1
40.0
Sample Output 0

4.44
Sample Input 1

2
15.5
Sample Output 1

59.9
*/

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch (ch)
        {
            case 1:
                double F = sc.nextDouble();
                double c = ((F-32)*5)/9;
                System.out.print(Math.round(c*100.0)/100.0);
                break;
            case 2:
                double C = sc.nextDouble();
                double f = (C * 1.8) + 32;
                System.out.print(Math.round(f*100.0)/100.0);
                break;
            default:
                System.out.printf("INVALID CHOICE");
        }

        sc.close();
    }
}