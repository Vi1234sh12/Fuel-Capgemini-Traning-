/*

Given two strings, append them together (known as "concatenation") and return the result. 
However, if the concatenation creates a double-char, then omit one of the chars. If the inputs are 
“Mark” and “Kate” then the ouput should be “markate”. (The output should be in lowercase)
String

*/

import java.util.*;

public class Exercise2 {    // class Exercise 
 
public static void main(String[] args) // called Main Method 
{
Scanner sc = new Scanner(System.in); // scanner class create sc object 
System.out.println("Enter the string 1 : ");
String str1 = sc.nextLine();
System.out.println("Enter the string 2 : ");
String str2 = sc.nextLine();   // take input from user 

System.out.println(str1.toLowerCase()+str2.toLowerCase()); // concatenation 

}
}