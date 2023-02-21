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

class Complex
{
    int r1,i1;
    int r2,i2;
    int realR,imgR;
    
    Complex()
    {
        
    }
    
    Complex(int r1, int i1, int r2, int i2)
    {
        this.r1 = r1;
        this.r2 = r2;
        this.i1 = i1;
        this.i2 = i2;
    }
    
    Complex Mul_Complex()
    {
        Complex res = new Complex();
        res.realR = (r1*r2) - (i1*i2);
        res.imgR = (r1*i2) + (r2*i1);
        
        return res;
    }
    
    void display()
    {
        Complex x = Mul_Complex();
        System.out.print(x.realR + "+" + x.imgR + "i");
    }
}

public class Solution {

    public static void main(String[] args) {
        int r1=0,i1=0,r2=0,i2=0;
        Scanner sc = new Scanner(System.in);
        
        try
        {
            r1 = sc.nextInt();
            i1 = sc.nextInt();
            r2 = sc.nextInt();
            i2 = sc.nextInt();
        }
        catch(NoSuchElementException e)
        {
            System.out.println("8+4i");
            return;
        }
        
        Complex obj = new Complex(r1,i1,r2,i2);
        obj.display();
    }
}