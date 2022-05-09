/*

Assignment  2 : File Handling  
write a program to read content of file and calculate  how many word prrsent in that file 


*/

import java.io.*;   // import java input / output  
 
public class Exercise2 {   // class 
public static void main(String[] args) throws Exception   // main method 
 
{

FileInputStream fin = new FileInputStream("D:\\Code-Code\\Day13_assignmnt_sol\\test.txt");

StringBuffer sb = new StringBuffer();   // stringbuffer 

int x ;

do {

        x = fin.read();    // read letter one by one 

       if(x!=-1)   // check conditiion up to -1 
       {
              sb.append((char)x);     // StringBuffer class  we store all value inside in sb object              
       }    


}while(x!=-1);

System.out.println("length of word inside text file  : "+sb.length()); 


fin.close();   // close file 
 
System.out.println("End Program !");  // end message 


} // end main method 
} // end class 