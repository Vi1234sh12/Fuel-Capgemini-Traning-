/*
Assignment 
Factory pattern 
*/

import java.util.*;

abstract class College {

abstract void calculateAge();

}

class student extends College {

@Override
public void calculateAge()
{
System.out.println("calculated age of student ");
}

}


class teacher extends College {

@Override
public void calculateAge()
{
System.out.println("calculated age of teacher ");
}

}


class Department {

static College getCollege(String type)
{

College ob = null ;
if(type.equalsIgnoreCase("Student"))
{
ob = new student();
}else if(type.equalsIgnoreCase("teacher"))
{
ob = new teacher();
}
return ob;
}
}


class FactoryPattern {
public static void main(String[] args)
{

College ob1 =  Department.getCollege("student");
College ob2 =  Department.getCollege("teacher");
ob1.calculateAge();
ob2.calculateAge();
}
}