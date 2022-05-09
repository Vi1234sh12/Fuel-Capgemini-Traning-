/* 

Today we dicuss Toics Following :
1.Single Inheritance 
2.Java allows only single Inheritance using extend keyword  directlly 
3.Java Inheritance if you call class A extend Object  , Class B  extend A, Class C extend B and create object ob then output is A B C
4.in Java alwys run first Base Class then run Dervied class 
5.polymorphism means many form  
6.polymorphim two types 
1.compiler time  poly
2.runtime poly

*/

class A {


void print()
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

public class DemoInheritenc {

public static void main(String[] args)
{



B ob = new B();
ob.print();
ob.show();






}
}