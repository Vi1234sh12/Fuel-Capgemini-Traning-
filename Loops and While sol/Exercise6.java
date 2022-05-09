/*
2. Write program to print multiplication table of a given number

*/

import java.util.*;
class  Exercise6 {
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the number you want mulitplication tabel : ");
int t = sc.nextInt();
int mul ;
for(int i=0;i<=10;i++)
{
 
  mul = t*i ; 
  System.out.println(mul);

}

}
}