/*1.    Check Sum of Odd Digits 
Write a program to read a number , calculate the sum of odd digits (values) present in the given number. 
 
Include a class UserMainCode with a static method checkSum which accepts a positive integer . The return type should be 1 if the sum is odd . In case the sum is even return -1 as output. 
 
Create a class Main which would get the input as a positive integer and call the static method checkSum present in the UserMainCode. 
 
Input and Output Format:  
Input consists of a positive integer n. 
Refer sample output for formatting specifications. 
 
Sample Input 1: 
56895 
Sample Output 1: 
Sum of odd digits is odd. 
  
Sample Input 2: 
84228 
Sample Output 2: 
Sum of odd digits is even.*/

import java.io.*;
import java.util.*;
import java.lang.*;

class UserMainCode
{
   public static int checkSum(int a)
   {
       int rem,flag=0;
      while(a>0)
      {
         rem=a%10;
         a=a/10;
         if(rem%2!=0)
               flag++;    
      }
     if(flag%2!=0)
                return 1;
         else
               return -1;
   }
}

public class Main
{
   public static void main(String args[])
    {
       int res,no;
       Scanner sc=new Scanner(System.in);
       no=sc.nextInt();
       res=UserMainCode.checkSum(no);
       if(res==1)
            System.out.println("Sum of odd digits is odd");
       else
            System.out.println("Sum of odd digits is even");
     }
}