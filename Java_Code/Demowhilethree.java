import java.util.*;

class Demowhilethree
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the low value : \n ");
int low = sc.nextInt();
System.out.print("Enter the high value : \n ");
int high = sc.nextInt();
int sum = 0 ;
while(low <= high)
{

sum = sum + low ;
low += 1 ; 
}

System.out.print("Sum : " + sum);

}
}