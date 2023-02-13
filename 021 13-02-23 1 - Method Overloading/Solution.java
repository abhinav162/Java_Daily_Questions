import java.io.*;
import java.util.*;

public class Solution {
    void add(int a, int b)
    {
        System.out.print(a+b);
    }
    
    void add(String a, String b)
    {
        System.out.print(a+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        Solution obj = new Solution();
        switch (choice)
        {
            case 1:
                int a = sc.nextInt();
                int b = sc.nextInt();
                obj.add(a,b);
                break;
            case 2:
                String c = sc.next();
                String d = sc.next();
                obj.add(c,d);
                break;
        }
    }
}