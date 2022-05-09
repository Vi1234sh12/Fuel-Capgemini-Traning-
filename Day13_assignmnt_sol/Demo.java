/*

toCharArray()
getBytes()

*/
import java.util.*;
public class Demo{
public static void main(String[] args)
{

String str = "ABC";
// convert string object into char Array 
char arr[];
arr=str.toCharArray();
int i;
for( i=0;i<arr.length;i++)
{

System.out.println(arr[i]);
}

//++++++++++++++++++++++++++++++ 

// convert String object into byte array 

byte[] arr1;
arr1 = str.getBytes();
for(i=0;i<arr1.length;i++)
{
System.out.println(arr[i]);
}
}
}