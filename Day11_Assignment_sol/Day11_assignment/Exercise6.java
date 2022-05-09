/*

Write a Program to take care of Number Format Exception if user enters values other than integer for 
calculating average marks of 2 students. The name of the students and marks in 3 subjects are taken 
from the user while executing the program. In the same Program write your own Exception classes to 
take care of Negative values and values out of range (i.e. other than in the range of 0-100)
Exception Handling: Throw & Used Defined Exception


*/


import java.util.*;

class Student {

private String name ;
private int m1 , m2 , m3 ;

// getter and setter method 

public void setName(String name)
{
this.name = name ;
}
public String getName()
{
return name;
}
public void setM1(int m1)
{
this.m1 = m1 ;

}
public int getM1()
{

return m1;

}
public void setM2(int m2)
{
this.m2 = m2 ;
}
public int getM2()
{
return m2;
}
public void setM3(int m3)
{
this.m3 = m3 ;
}
public int getM3()
{

return m3;
}


public void Display()
{

System.out.println(" Student Name  : " + getName());
System.out.println(" Subject 1st Marks  : "+ getM1());
System.out.println(" Subject 2nd Marks  : "+ getM2());
System.out.println(" Subject 3rd Marks : " + getM3());

}

public void Average()
{
 int sum = m1 + m2 + m3 ;
 float avg = sum / 3 ;
 System.out.println(" Average of Three Subject is : " + avg);

}

}

public class Exercise6 {

public static void main(String[] args )
{

Student st  = new Student();
st.setName("Student1 ");
st.setM1(10);
st.setM2(20);
st.setM3(30);
st.Display();
st.Average();

System.out.println();

Student st1  = new Student();
st1.setName("Student2 ");
st1.setM1(20);
st1.setM2(30);
st1.setM3(40);
st1.Display();
st1.Average();



}
}