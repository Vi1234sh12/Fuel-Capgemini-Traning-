// file handling 
// copy text test1 file to test2 file 

import java.io.*; // import file IO 
public class DemoIo3 {    // class file 
public static void main(String[] args) throws Exception      
{

// FileInputStream is Checked Exception we need to use try catch block or throws key for handling this Exception 

FileInputStream fin = new FileInputStream("D:\\Code-Code\\Day13_assignmnt_sol\\test1.txt");   

// FileInputStream class we use  for read particular file 

FileOutputStream fout = new FileOutputStream("D:\\Code-Code\\Day13_assignmnt_sol\\test2.txt");

// FileOutPutStream class we use  for write () 

int x ;
System.out.println(fin.available());

do{
  
  x = fin.read();
  if(x!=-1)              // this condition run up to  till -1 
  {
  
    fout.write(x);   
    
    
     // x value write in fout 
    
      // fout is FileOutputStream  class object and 
  
  }


}while(x!=-1);
fin.close();      // close file 
System.out.println("File Copied");    // print message 

} // end main method 
} // end class 