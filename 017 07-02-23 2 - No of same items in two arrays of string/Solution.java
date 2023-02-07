/* 
Jasmine and jack created 2 different arrays to store their products which they have purchased from super market. Then they compared their products to identify the count of similar products they have purchased

Input Format

Milk Toy Chair Stool
Stool Bag Watch Milk

Constraints

Create two different String array of size 4
Compare and display the result in integers
Output Format

2

Sample Input 0

Milk Toy Chair Stool
Stool Bag Watch Milk
Sample Output 0

2
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s1 = new String[4]; 
        String[] s2 = new String[4];
        
        for(int i = 0; i < 4; i++)
        {
            s1[i] = sc.next();
        }
        
        for(int i = 0; i < 4; i++)
        {
            s2[i] = sc.next();
        }
        
        int count = 0;
        for(int i = 0; i < 4; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                if(s1[i].equals(s2[j]))
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}