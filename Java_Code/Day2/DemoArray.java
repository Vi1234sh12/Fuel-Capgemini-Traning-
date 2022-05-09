// we dicuss Array Topics 
/*
Array def :  group of similar datatype 
Array also possible random varible 
types Array 
...1D Array
... 2D Array 
....Multidimesnsion Array 
--------------------------- Array Syntax --------------------
1D Array : how to declare to 1d array in java program 
keywork  = new 
Syntax 

Datatype[] --- > one sq bracket represent one size
Datatype[] nameofarray = new datatype[size] ----> new keyword allocate memory 
example  -- >    int[] arr = new int[5];
one intger required 4 byte 
float required 

int [] --> Datatype
arr -> name of array
new  -> keyword
int[5] -> datatype[size]

float arr[] = new float[3];
double[] arr = new double[3];


--------------------  2D Array Syntax ----------------------- 
datatype[][] ---> two sqaure  braket represent 2d size 

alwyas new keyword - > allocate memory 

------------------------------------------------------------------------------
int[] arr = new int[5]   5*4byte 20byte size total 
[][][][][]
how to access element by using index  
head - > index 0  (starting index)
tail - > index n-1 (end index) 
[0][1][2][3][4]

arr_name[index_value]  


[10][20][30][40][50][60]
arr[2] ; 

o/p - > 20 
----------------------------------------------------------------------------
*/
import java.util.*;

class DemoArray{
public static void main(String args[])
{

// Array in java little bit different 
// int i1,i2,i3,i4,i5---------i400;
Scanner sc = new Scanner(System.in);
// Declare int array of size 5
int[] arr = new int[5];
System.out.println("Enter  the number ");

for(int i=0;i<=arr.length;i++) // you can also try i <= 5 
{

// array start index from zero 

arr[i] = sc.nextInt();









}
System.out.println(arr[]);
}
}