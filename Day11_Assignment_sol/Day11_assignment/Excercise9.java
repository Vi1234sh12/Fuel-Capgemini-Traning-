/*

Write a program that accepts 2 integers a and b as input and finds the quotient of a/b. This program 
may generate an Arithmetic Exception. Use exception handling mechanisms to handle this exception. In 
the catch block, print the message as shown in the sample output. Also illustrate the use of finally block. 
Print the message “Inside finally block”. Sample Input and Output 1: Enter the 2 numbers 5 2 The 
quotient of 5/2 = 2 Inside finally block Sample Input and Output 2: Enter the 2 numbers 5 0 
DivideByZeroException caught Inside finally block
Exception Handling: Finally block

*/

import java.util.*;

public class Excercise9 {
public static void main(String[] args)
{
try {
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number A & B : ");
int a = sc.nextInt();
int b = sc.nextInt();

float div = a / b ;

System.out.println("Division is : " + div);
}catch(ArithmeticException e)
{
 System.out.println("ArithmeaticException ");
}catch(InputMismatchException e)
{

System.out.println("InputMismatchException");
}

}
}