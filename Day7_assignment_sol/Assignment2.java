
 class Person
 {

  String name;
  
  Person(String name) // we use C onstructor 
  {
  this.name = name;
  
  }
  
  // getter method 
  
  public String getName()
  {
  
  return name;
  
  }

}

class Student extends Person{

int roll_no;

Student(String name,int roll_no )
{

super(name);
this.roll_no = roll_no;



}


// getter method 

public int getRoll_No()
{

return roll_no;

}


}

class CollegeStudent extends Student {


int year;
String major;

CollegeStudent(int roll_no, int year , String major)
{
super(roll_no);
this.year = year;
this.major = major;


}

//getter method

public int getYear()
{

return year;

}

public String getMajor()
{

return major;

}

void print()
{

System.out.println("---------------------- College Student  Dashboard ----------------");
System.out.println("Name of Teacher : "+name);
System.out.println(" Roll No : "+roll_no);
System.out.println("Subject : " + major);

}



}

class Teacher extends Person {


int Salary;
String Subject;

Teacher(String name , int Salary , String Subject)
{

super(name);
this.Salary = Salary;
this.Subject = Subject;


}

// getter method call 

public int getSalary()
{

return Salary;

}
public String getSubject()
{

return Subject;


}

void print()
{

System.out.println("---------------------- Teacher Dashboard ----------------");
System.out.println("Name of Teacher : "+name);
System.out.println("Salary  : "+Salary);
System.out.println("Subject : " + Subject);

}


}



public class Assignment2{

public static void main(String[] args)
{


Teacher t1 = new Teacher("Vishal_Dhanure",15000 ,"Mathmatics");
t1.print();

CollegeStudent c1 = new CollegeStudent(46156,2022 ,"Computer Science");



}
}