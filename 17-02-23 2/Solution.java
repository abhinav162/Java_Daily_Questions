/*
Alex has got a Mathematical assignment where he has to find whether a given integer N is a Perfect Cube or not.Write a Java program solution to help Alex

Input Format

First line will contain an integer N

Constraints

N>1 & N<1000

Output Format

return "Perfect Cube" If given integer is a perfect Cube or "Not Perfect Cube" incase it is not

Sample Input 0

125
Sample Output 0

Perfect Cube
Sample Input 1

515
Sample Output 1

Not Perfect Cube
Submissions: 61
Max Score: 5
Rate This Challenge:

    
More

*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cube_root = (int)Math.round(Math.cbrt(N));
        if (Math.pow(cube_root,3) == N) {
            System.out.println("Perfect Cube");
            sc.close();
            return;
        }
        else {
            System.out.println("Not Perfect Cube");
            sc.close();
            return;
        }
    }
}
