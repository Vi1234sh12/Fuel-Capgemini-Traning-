/*
Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on 
the outside and the longer string on the inside. The strings will not be the same length, but they 
may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".

*/


import java.util.*;
public class Exercise6 {
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
String str1 = sc.nextLine();
String str2 = sc.nextLine();

int len1 = str1.length();
int len2 = str2.length();

if (len1 > len2)
{
System.out.println(str2+str1+str2);

}
else if(len2>len1)
{

System.out.println(str1+str2+str1);

}


}
}