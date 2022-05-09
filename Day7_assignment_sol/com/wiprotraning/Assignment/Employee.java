package com.wiprotraning.Assignment;

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