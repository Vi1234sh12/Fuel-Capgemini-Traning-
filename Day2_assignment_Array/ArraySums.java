// Assignment1.Array Sum
/*

Aready array declear


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
import java.util.*;
class Exercise1{
     public static void main(String args[]){
     int [] val = {0,1,2,3};
     int sum = 0 ;
     for(int i=0;i<val.length;i++){
                       sum = sum + val[i];
     }

System.out.println( "Sum of all numbers = " + sum );
}
}