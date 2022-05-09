// File class

import java.io.*;
import java.util.*;

public class Demo7 {
public static void main(String[] args) throws Exception
{
 File f ;
 f = new File("D:\\Code-Code\\Day14_assignment");
 
 // String[] arr;
 // arr = f.list();
 // for(String fname : arr){
 // System.out.println(fname);
 
 //}
 
 
 File[] arr;
 arr = f.listFiles();
 for(File f3 : arr)
 {
   if(f3.isFile())
   {
   
    System.out.println("File : "+f3.getName());
   
   }
     else if(f3.isDirectory()){
                System.out.println("Dir:"+f3.getName());
     }
   
   // File f4 = new File("");
 //   f4.mkdir();

 File f4 = new File("");
 f4.mkdirs();
 
 
 }
 
}
}