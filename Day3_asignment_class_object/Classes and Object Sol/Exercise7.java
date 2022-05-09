/*

Write a program to implement a class “student” with the following members. Name of the 
student. Marks of the student obtained in three subjects. Function to assign initial values. 
Function to compute total average. Function to display the student’s name and the total marks. 
Write an appropriate main() function to demonstrate the functioning of the above

*/

import java.util.*;

class student
{

String name;
int math,phy,chem;
double total;
double avg;

void accept(){

Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = sc.nextLine();
        System.out.print("Enter marks in Mathmatics: ");
        math = sc.nextInt();
        System.out.print("Enter marks in Physics: ");
        phy = sc.nextInt();
        System.out.print("Enter marks in Chemistry: ");
        chem = sc.nextInt();

}

void compute(){

total = math + phy + chem;
  avg = total / 3.0;

}

void display()
{


        System.out.println("Name: " + name);
        System.out.println("Marks in mathmatics: " + math);
        System.out.println("Marks in physics: " + phy);
        System.out.println("Marks in chemistry: " + chem);
        System.out.println("Total Marks:  " + total);
        System.out.println("Average Marks: " + avg);



}

}

public class Exercise7
{
public static void main(String args[])
{

student ob1 = new student();
ob1.accept();
ob1.compute();
ob1.display();

student ob2 = new student();
ob2.accept();
ob2.compute();
ob2.display();



}
}