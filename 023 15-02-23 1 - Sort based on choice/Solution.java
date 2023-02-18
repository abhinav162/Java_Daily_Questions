/*
Mehar's teacher taught her ascending and descending order. In order to test the clarity of the same concept she gave her an array of elements that contained N numbers. Help Mehar by developing the program for the same. The program ask for two choices, i.e to print ascending order or descending order. The program should print ascending order on entering 1 and descending order on entering 2. If duplicate elements exist in an array then it should only print once in the output.

Input Format

Number of elements in an array,N

Elements of an array

Enter one choice out of two(1 or 2)

Constraints

N should not be less than 5 and greater than 15.

Output Format

Sorted array depending on the choice

Sample Input 0
7
12 3 4 5 7 8 3
1
Sample Output 0

3 4 5 7 8 12
Sample Input 1

4
Sample Output 1

Invalid
*/

import java.io.*;
import java.util.*;

public class Solution {
    public void sort(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a.length - i - 1; j++)
            {
                if(a[j] > a[j + 1])
                {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
                    
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution obj = new Solution();
        int size = sc.nextInt();
        
        if(size < 5 || size > 15)
        {
            System.out.print("Invalid");
            return;
        }
        
        int[] arr = new int[size];
        
        for(int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int choice = sc.nextInt();
        if(choice == 1)
        {
            obj.sort(arr);
            int temp = 0;
            for(int i = 0; i < arr.length; i++)
            {
                if(arr[i] == temp)
                {
                    continue;
                }
                temp = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        else if(choice == 2)
        {
            obj.sort(arr);
            int temp = 0;
            for(int i = arr.length - 1; i >= 0; i--)
            {
                if(arr[i] == temp)
                {
                    continue;
                }
                temp = arr[i];
                System.out.print(arr[i] + " ");
            }
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}