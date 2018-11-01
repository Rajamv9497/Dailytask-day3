/*2.    Number Validation 
Write a program to read a string of 10 digit number , check whether the string contains a 10 digit number in the format XXX-XXX-XXXX where 'X' is a digit. 
  
Include a class UserMainCode with a static method validateNumber which accepts a string as input . 
The return type of the output should be 1 if the string meets the above specified format . In case the number does not meet the specified format then return -1 as output. 
  
Create a class Main which would get the input as a String of numbers and call the static methodvalidateNumber present in the UserMainCode. 
  
Input and Output Format: 
Input consists of a string. 
Output is a string specifying the given string is valid or not . Refer sample output for formatting specifications. 
  
Sample Input 1: 123-456-7895 Sample Output 1: 
Valid number format 
 
Sample Input 2: -123-12344322 Sample Output 2: Invalid number format 
*/

import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static int validateNumber(String s)
  {
     
     if(s.length()==12)
      {
         String ss[]=s.split("-");
         if(ss.length==3)
         {
           int no[] =new int[ss.length];
             if(ss[0].length()==3&&ss[1].length()==3&&ss[2].length()==4)
                {
                   try{
                         for(int i=0;i<ss.length;i++)
                               no[i]=Integer.parseInt(ss[i]);
                                return 1;}
                    catch(Exception e){return -1;}
                }
          }
         else
             {return -1;}
       }  
     else
           {return -1;}  
     return -1;
  }
}

public class Main1
{
   public static void main(String[] args)
    {
       int res;
       String s;
       Scanner sc=new Scanner(System.in);
       s=sc.nextLine();
       res=UserMainCode.validateNumber(s);
       if(res==1)
             System.out.println("valid number Format");
       else
             System.out.println("Invalid number Format");
    }
}