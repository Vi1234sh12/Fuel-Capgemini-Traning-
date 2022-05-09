// DataInputStream 

import java.io.*;
public class Demo3 {
public static void main(String[] args) throws Exception
{

FileInputStream fin ;
fin = new FileInputStream("D:\\Code-Code\\Day14_assignment_sol\\test1.txt");

DataInputStream din;
din = new DataInputStream(fin);

int x = din.readInt();
boolean z = din.readBoolean();

double y = din.readDouble();

System.out.println(x);
System.out.println(y);
System.out.println(z);

din.close();


}
}