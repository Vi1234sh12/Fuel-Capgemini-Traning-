/*

Protype pattern 

*/

import java.util.*;

class Car implements Cloneable {

ArrayList<String> model ;
Car()
{
model = new ArrayList<>();

}

Car(ArrayList<String> cars)
{

this.model = model;

}


void loadData()
{

model.add("Model A");
model.add("Model B");
model.add("Model C");
model.add("Model D");

}

void showData()
{

for(String s : model)
{

System.out.println(s);

}

}

// override 

@Override
protected Object clone() throws CloneNotSupportedException  {

ArrayList<String> temp = new ArrayList<>();

for(String s : this.model)
{

temp.add(s);

}
return new Car(temp);

}

}


public class DemoPrototype {
public static void main(String[] args) throws Exception
{

Car c1 = new Car();
c1.loadData();
c1.showData();

Car c2 =(Car)c1.clone();
c1.showData();
c2.showData();



}
}