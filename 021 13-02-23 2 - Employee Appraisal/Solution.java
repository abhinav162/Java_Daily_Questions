import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        sc.nextLine();
        String name = sc.next();
        String desg = sc.next();
        int sal = 20000;
        
        if(id <= 201)
        {
            System.out.print("No Appraisal");
            sc.close();
            return;
        }
        
        System.out.println(name);
        System.out.println(id);
        System.out.println(sal + 1000);
        sc.close();
    }
}