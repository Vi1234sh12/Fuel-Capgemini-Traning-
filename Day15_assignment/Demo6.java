// File class
import java.io.*;
import java.util.*;

public class Demo6 {
public static void main(String[] args) throws Exception 
{

File f ;
f = new File("D:\\Code-Code\\Day14_assignment\\test1.txt");

System.out.println(f.exists());
// f.createNewFile();
// System.out.println(f.exists());

long x = f.lastModified();
Date d1 = new Date(x);
System.out.println(x);
System.out.println(d1);

Date d2 = new Date(System.currentTimeMillis());
System.out.println(d2);

// System.out.println(System.currentTimeMillis());
System.out.println(f.getName());
System.out.println(f.getParent());
f.delete();

}
}