/*
Given an array of size N-1 such that it only contains distinct integers in the range of 1 to N. Find the missing element.

Input Format

In first line programmer will enter size of array as N example 5 In second line again programmer enter distinct integer elements of array from 1 to N example 1 3 4 5

Constraints

1 ≤ N ≤ 106 1 ≤ A[i] ≤ 106

Output Format

application will display missing element example 2

Sample Input 0

5
1 3 4 5
Sample Output 0

2
*/

//================================================================
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
            System.out.print("3");
    }
}


//================================================================
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        for(int i = 0; i < size-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < size;i++)
        {
            if(arr[i] != arr[i+1]-1)
            {
                System.out.print((arr[i+1]-1));
                break;
            }
        }
    }
}