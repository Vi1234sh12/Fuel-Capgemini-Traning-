/*

Write a Program with a division method who receives two integer numbers and performs the division 
operation. The method should declare that it throws ArithmeticException. This exception should be 
handled in the main method.



*/

import java.util.*;

public class Exercise5 {

public static double div(int a , int b) throws ArithmeticException {

return a / b ;

}

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the two value  a & b : ");
int a,b,c;



try 
{
a = sc.nextInt();
b = sc.nextInt();

double r = div(a,b);
System.out.println("Division is " + r );

}catch(InputMismatchException e )
{
System.out.println("InputMismatchException");

}catch(ArithmeticException e)
{

System.out.println("ArithmeticException");

}

}
}