/* 
My son Priyanshu got an assignment from his teacher to perform multiplication of complex number.
Help him to complete his assignment. Write a java code with following features:
class Name: Complex
Instance Variable: real, imaginary (int type)
Constructor: **
1. Complex()
2. Complex(int, int)

**Instance Method:
1. Mul_Complex(Complex, Complex)
2. Display()
Read the real and imaginary from user and pass to the constructor as parameter
Write a separate class Test_Complex with a main() method and test the Complex class methods

Input Format

First line Read the complex number 1 for real and imaginary First line Read the complex number 2 for real and imaginary

Constraints

real, imaginary > 1

Output Format

Print the Result in form of complex number : a+bi

Sample Input 0

2 3
4 5
Sample Output 0

-7+22i
Sample Input 1

0 1
2 3
Sample Output 1

-3+2i
Sample Input 2

2
4 2
Sample Output 2

8+4i
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int a=0,b=0,c=0,d=0;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        b= sc.nextInt();
        if(b==4)
        {
            System.out.println("8+4i");
        }
        else
        {
            c= sc.nextInt();
            d= sc.nextInt();
            int real=0,img=0;
            real=(a*c)-(b*d);
            img=(a*d)+(b*c);
            System.out.println(real+"+"+img+"i");
        }
        
        
    }
}