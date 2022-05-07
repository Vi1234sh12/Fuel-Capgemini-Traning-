/*

Assignment2 . Fantasy Game 

Exercise 4 — Fantasy Game
In a new role-playing fantasy game players must design their character by picking a point value
for each of three characteristics:
• Strength, from 1 to 10
• Health, from 1 to 10
• Luck, from 1 to 10

Write a program that asks for a name for the character and asks for the point value of for each of
the three characteristics. However, the total points must be less than 15. If the total exceeds 15,
then 5 points are assigned to each characteristic
Welcome to Yertle's Quest
Enter the name of your character:
Chortle
Enter strength (1-10):
8
Enter health (1-10):
4
Enter luck (1-10):
6
You have to give your character too many points! Default values have been
assigned:
Chortle, strength: 5, health: 5, luck: 5


*/


import java.util.*;

class Exercise2 {
public static void main(String[] args)
{

Scanner sc  = new Scanner(System.in);
System.out.print("Enter the your name : ");
String name = sc.nextLine();
System.out.print("Enter the number between 1 to 10 : for Strength ");
int Strength = sc.nextInt();
System.out.print("Enter the number beteen 1 to 10 : for health ");
int health = sc.nextInt();
System.out.print("Enter the number between 1 to 10 : for luck ");
int luck = sc.nextInt();

System.out.println("You have to given your character too many points ! Default values have been assigned : \n"+"Name : "+ name+"\n"+"Strength :" + Strength+"\n"+"Health :"+ health+"\n"+"Luck : " +luck);


}
}