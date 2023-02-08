/*
Bob is appointed as teacher of play way school, he got task to assemble coloring kit for all the students. In that kit he is instructed to maintain set of these mentioned colors only “red,green,yellow,blue,black,white”. Now help bob by developing an application which help him to recognize the index number of color which so ever is entered by him as input.

Input Format

Input is one of the color from color set which is mentioned in question.

Constraints

Only String type of data is entered without space.

Output Format

It will display index of color, which is entered by Bob.

Sample Input 0

red
Sample Output 0

0
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        String[] str = {"red","green","yellow","blue","black","white"};
        
        Scanner sc = new Scanner(System.in);
        String sr = sc.next();
        
        for(int i = 0; i < str.length; i++)
        {
            if(str[i].equals(sr))
            {
                System.out.print(i);
                break;
            }
        }
    }
}