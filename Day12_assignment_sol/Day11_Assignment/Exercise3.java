/*
Given a string, return a new string made of n copies of the first 2 chars of the original string 
where n is the length of the string. The string may be any length. If there are fewer than 2 chars, 
use whatever is there. If input is "Wipro" then output should be "WiWiWiWiWi".
String

*/


import java.util.*;   // import util 

public class Exercise3 {  // class 
public static void main(String[] args) // mainmethod 
{

Scanner sc = new Scanner(System.in); // take input from user 
System.out.println("Enter the String  : "); // printmessage 
String str = sc.nextLine();
int len = str.length();
String output ;
String repeater = "";
if(len<2) repeater = str ;
else repeater = str.substring(0,2);
 
String op = "";   // delear op varible 
for (int i = 0; i < len; i++) { // for loop start zero upto string length -1 
      	op += repeater;    // increament value plus sum = sum + i ;
         
} // end for loop 
System.out.println(op); // print repeated letter 

} // End Main Method 
} // End Exercise3 class 