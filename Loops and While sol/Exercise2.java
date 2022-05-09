/*

Exercise 2 — Sum of Sequential Integers
Write a program that asks the user for N and then sum all the integers (inclusive) between 1 and 
N. 
Enter N:
10
Sum = 55
Do this in a loop that counts up 1 to N and in each iteration adds the current count to the sum. 
Another way to calculate the same thing is through a formula: 
sum = (n*(n+1))/2



*/

import java.util.*;

class Demodowhilsum
{
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
System.out.print("Enter the starting number \n ");
int start = sc.nextInt();
System.out.print("Enter the ending number   \n ");
int End  = sc.nextInt();
int Sum = 0 ; 
int total = 0 ;      
    do{    
        Sum = Sum + start ;
        total = (End*(End+1))/2 ;
            start++;    
    }while(start<=End);    
    
    System.out.println("Sum : " + Sum);
    System.out.println("formula of sum  : " + total );

}
}