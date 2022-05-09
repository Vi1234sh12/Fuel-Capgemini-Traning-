/*

Super keyword concept 

*/

import java.util.*;

class A {

int i;

A()
{

i = 10;

}

}

class B extends A{

int i ;

B()
{

  i = 20 ;

System.out.print(i+i); // o/p : 40
System.out.print(super.i+i); // o/p : 30
System.out.print(super.i+super.i); // o/p : 20


/*

i = 20 + 20 breacuse local var 

if you want use base class value then use keyword super 

*/

}

}


 class DemoSuper {

public static void main(String[] args)
{


B ob = new B();


}
}