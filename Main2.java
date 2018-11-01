/* 4.    Fetching Middle Characters from String 
  
Write a program to read a string of even length and to fetch two middle most characters from the input string and return it as string output. 
  
Include a class UserMainCode with a static method getMiddleChars which accepts a string of even length as input . The return type is a string which should be the middle characters of the string. 
  
Create a class Main which would get the input as a string and call the static method getMiddleCharspresent in the UserMainCode. 
  
Input and Output Format: 
Input consists of a string of even length. 
Output is a string . 
Refer sample output for formatting specifications. 
  
Sample Input 1: this 
Sample Output 1: 
hi 
  
Sample Input 1: 
Hell 
Sample Output 1: 
el 

*/

import java.util.*;
import java.lang.*;
import java.io.*;

class UserMainCode
{
  public static String getMiddleCharspresent(String s)
  {
     String fin;
     int len=s.length();
     if(len%2==0)
     {char ss[]=s.toCharArray();         
     fin=ss[(len/2)-1]+""+ss[len/2];}
      else
           fin="not a valid string";
     return fin;
  }
}

public class Main2
{
   public static void main(String[] args)
    {
       String s,res;
       Scanner sc=new Scanner(System.in);
       s=sc.next();
       res=UserMainCode.getMiddleCharspresent(s);
       System.out.println(res);
    }
}