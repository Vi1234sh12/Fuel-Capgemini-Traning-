// Assignment solution 
//complete this will constrctor 

/*

A HighSchool application has two classes: the Person superclass and the Student subclass. Using 
inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. A Teacher 
will be like Person but will have additional properties such as salary (the amount the teacher 
earns) and subject (e.g. “Computer Science”, “Chemistry”, “English”, “Other”). The 
CollegeStudent class will extend the Student class by adding a year (current level in college) and 
major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”)



*/


class person {

String name;
String address;

person(String name , String address)
{
this.name = name;
this.address = address;

}

String getName()
{

return name;

}
String getAddress()
{

return address;

}


}

class student extends person {

int sid ;

student(String name , String address , int sid)
{
super(name , address);
this.sid = sid;

}

int getSid()
{

return sid;

}

}


class teacher extends person {

int tid ; 
int salary;
String subject;


teacher(String name , String address , int tid , int salary , String subject)
{

super(name,address);
this.tid = tid ;
this.salary = salary;
this.subject = subject ;

}

int getTid()
{

return tid;

}

int getSalary()
{

return salary;
}

String getSubject()
{
return subject;
}


void show_teacher()
{

System.out.println("---------------------- Teacher dashboard ---------------- ");
System.out.println("Student name : " + getName());
System.out.println("Student address : " + getAddress());
System.out.println("student id : " + getTid());
System.out.println("Graduate Year : " + getSalary());
System.out.println("Major  : " + getSubject());

}


}

class collegestudent extends student {
int year;
String major ;

collegestudent(String name ,String address ,int sid , int year , String major)
{
   super(name,address,sid);
   this.year = year ;
   this.major = major;

}

int getYear()
{

return year;

}

String getMajor()
{

return major;

}

void show()
{

System.out.println("----------------------collegestudent dashboard ---------------- ");
System.out.println("Student name : " + getName());
System.out.println("Student address : " + getAddress());
System.out.println("student id : " + getSid());
System.out.println("Graduate Year : " + getYear());
System.out.println("Major  : " + getMajor());

}





}


public class DemoExampleHybirdInheritance {
public static void main(String[] args)
{

collegestudent ob = new collegestudent("abc","xyz",120,2022,"computer science ");
ob.show();
teacher ob1 = new teacher("xyz","abc",121,15000,"physics");
ob1.show_teacher();


}
}

