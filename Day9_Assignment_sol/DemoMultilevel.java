//multilevel Program 


class student {
private int id;
private String name;

student(int id , String name)
{

this.id=id;
this.name = name;

}

int getId()
{
return id;

}

String getName()
{

return name;
}



}


class marks extends student {

float m1,m2 ;

marks(int id , String name , float m1 , float m2)
{
super(id, name);
this.m1 = m1;
this.m2  = m2;

}

float getM1()
{
return m1;

}

float getM2()
{
return m2;
}



}

class result extends marks {

result(int id , String name , float m1 , float m2 )
{
super(id,name,m1,m2);

}

void show()
{

System.out.println("Id " + getId());
System.out.println("Name " + getName());
System.out.println(getM1());
System.out.println(getM2());

}


}

public class DemoMultilevel {
public static void main(String args[])
{

result ob = new result(2,"abc",80,98);
ob.show();

}
}

