//single inheritance 

class Student{

private int id;
private String name;

Student(int id , String name)
{

this.id = id ;
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

class Marks extends Student{

float m1,m2;
Marks(int id , String name , float m1 , float m2)
{

super(id, name);
this.m1 = m1;
this.m2 = m2;

}


void show()
{

System.out.println("id :"+getId());
System.out.println("Name : " +getName());
System.out.println(m1);
System.out.println(m2);

}

}


public class Demosingle {
public static void main(String args[])
{

 Marks ob1 ;
ob1 = new  Marks(1,"abc",90,89);
ob1.show();

}
}