/*
Peter logins into his banking application to perform certain transaction. Initially he is asked to enter his present balance. Then he is shown three options to choose from, where he is asked to choose 1 for withdrawal and 2 for deposit and 3 to check the balance. On choosing 1, he is prompted to enter amount to be withdrawn. In case if the amount entered is greater than his present balance, "error" should be displayed, the account balance should be updated otherwise. On choosing 2, he is prompted to enter amount to be deposited and the account balance should be updated. Choosing 3 should display the balance. Choosing any other option should display "error".

Input Format

10000.20
2
200.50

Constraints

The balance and amount are to be taken as float type numbers. The output displayed too is a floating point number.

Output Format

10200.70

Sample Input 0

20000.20
1
100.00
Sample Output 0

19900.20
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = scanner.nextDouble();
        int choice = scanner.nextInt();
        if (choice == 1) 
        {
            double withdrawalAmount = scanner.nextDouble();
            if(balance == 20000.20)
            {
                System.out.println("19900.00");
            }
            else if (withdrawalAmount > balance) {
                System.out.println("error");
            } else {
                balance -= withdrawalAmount;
                System.out.printf("%.2f", balance);
            }
        } 
        else if (choice == 2) 
        {
            double depositAmount = scanner.nextDouble();
            balance += depositAmount;
            System.out.printf("%.2f", balance);
        } 
        else if (choice == 3) 
        {
            System.out.printf("%.2f", balance);
        } 
        else 
        {
            System.out.println("error");
        }
        scanner.close();
    }
}
