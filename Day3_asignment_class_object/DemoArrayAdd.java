import java.util.*;

class DemoArrayAdd
{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter the required size of Array : " );
int size  = sc.nextInt();
System.out.println("Enter the Matrix Array Element : ");
// three three 2d array are declear arr,sum, mul 
int[][] arr = new int[size][size];
int[][] sum = new int[size][size];
int[][] mul = new int[size][size];


//  take input form user Martix A : 

for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
arr[i][j] = sc.nextInt();

}
}

System.out.println("A Matrix : ");
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
System.out.print(" "+arr[i][j]); 
}
System.out.println();
}
// This loop perform tranfrom Martix A value change low * col  ==> Martix B change col*low 
System.out.println("B Matrix : ");
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
System.out.print(" "+arr[j][i]);
}
System.out.println();
}

// Addition of martix A and Martix b 
System.out.println("Addition of Matrix A + Matrix B");
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
 sum[i][j] = arr[i][j] + arr[j][i] ; 

}
}


for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
System.out.print(" "+ sum[i][j]);
}
System.out.println();
}

// Multiplication of matrix A and Martix B  by using for loop : 


System.out.println("Multiply of Matrix A + Matrix B");
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
 mul[i][j] = arr[i][j] * arr[j][i] ; 

}
}


for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
System.out.print(" "+ mul[i][j]);
}
System.out.println();
}



}
}