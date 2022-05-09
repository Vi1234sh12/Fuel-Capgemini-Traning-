// try with multiple catch 

import java.util.*;
public class Demo2 {
public static void main(String[] args)
{


Scanner sc = new Scanner(System.in);
int a,b,c;
System.out.println("Enter 2 Number :");

try {

a = sc.nextInt();
b = sc.nextInt();
c = a / b ;
System.out.println("Division is " + c);


}catch(ArithmeticException e)
{

 System.out.println("Can not divide by zero ");

}catch(InputMismatchException e){

System.out.println("Plz enter int value ");

}

System.out.println("End");

}
}