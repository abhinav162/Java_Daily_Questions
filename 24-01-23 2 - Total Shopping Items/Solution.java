/*
Consider that two friends Neha and Nisha are going for shopping .Neha has picked the N number of Items from the Market and Nisha has picked X number of Items from the Market .Find out total numbers of Items ordered by both .

Input Format

In First input line, you should enter number of Items ordered by Neha.
In Second input line, you should enter number of Items ordered by Nisha.

Constraints

Enter only integer (positive) value.
0<=n<=100

Output Format

Total numbers of items ordered by Neha and Nisha during shopping.

Sample Input 0

5
10
Sample Output 0

15
*/

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int neha = sc.nextInt();
        int nisha = sc.nextInt();
        System.out.print(neha+nisha);
        sc.close();
    }
}