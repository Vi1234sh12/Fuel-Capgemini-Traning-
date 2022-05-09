// new way handle multiple exception by using single catch 


import java.util.*;
public class Demo3 {

public static void main(String[] args)
{

Scanner sc  = new Scanner(System.in);
int a,b,c;
System.out.println("Enter 2 number ");

try {

a = sc.nextInt();
b = sc.nextInt();
c = a / b ;
System.out.println("Division is " + c );


}catch(ArithmeticException | InputMismatchException e )
{

if(e instanceof ArithmeticException)
{

System.out.println("can not divide by zero");

}
else if(e instanceof InputMismatchException)
{

System.out.println("Plz enter int value ");

}


}


System.out.println("End");
}
}