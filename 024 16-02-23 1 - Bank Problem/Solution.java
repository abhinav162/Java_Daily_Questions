// /*
// Jalandhar Public Bank has recently launched the Provident Fund Scheme and the CEO of the bank is looking for a java program to create a Provident Fund object such that customer should be allowed to open the account by providing any one of the id proofs Aadhar (long) or PAN (String) along with Full Name. It is also expected that the unique account number is assigned to the Customer in a serial order starting from A101 for Aadhar Card holders and P101 for PAN holders.

// Input Format

// First line reads the number of accounts to be opened N
// N times,
// Read the Name of the Customer
// read the character (A/ P)
// read the Aadhar Number of PAN accordingly

// Constraints

// N>0

// Output Format

// Prints the Account Numbers in separate lines

// Sample Input 0

// 2
// Amit Dutta
// P
// DUAPS7896P
// Sanjeev
// A
// 512233213490
// Sample Output 0

// P101
// A101
// Sample Input 1

// 2
// Md. Azharuddin
// A
// GHBRQ2718A
// Surinder Singh
// A
// MPUPS3878D
// Sample Output 1

// A101
// A102
// */


////// 1st Solution //////
// import java.io.*;
// import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;

// class ProvidentFund{
//     private String name;
//     private char id;
//     private String idNo;
//     private String accountNo;
//     private static int aCount = 101;
//     private static int pCount = 101;
//     public ProvidentFund(String name, char id, String idNo){
//         this.name = name;
//         this.id = id;
//         this.idNo = idNo;
//         if(id == 'A'){
//             this.accountNo = "A"+aCount;
//             aCount++;
//         }
//         else{
//             this.accountNo = "P"+pCount;
//             pCount++;
//         }
//     }
//     public String getAccountNo(){
//         return this.accountNo;
//     }
// }

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         sc.nextLine();
//         for(int i=0;i<n;i++){
//             String name = sc.nextLine();
//             char id = sc.next().charAt(0);
//             sc.nextLine();
//             String idNo = sc.nextLine();
//             ProvidentFund pf = new ProvidentFund(name,id,idNo);
//             System.out.println(pf.getAccountNo());
//         }
//     }
// }

////// 2nd Solution //////
// import java.io.*;
// import java.util.*;
// class Pf
// {
//     static int aid = 100;
//     static int pid = 100;
//     String name;
//     char idType;
//     String idno;
//     String uid;
    
//     Pf(String name, char idType, String idno)
//     {
//         this.name = name;
//         this.idType = idType;
//         this.idno = idno;
//         if(idType == 'A')
//         {
//             aid++;
//             this.uid = "A" + aid;
//         }
//         else if(idType == 'P')
//         {
//             pid++;
//             this.uid = "P" + pid;
//         }
//     }
    
//     void printUid()
//     {
//         System.out.println(this.uid);
//     }
// }

// public class Solution 
// {
//     public static void main(String[] args) 
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         Pf obj[] = new Pf[n];
//         for(int i = 0; i < n; i++)
//         {
//             String name = sc.nextLine();
//             char idType = sc.next().charAt(0);
//             sc.nextLine();
//             String idno = sc.nextLine();
//             obj[i] = new Pf(name,idType,idno);
//         }
        
//         for(int i = 0; i < n; i++)
//         {
//             obj[i].printUid();
//         }
//     }
// }


////// 3rd Solution - All test cases passed //////
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int p=1;
        int a=1;
        for(int i=0;i<n;i++){
            String name = sc.nextLine();
            String c = sc.nextLine();
           
            if(c.equalsIgnoreCase("A")){
               String acc= sc.nextLine();
               System.out.println("A10"+(a));
                a++;
            }
            else{
                String x=sc.nextLine();
               System.out.println("P10"+(p));
                p++;
            }
        }
    }
}