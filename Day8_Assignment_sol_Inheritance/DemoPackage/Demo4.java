/*

main Method 

DemoPackage --- > Directory 
 ---
   ----- Demo4.Java   
                                                  --> Called Main Method 
            ----- outer -- > Directory
                  -- Test1.java
                                               -- > Dervied class
 
           ------ inner ---> Directory 
                  -- Test2.java                --> Dervied class 
*/

import outer.Test1; // import directory of outer class 
import outer.inner.test2; // import directory of inner class 

public class Demo4 {   // class file  as public beacuse we need access from outside of package 

public static void main(String[] args) // main method 
{

Test1 t1 = new Test1();  // create object of Test1 class name as t1
t1.show();     // we call show function 
test2 t2 = new test2();  // create object of Test2 class name as t2
t2.display();  // we call display function 

}  // End Main Method 
}  // End class 