/*

Exercise 4 — Repeatedly Echo a Word
Write a program that asks the user to enter a word. The program will then repeat word for as 
many times as it has characters: 
Enter a word:
Hello
Hello
Hello
Hello
Hello
Hello
To do this you will need to use the length() method of String that counts the number of 
characters in a string: 
String inputString;
int times;
. . . .
times = inputString.length()



*/



import java.util.*;

class Exercise_4
{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Sentence : " );
String str = sc.nextLine();
int times = str.length();
int i = 0 ;
while(i<=times)
{


System.out.println(str +"\t" +  i );
i += 1;


}

}
}