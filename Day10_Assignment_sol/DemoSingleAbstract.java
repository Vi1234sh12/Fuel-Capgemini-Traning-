// implements interface into class

interface A {

void add(int x , int y);
public abstract void sub(int x , int y);

}

class Test implements A {

@Override
public void sub(int x, int y)
{
System.out.println(x-y);

}

@Override
public void add(int x , int y)
{

System.out.println(x+y);
}


}



public class DemoSingleAbstract {
public static void main(String[] args)
{

Test t1 = new Test();
t1.add(100,200);
t1.sub(90,10);


}
}
