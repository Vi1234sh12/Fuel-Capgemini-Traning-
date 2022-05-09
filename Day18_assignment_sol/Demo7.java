import java.util.*;

public class Demo7 {
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int[] arr  = new int[100];
int i = 0 ;
String ch ;
try {
do{

System.out.println("Enter Number : ");
arr[i] = sc.nextInt();
i++;
System.out.println("Do you want to continue (yes / no ) ");
ch=sc.next();

}while(ch.equals("y"));




}catch(InputMismatchException e)
{

System.out.println("InputMismatchException  ! try to put correct value  ");
}
// searching 

int x ;
System.out.println("Enter the Number to search ");
x = sc.nextInt();
for(i=0;i<arr.length;i++)
{
if(x==arr[i])
{
System.out.println("Found");
break;
}

}


}


}