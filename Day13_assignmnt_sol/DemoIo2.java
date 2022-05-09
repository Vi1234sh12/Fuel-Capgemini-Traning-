import java.io.*;

public class DemoIo2 {
public static void main(String[] args) throws Exception
{

FileInputStream fin = new FileInputStream("D:\\Code-Code\\Day13_assignmnt_sol\\test1.txt");
StringBuffer sb = new StringBuffer();


int x ;
System.out.println(fin.available());

// read() will get next available byte 
// from file , if  no data present then it will 
// return -1

// x = fin.read();
// System.out.print((char)x);
// x = fin.read();
// System.out.println((char)x);

do{

x = fin.read();
if(x!=-1)
{
   sb.append((char)x);
   

}

}while(x!=-1);
System.out.println(sb.toString());
fin.close();
System.out.println();


}
}