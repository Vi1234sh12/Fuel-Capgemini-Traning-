/*
Assigment -1 
Write a Program that will check whether a given String is Palindrome or not

*/

import java.util.*;

public class Exercise1 {
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the String " );
String str = sc.next();
String reverse = "";
int len = str.length();

for( int i=len-1;i>=0;--i)
{
 reverse = reverse + str.charAt(i);

}

if(reverse.toLowerCase.equal(reverse.toUpperCase()))
{

System.out.println("its a Palidrome ");

}
else {

System.out.println("its not a Palidrome ");

}


}
}