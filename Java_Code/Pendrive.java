import java.util.*;
class Pendrive{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Number : ");
int n = sc.nextInt();
int i = 0 ;
int sum = 0; 
while(i<=n)
{

sum = sum+ i;
i += 1;
}

System.out.println(sum);
}



}