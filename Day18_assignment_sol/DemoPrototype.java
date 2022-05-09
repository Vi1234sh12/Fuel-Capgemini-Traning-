/*

Prototype Pattern : is used when object creation is costly  affair  created lot's of time or resources 
this design patterm provide  --- > 
two type of clonning 
1.shallow  cloning  
2.Deep cloning 
*/

import java.util.*;

class student implements Cloneable {

ArrayList<String> ar ;

student()
{
ar = new ArrayList<>();

}

student(ArrayList<String> t)
{

ar = t ;

}

void loadData()
{

ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");


}


void showData()
{
System.out.println("=================");
for(String s : ar )
{
System.out.println(s);
}
System.out.println("=================");
}

@Override 
protected Object clone() throws CloneNotSupportedException {

ArrayList<String> ar2 ;
ar2 = new ArrayList<>();

for(String s : ar)
{
ar2.add(s);
}
student obj = new student(ar2);
return obj;


}

}


public class DemoPrototype {
public static void main(String[] args) throws Exception
{

student st1 = new student();
st1.loadData();
//st1.showData();

student st2 =(student)st1.clone();
st1.showData();
st2.showData();

}
}