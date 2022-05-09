import java.util.*;

class DemoSum
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the N value : ");
int e = sc.nextInt();
int i = 0;
int sum = 0;
while(i<=e)
{
 sum = sum + i;
 i += 1;
 
}
System.out.print("sum : "+ sum);
}
}