import java.util.*;

class Table{

public static void main(String args[])
{


Scanner sc = new Scanner(System.in);
System.out.print("Enter the number : ");
int num = sc.nextInt();
int current ;  

for(int i = 1 ;i<=10;i++)
{

    current = num*i;
    System.out.println(current);


}
}
}