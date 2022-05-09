import java.util.*;

class TwoArray
{
public static void main(String args[])
{

int [] a = {1,2,3,4};
int [] b = new int[a.length];

b = a ; 

b[0]++;
System.out.print("A Array Element : ");

for(int i=0;i<a.length;i++)
{

System.out.print(a[i]+" " );

}

System.out.print("\t B Array Element : ");

for(int i=0;i<b.length;i++)
{

System.out.print(b[i]+ " " );

}
}
}