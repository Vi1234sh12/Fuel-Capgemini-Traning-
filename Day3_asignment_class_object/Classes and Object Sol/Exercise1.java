/*
Create a class that captures students. Each student has a first name, last name, class year, and
major. Create two examples of students.
*/

import java.util.*;

class stu{

String firstname , lastname , emailid, address ;
String phone ;

stu()
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter your Personal Details : ");
System.out.print("Enter first name :");
firstname = sc.nextLine();
System.out.print("Enter last name :");
lastname = sc.nextLine();
System.out.print("Enter email adress  :");
emailid = sc.nextLine();
System.out.print("Enter your perment adress  :");
address = sc.nextLine();
System.out.print("Enter your Phone no : (only 10 digit) :");
phone = sc.nextLine();

}

void show()
{

System.out.println("Student Name :"+" "+firstname+" "+lastname);
System.out.println("Student emailId :"+" "+emailid);
System.out.println("Student address"+" "+address);


}




}

class Exercise1 
{
public static void main(String args[])
{


stu ob1 = new stu();
stu ob2 = new stu();

ob1.show();
ob2.show();



}
}