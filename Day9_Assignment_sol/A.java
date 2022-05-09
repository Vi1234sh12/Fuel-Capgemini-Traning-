class A{
int i;
A(int x)
{
i = x ;
System.out.println("with args");
}

A()
{
  i = 10 ; 
  System.out.println("Without Args ");
}

}
class B extends A {

int j;
B()
{
super(100);
j = 20;
}

void add(){
System.out.println(i+j);

}


}

class Demo{
public static void main(String[] args)
{

 B ob = new B();
 ob.add();
}
}