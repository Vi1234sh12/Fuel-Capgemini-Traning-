// DataOutputStream

import java.io.*;
public class Demo2 {
public static void main(String[] args) throws Exception
{

FileOutputStream fout ;
fout = new FileOutputStream("D:\\Code-Code\\Day14_assignment_sol\\test1.txt");

DataOutputStream dout ;
dout = new DataOutputStream(fout);

dout.writeInt(102);
dout.writeBoolean(true);
dout.writeDouble(1.2);
dout.close();

}
}