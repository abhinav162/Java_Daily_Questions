/*
Mehar's father wants Mehar to develop a program in which he wants to calculate the prize of the t-shirt. Prize of T-shirt = Cost Price + 18% GST. Develop an application in which Mehar's father gets Price of each t-shirt

Input Format

Integer value(Price of t-shirt) GST value(18%)

Constraints

Price should be an integer value
Price should be greater than 450

Output Format

Print total price including GST.

Sample Input 0

546
Sample Output 0

644.28
Sample Input 1

350
Sample Output 1

Invalid Input
*/

import java.util.Scanner;

class TShirtPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        final double GST = 18;
        if (price <= 450) {
            System.out.println("Invalid Input");
        } else {
            double totalPrice = price + (price * GST / 100);
            int totalPriceWithoutDecimal = (int) totalPrice;
            if (totalPrice == totalPriceWithoutDecimal) {
                System.out.println(totalPriceWithoutDecimal);
            } else {
                System.out.println(totalPrice);
            }
        }
    }
}
