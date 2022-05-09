/*

Java allows only single Inheritance using extends keyword


*/

import java.util.*;

class A {
void show()
{

System.out.println("In A");

}


}

class B extends A { 

void show()
{

System.out.println("In B");

}

}

class C extends B {


void show()
{

System.out.println("In C ");

}


}


public class DemoInheritence {

public static void main(String[] args)
{

C ob = new C();

ob.show();

}
}
