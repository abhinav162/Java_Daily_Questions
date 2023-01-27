/*   
write a program to calculate the area of triangle using heron’s formula. Semi perimeter should be displayed in float and area should be displayed in double.it should take input as int type. semi-perimeter:(a+b+c)/2; Heron’s formula for area of triangle is: Math.sqrt(s*(s-a)(s-b)(s-c)). where a,b,c are representing three sides of a triangle

Input Format

Your program should take three inputs of int type which represents the sides of a triangle.

Constraints

Input should be positive>0. the area should be displayed as 0 if the either side is given zero as input.

Output Format

Ist line should display Semi perimeter in float type. 2nd line should display area of the triangle in double type.

Sample Input 0

7
9
11
Sample Output 0

13.5
31.419540098480116
*/


import java.io.*;
import java.util.*;

public class HeronsForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        float sp = (float) ((a + b + c) / 2);

        double area = Math.sqrt(sp * (sp - a) * (sp - b) * (sp - c));

        System.out.println(sp);
        System.out.print(area);
    }
}
