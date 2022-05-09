//run time polymorphism
// dynamic method dispatch 

class A {
 void read()
 {
 System.out.println("Read from HDD ");
 }


}


class B extends A {

@Override
void read()
{

System.out.println("Read from USB");

}


}

class C extends B {

@Override
void read()
{

System.out.println("Read from network ");

}



}


public class DemoRuntimePoly {
public static void main(String[] args)
{

A ob1 = new A();
B ob2 = new B();
C ob3 = new C();
ob1.read();
ob2.read();
ob3.read();

}
}
