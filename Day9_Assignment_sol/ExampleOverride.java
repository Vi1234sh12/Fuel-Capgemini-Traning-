/*

Create a base class Fruit which has name ,taste and size as its attributes. A 
method called eat() is created which describes the name of the fruit and its taste. 
Inherit the same in 2 other class Apple and Orange and override the eat() method 
to represent each fruit taste.


*/


class Fruit {

String name ;
String taste;
int size;

Fruit(String name, String taste , int size)
{
this.name = name;
this.taste = taste;
this.size = size;

}

String getName()
{

return name;

}

String getTaste()
{

return taste;

}

int getSize()
{

return size;

}

void eat()
{

System.out.println(" Fruit --> Eat Method is Base class  ");


}

}


class Apple extends Fruit {

Apple(String name , String taste , int size)
{

super(name,taste,size);

}

@Override
void eat()
{

System.out.println(" Apple class ---> call eat method ");

}


}


class Orange extends Fruit {

Orange(String name , String taste , int size)
{

super(name,taste, size);

}

@Override
void eat()
{

System.out.println("Orange class --- > call eat method ");
}


}


public class ExampleOverride {
public static void main(String[] args)
{

Apple ob = new Apple("namemds" , "ssajncjkd" , 12);
ob.eat();
Orange ob2 = new Orange("dsjh", "dwshgf" , 121);
ob2.eat();


}
}

