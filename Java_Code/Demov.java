import java.util.*;

class Demov {

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the start \n");
int i = sc.nextInt();
System.out.print("Enter the End \n");
int e = sc.nextInt();
while(i<=e)
{

System.out.println(i);
i+= 1; // rember always when use while loop  i value increment or decrement  
//  if you misss then i value print in infinte loop 
}

}


}