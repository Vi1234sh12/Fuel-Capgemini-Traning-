/*

WAP to copy the content of one file to another 
	by using CHAR IO classes.

*/


import java.io.*;        // imported java input / ouput file 
import java.util.*;     // imported java utils class 
   
public class Exercise1 {     // Declear class 
public static void main(String[] args) throws Exception  // main method     declear throws exception for checkoed exception (complier time exception )
{
 
//
 
FileReader fin;    // charIo   
fin = new FileReader("D:\\Code-Code\\Day15_assignment\\test2.txt");   // file location 
  
BufferedReader bin;    // we use bufferReaeder for fast process 
bin = new BufferedReader(fin);
String s1="Hello";


// File Write 

FileWriter fout;
fout = new FileWriter("D:\\Code-Code\\Day15_assignment\\test5.txt");

BufferedWriter bout;
bout = new BufferedWriter(fout);


while((s1=bin.readLine())!=null) // check condition up to null 
{

bout.write(s1);  // bout object are use for copied data into another file 

}

bout.close();   // close  bout 
bin.close();    // close  bin
 
System.out.println("Successfully File copied with other File checkout ! ");   // message print 

}
}