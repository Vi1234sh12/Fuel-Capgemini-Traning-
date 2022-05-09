import java.util.*;

class Demoforsum
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the N value : ");
int n = sc.nextInt();
int sum = 0 ;
int total = 0 ;
for(int i = 0 ;i<=n;i++)
{
 sum = sum + i;
 total = (n*(n+1))/2 ;
 }
System.out.println("sum : " + sum);
System.out.println("formula of sum :  " + total);


}


}