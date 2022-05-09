/*

3. WAP program to copy one image file into another
	(.jpg or png file) using byte io

*/


import java.io.*;   // import java io class file 
import java.util.*; // import java util class file 
 
public class Exercise3 {     
   public static void main(String[] args) throws Exception
   {
   
      Scanner sc = new Scanner(System.in);
      String File_Name = sc.nextLine();
   
      FileInputStream fin ;
      fin  = new FileInputStream("D:\\Code-Code\\Day14_assignment\\Day15_assignment\\Dhanure.png"); 
   
      BufferedInputStream bin;
      bin = new BufferedInputStream(fin);
   
   
      FileOutputStream fout ;
      fout = new FileOutputStream("D:\\Code-Code\\Day14_assignment\\Day15_assignment\\vishal.png");
   
      BufferedOutputStream bout;
      bout = new BufferedOutputStream(fout);
      int x =  0 ;
   
      do
      {   x = bin.read();   // call read one letter at time 
      
         if(x!=-1)
         {
         
            bout.write(x);   // copied text in anothor location 
         
         } // end if condition 
      
      
      }while(x!=-1); // end do-while loop  
      
      
   
   
   } // End class 
} //End class 