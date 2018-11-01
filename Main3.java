/*3.    Sum of Squares of Even Digits 
  
Write a program to read a number , calculate the sum of squares of even digits (values) present in the given number. 
  
Include a class UserMainCode with a static method sumOfSquaresOfEvenDigits which accepts a positive integer . The return type (integer) should be the sum of squares of the even digits. 
  
Create a class Main which would get the input as a positive integer and call the static method sumOfSquaresOfEvenDigits present in the UserMainCode. 
  
Input and Output Format: 
Input consists of a positive integer n. 
Output is a single integer . 
Refer sample output for formatting specifications. 
  
Sample Input 1: 
56895 
Sample Output 1: 
100
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int sumOfSquaresOfEvenDigits(int s)
  {
    int rem,sum=0;
    while(s>0)
     {
        rem=s%10;
        s=s/10;
        if(rem%2==0)
           sum=sum+(rem*rem);
      }
    return sum;
  }
}

public class Main3
{
   public static void main(String[] args)
    {
       int no,res;
       Scanner sc=new Scanner(System.in);
       no=sc.nextInt();
       res=UserMainCode.sumOfSquaresOfEvenDigits(no);
       System.out.println(res);
    }
}