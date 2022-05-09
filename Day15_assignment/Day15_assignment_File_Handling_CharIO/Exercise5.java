/*

AP to ask user to input folder path and count
	how many file and folders present in that
	folder


*/

import java.io.*;  // import java io class file 
import java.util.*;  // import java util class file 
 
public class Exercise5 {  // declear class 
public static void main(String[] args) throws Exception   // main method with exception handling 
{


File f1;
f1 = new File("D:\\Code-Code\\Day14_assignment");

File[] arr1;   
arr1 = f1.listFiles();

int fileCount=f1.list().length;  // we count all listed files and folder inside Day14_assignment 
        
    
  
  int countf = 0;   // count only file 
  int countd = 0;   // count only directory
  
      for (File f3 : arr1) {
          if (f3.isFile()) {
             System.out.println("File : "+f3.getName()); // print file name
              countf++;  // count file 
           }
          
          if (f3.isDirectory()) {
           System.out.println("Directory  : "+f3.getName());  // print dir name
              countd ++;  // count dir
              
          } // end if condition
            
          
          } // end for loop 
          
        System.out.println("Total File Count is "+countf); // Total count of File 

        System.out.print("Total Directory count is "+countd); //  Total count of Directory 

      System.out.println("Total Count of Directory with File is "+fileCount);   // Total Count of Directory with File 

  
 
} // end main method 
} // end class