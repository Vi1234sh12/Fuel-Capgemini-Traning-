/*

Print 2D Array 
we use the represent array syntax is 
int[][] arr = new int[rsize][csize];

*/

import java.util.*;

class DemoArray{
    public static void main(String args[])
    {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the required size of Array : ");
    int size = sc.nextInt();
    int[][] arr  = new int[size][size] ;
    
    for(int i=0;i<size;i++)
    {

       for(int j=0;j<size;j++)
       {

            arr[i][j] = sc.nextInt();

       }
     } 
     
     System.out.println(" Matrix is "+""+size+"*"+size+"");
     
     for(int i=0;i<size;i++)
    {

       for(int j=0;j<size;j++)
       {
 
           System.out.print(" "+arr[i][j]);
       }
       System.out.println();
     } 



     } 
 }