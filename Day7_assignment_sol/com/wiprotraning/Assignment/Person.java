package com.wiprotraning.Assignment;

public class Person {

String name;

Person(String name)
{

this.name = name ;


}

String getName()
{

return name;

}

@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}



}