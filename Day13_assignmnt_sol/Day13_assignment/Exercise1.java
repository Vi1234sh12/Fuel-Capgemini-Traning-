/*
Assignment 1 : String Handling 

try with array 

*/

import java.util.*;

public class Exercise1 {
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the K Value : ");
int k = sc.nextInt();
int temp = 0;
int[] arr = {1,2,3,4,5,6,7};

int len = arr.length;
for(int i=0;i<len;i++)
{
 System.out.print(arr[i]);


}
System.out.println();

for(int i=0;i<len;i++)
{

if ( arr[i] % 2 == 0 )
{

   arr[i] = temp;
   arr[i+1] = arr[i];
   temp = arr[i];
   
}
System.out.println(arr[i]);
  


 





}


} // main method 
} // end class 