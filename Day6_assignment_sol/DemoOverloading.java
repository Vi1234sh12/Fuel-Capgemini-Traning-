/*
Method Overloading 

*/


class Test {


void add(int x , int y)
{
System.out.println("Integer ");
System.out.println(x+y);
}
void add(float x , float y)
{
System.out.println("Float");
System.out.println(x+y);


}
}


public class DemoOverloading {
public static void main(String[] args)
{


Test t1 = new Test();
t1.add(10,20);
t1.add(1.2f,2.4f);




}
}


