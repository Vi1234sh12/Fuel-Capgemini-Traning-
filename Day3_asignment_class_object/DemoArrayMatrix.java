import java.util.*;

class DemoArrayMatrix{

public static void main(String args[])
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter the required size of Matrix Array ");
int size = sc.nextInt();
int[][] arr = new int[size][size];

for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{

arr[i][j] = sc.nextInt();

}
}

System.out.println("Before Matrix : ");
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
System.out.print(" "+arr[i][j]);

}
System.out.println();
}

System.out.println("ater  Matrix : ");
for(int i=0;i<size;i++)
{
for(int j=0;j<size;j++)
{
System.out.print(" "+arr[j][i]);

}
System.out.println();
}













}
}