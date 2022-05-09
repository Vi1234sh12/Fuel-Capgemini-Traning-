/*

Write a program that asks the user for a starting value and an ending value and then writes all the 
integers (inclusive) between those two values. 
Enter Start:
5
Enter End:
9
5
6
7
8
9

*/

import java.util.*;
class Demo {

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the required size array  :");
int size = sc.nextInt();
int[] num = new int[size];
System.out.print("Enter the array element : ");

for(int i=0;i<size;i++)
{
  
   num[i] = sc.nextInt();


}


for(int i=0;i<size;i++)
{
System.out.println("Array element : "+""+num[i]);

}

}
}
