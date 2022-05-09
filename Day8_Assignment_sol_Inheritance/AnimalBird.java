/*

Assignment 1 : Inheritance  






this problem based  
1.inheritence 
2.overriding cocepts 
3.constructor without arugments 

*/


class Animal {

Animal()
{

}

void eat()
{

System.out.println("Animal  ---> Eat Method Call  " ) ;

}

void sleep()
{

System.out.println("Animal ---> sleep method call ");
}


}

class Bird extends Animal {

Bird()
{



}

@Override
void eat()
{

System.out.println("Bird ----> Eat method call  --> Base class Method  ");

}

@Override
void sleep()
{

System.out.println("bird  ---> sleep method call -> Base class Method  ");

}


void flay()
{

System.out.println("Flay ---> method call ");

}

}


public class AnimalBird {
public static void main(String args[])
{


Animal ob = new  Animal();
ob.eat();
ob.sleep();

Bird ob2 = new Bird();
ob2.eat();
ob2.sleep();
ob2.flay();

}
}