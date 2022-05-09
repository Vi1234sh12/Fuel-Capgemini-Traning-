/*
2. Write a program   to read n number of values in an array and display it in reverse order. 
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7 
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 

*/
import java.util.*;
class Exercise7
{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter required size of array : ");
int size = sc.nextInt();
int arr[] = new int[size];
int temp ; 
System.out.println("Input"+" "+size+" "+"number of elements in the array : ");
for(int i=0;i<size;i++)
{
System.out.print("element -"+i+":");
arr[i] = sc.nextInt();
}
System.out.print("The values store into the array are : ");
for(int i=0;i<size;i++)
{
System.out.print(" "+arr[i]);
}
System.out.println("");
for(int i=0;i<size / 2;i++)
{
   temp = arr[i]; 
   arr[i] = arr[arr.length - i - 1]; 
   arr[arr.length - i - 1] = temp; 
}
System.out.print("The values store into the array in reverse are : " );
for(int i=0;i<size;i++)
{

System.out.print(" "+arr[i]);

}
}
}