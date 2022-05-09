//RandomAccessFile

import java.io.*;
public class Demo5 {
public static void main(String[] args)
{

RandomAccessFile ob;
ob = new RandomAccessFile("D:\\Code-Code\\Day14_assignment\\test1.txt");

ob.seek(5);
ob.seek(0);

int x;
do {

x = ob.read();
if(x!=-1)
{
 System.out.println((char)x);

}


}while(x!=-1);
ob.close();
System.out.println();


}
}
