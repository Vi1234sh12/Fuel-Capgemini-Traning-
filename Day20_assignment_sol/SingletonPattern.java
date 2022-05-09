/*
Assignment 
Create your own implementation to show how design 
pattern works.

create your class to show working of 
1.singleton pattern
2.factory pattern
3.prototype pattern

*/

import java.util.*;

class SingletonPattern {
static int count ; 
static SingletonPattern ob = null ;

private SingletonPattern()
{
count = 0 ;
}

static synchronized SingletonPattern getSolution()
{

if(ob == null){
 ob = new SingletonPattern();
 System.out.println("New object created ");

}
return ob;

}

static synchronized int getCount()
{
count++;
System.out.println("count is "+count);
return count;

}



public static void main(String[] args)
{

SingletonPattern s = SingletonPattern.getSolution();
s.getCount();
SingletonPattern s1 = SingletonPattern.getSolution();
s1.getCount();
}
}