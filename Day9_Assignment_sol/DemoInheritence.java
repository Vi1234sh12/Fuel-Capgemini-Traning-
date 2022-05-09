/*

Asssignment :  Inheritence 

Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class 
methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using 
this object.Create an instance of Bird class and invoke the eat, sleep and fly 
methods using this object.


*/

class Animal {

Animal(){}

void eat()
{

System.out.println(" eat method ");                                                                              


}

void sleep()
{

System.out.println("sleep method ");

}

}


class Bird extends Animal {

Bird(){}

void fly()
{
System.out.println(" fly method ");

}

@Override
void eat()
{

System.out.println("Override eat method ");

}


@Override
void sleep()
{

System.out.println("Override sleep method ");

}


}

public class  DemoInheritence{
public static void main(String[] args)
{

Animal a = new Animal();
Bird b = new Bird();
a.eat();
a.sleep();
b.eat();
b.sleep();
b.fly();



}
}