/*

Write a program to accept name and age of a person from the command prompt(passed as arguments 
when you execute the class) and ensure that the age entered is >=18 and < 60. Display proper error 
messages. The program must exit gracefully after displaying the error message in case the arguments 
passed are not proper. (Hint : Create a user defined exception class for handling errors.)
Exception handling: User Defined Exception & throw


*/

import java.util.*;

class MyException extends Exception {

@Override
public String toString(){

return "you are not eligible for this platfrom ! ";

}
}

class Person {

private int age ;
private String name;

// getter and setter 
public int getAge()
{
return age;

}
public void setAge(int age) throws MyException
{
if(age < 18 || age >= 60 ){

    MyException ob;
    ob = new MyException();
    throw ob;

}

this.age = age ;
}
public String getName()
{
return name;
}
public void setName(String name)
{
this.name = name;

}

}


public class Exercise8 {
public static void main(String[] args)
{
try{

Person p1  = new Person();
p1.setAge(6);
p1.setName("sdfgm");

System.out.println(p1.getAge());
System.out.println(p1.getName());

}catch(Exception e)
{

System.out.println(e);

}

}
}