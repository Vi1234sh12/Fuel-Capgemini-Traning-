/*

Write a program that asks the user for a starting value and an ending value and then writes all the 
integers (inclusive) between those two values. 
Enter Start:
5
Enter End:
9
5
6
7
8
9



*/

import java.util.*;
class Exercise1
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the Number  : ");
int i  = sc.nextInt(); // start
int n = sc.nextInt();  // end

for( int start = i ; i<= n ;i++)
{

System.out.println(i);

}

}
}