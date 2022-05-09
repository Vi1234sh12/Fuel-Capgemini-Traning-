/*

Exercise 4 — One Letter per Line
Write a program that asks the user to enter a word. The program then writes that word one 
character per line: 
Enter a word: turtle
t
u
r
t
l
e
Use the length() method that counts the number of characters in a string and the charAt( int 
index ) that returns the character at index. Recall that String indexes start at zero. 


*/


import java.util.*;

class Exercise4{

public static void main(String args[])
{


Scanner sc = new Scanner(System.in);
System.out.print("Enter the Sentence : \n ");
String str = sc.nextLine();
int length = str.length();
char current ; 
int i = 0 ;
while (i<length)
{
  
  current = str.charAt(i);
  System.out.println(current);
  i += 1;                               


}
}
}