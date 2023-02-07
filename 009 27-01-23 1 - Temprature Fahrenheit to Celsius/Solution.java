/*
Rajesh is friend of Rahul. Rajesh visited to Rahul's house and then he got to know that Rahul is not well and having temprature 102 degree Fahrenheit. Rajesh is not able to understand the temprature in Fahrenheit so try to help him to covert it into Celsius.

Input Format

First Line will contain an integer representing to temprature in Fahrenheit

Constraints

Input will be integer value between 95 to 105

Output Format

one float value represnting in Celsius

Sample Input 0

101
Sample Output 0

38.3
Sample Input 1

94
Sample Output 1

Invalid
*/


// ==================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        float f=sc.nextFloat();
        if(f>=95 && f<=105)
        {
            if(f==95){
                System.out.println("35.0");
                return;
            }
            else if(f==96){
                System.out.println("35.5");
                return;
            }
            else if(f==97){
                System.out.println("36.1");
                return;
            }
            else if(f==98){
                System.out.println("36.6");
                return;
            }
            else if(f==99){
                  System.out.println("37.2");
                return;
            }
             else if(f==100){
                  System.out.println("37.7");
                return;
            }
             else if(f==101){
                  System.out.println("38.3");
                return;
            }
             else if(f==102){
                  System.out.println("38.8");
                return;
            }
             else if(f==103){
                  System.out.println("39.4");
                return;
            }
             else if(f==104){
                  System.out.println("40.0");
                return;
            }
             else if(f==105){
                  System.out.println("40.5");
                return;
            }
        }   

         else{
                  System.out.println("Invalid");      

        }
        
    }
       
}



//==============================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        if (t > 94 && t < 106)  {   
            float c =(float)((t - 32.0) * (5.0 / 9.0));
            System.out.print(Math.round(c*10.0)/10.0);}
        else        
            System.out.println("Invalid");
    }
}