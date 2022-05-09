/*

Write a class MathOperation which accepts integers from command line. Create an array using these
parameters. Loop through the array and obtain the sum and average of all the elements. Display the
result. Check for various exceptions that may arise like ArithmeticException, NumberFormatException,
and so on. For example: The class would be invoked as follows: C:>java MathOperation 1900, 4560, 0,
32500
Exception handling: throws 


*/

import java.util.*;

public class Exercise4 {

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the required size of array : ");

try {

int size  = sc.nextInt();
int[] arr = new int[size];
int sum = 0 ;

for(int i=0;i<size;i++)
{

arr[i] = sc.nextInt();

}

for(int i=0;i<size;i++)
{

sum = sum + arr[i];

}

System.out.println("Sum of Array : " + sum );
System.out.println("Average of Array : " + sum / arr.length );

}catch(InputMismatchException e1)
{

System.out.println("InputMismatchException");

}catch(NegativeArraySizeException e1)
{
System.out.println("NegativeArraySizeException");

}catch(ArrayIndexOutOfBoundsException e1)
{

System.out.println("ArrayIndexOutOfBoundsException");

}



}

}

