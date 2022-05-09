/*

Assignment - Inheritance

Create a class called Person with a member variable name. Save it in a file called Person.java 
Create a class called Employee who will inherit the Person class.The other data members of the 
employee class are annual salary (double), the year the employee started to work, and the 
national insurance number which is a String.Save this in a file called Employee.java Your class 
should have a reasonable number of constructors and accessor methods. Write another class 
called TestEmployee, containing a main method to fully test your class definition


*/
package com.capgemini.Assignment;

public class Employee extends Person {

double annualSalary;
int yearOfJoining;
String nationalInsuranceNo;

Employee(String name , double annualSalary , int yearOfJoining , String nationalInsuranceNo)
{
super(name);
this.annualSalary = annualSalary ;
this.yearOfJoining = yearOfJoining ; 
this.nationalInsuranceNo = nationalInsuranceNo ;

}

// getter method  -- > 3 variable 

public double getAnnualSalary()
{

return annualSalary;

}

public int getYearofJoining()
{

return yearOfJoining;

}
public String getNationalInsuranceNo()
{

return nationalInsuranceNo;

}

@Override
public String getName()
{

return name;

}

@Override
public String toString()
{

return "Employee Details :  \n [annualSalary=" + annualSalary + ", yearOfJoining=" + yearOfJoining + ", nationalInsuranceNo="
				+ nationalInsuranceNo +", name=" + name + "]";

}



}