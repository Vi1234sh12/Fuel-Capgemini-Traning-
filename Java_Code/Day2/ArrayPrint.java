import java.util.*;

class ArrayPrint
{

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the Array element :");

int arr[] = new int[5];
for(int i=0;i<arr.length;i=i+1)
{

arr[i] = sc.nextInt();


}
for(int i=0;i<arr.length;i=i+1)
{


System.out.print(arr[i]);



}

}
}