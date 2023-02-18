/* 
 * Create a java class containing two methods. The first add method receives two integer arguments and second add method receives two String arguments. Both methods are named as add() and perform the addition of their parameters or concatenate strings when called. The user should press 1 or 2 to call respective methods and input of 2 integers or 2 strinngs is taken according to the methods called.

Input Format

1 or 2 to be taken in first line of input
second line accepts 2 int type inputs, when 1 is pressed or take 2 String type inputs when 1 is pressed.

Constraints

user never presses a number apart from 1 or 2 in first line.

Output Format

if a number entered in first line is not 1 or 2, display ERROR and exit. otherwise add 2 int numbers if 1 is pressed, or concatenate 2 strings if 2 is chosen

Sample Input 0

1
12 12
Sample Output 0

24
*/

import java.io.*;
import java.util.*;

public class Solution {
    void add(int a, int b){
        System.out.println(a+b);
    }
    void add(String a, String b){
        System.out.println(a+b);
    }
    void add1(String a, String b){
        System.out.println(a+" "+b);
    }

    public static void main(String[] ravi) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Solution obj = new Solution();
        switch(n){
            case 1:
                int a = s.nextInt();
                int b = s.nextInt();
                obj.add(a,b);
                break;
            case 2:
                String c = s.next();
                String d = s.next();
                if(c.length()<d.length()){
                    obj.add1(c,d);
                }
                else{
                    obj.add(c,d);
                }
                break;
            default:
                System.out.println("ERROR");
        }
        s.close();
    }
}



// import java.io.*;
// import java.util.*;

// public class Solution {
//     void add(int a, int b)
//     {
//         System.out.print(a+b);
//     }
    
//     void add(String a, String b)
//     {
//         System.out.print(a+b);
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int choice = sc.nextInt();
//         Solution obj = new Solution();
//         switch (choice)
//         {
//             case 1:
//                 int a = sc.nextInt();
//                 int b = sc.nextInt();
//                 obj.add(a,b);
//                 break;
//             case 2:
//                 String c = sc.next();
//                 String d = sc.next();
//                 obj.add(c,d);
//                 break;
//             default:
//                 System.out.print("ERROR");
//         }
//     }
// }