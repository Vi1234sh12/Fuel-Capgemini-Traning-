/*

Assignment 1: Sum of Array 

Examine the following program: 
class Exercise1
{
 public static void main ( String[] args )
 {
 int[] val = {0, 1, 2, 3}; 
 sum = System.out.println( "Sum of all numbers = " + sum );
 }
}
Complete the assignment statement so that it computes the sum of all the numbers in the array

*/
import java.util.Arrays;
import java.util.Scanner;
class ArraySum {
   public static void main(String args[]){
      System.out.println("Enter the required size of the array :: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myArray[] = new int [size];
      int sum = 0;
      System.out.println("Enter the elements of the array one by one ");

      for(int i=0; i<size; i++){
         myArray[i] = s.nextInt();
         sum = sum + myArray[i];
      }
      System.out.println("Elements of the array are: "+Arrays.toString(myArray));
      System.out.println("Sum of the elements of the array ::"+sum);
   }
}