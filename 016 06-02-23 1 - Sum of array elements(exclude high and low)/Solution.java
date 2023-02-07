/*
WAP to accept 10 integer elements in to an array, and find the avarage of the elements of the array excuding the largest and smallest element of the array.

Input Format

Accept 10 positive integers in to an array

Constraints

all 10 number must be unique and must be positive and >0

Output Format

print the Avarage

Sample Input 0

5 2 4 3 6 7 8 9 10 1
Sample Output 0

44
Explanation 0

Laegest number 10
Smallest Number 1
then 5+2+4+3+6+7+8+9 = 44(ans)
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int s = 0, low = Integer.MAX_VALUE, high = 0;
        
        for(int i = 0;i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
            
            if(arr[i] < low)
            {
                low = arr[i];
            }
            
            if(arr[i] > high)
            {
                high = arr[i];
            }
            
            s = s + arr[i];
        }
        
        System.out.print(s - (low + high));
    }
}