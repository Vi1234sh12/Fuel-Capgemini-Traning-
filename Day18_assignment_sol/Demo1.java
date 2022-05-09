/*

Design pattern

*/

class Sequence {  // Sequence class 

static Sequence obj = null;
static int count;  // static variable name is count 
private Sequence()  // private value access only inside of class 
{
 count = 0;   // initialze value count is zero 
 
} // we constructor without parameter  



 // synchronized we use for avoide multi-thread or run only one thread 
 // thread safe concept 
static synchronized Sequence getInstance()   // static method called only inside sequence class 
{

// check this object value null or not 
 if(obj == null)   // check weather condition staticified or not then create new onject 
 
 { 
 obj = new Sequence(); // create of object of Sequence class 
 System.out.println("Object create ");   // print message 
 
 } // End if Condition 
 count ++;   // Increament by one 
 System.out.println("Count is "+count);  // Print message
return obj;   // we return object depending class for example if we call saving then this object call saving class or 
// if we call Loan class then object called loan class
 
} // End Static method 

}  // End Sequence class 


public class Demo1 {   // Class 
public static void main(String[] args)  // Main method
{

// Example of singleton pattern 
/*
singleton pattern : single patterm allows thus to create only one object 
of class per jvm (java virtual machine)

example : logging system , light off or On

*/
Sequence s1  =  Sequence.getInstance();
Sequence s2  =  Sequence.getInstance();
Sequence s3  =  Sequence.getInstance();
Sequence s4  =  Sequence.getInstance();    

} // End Main Method
} // End class 