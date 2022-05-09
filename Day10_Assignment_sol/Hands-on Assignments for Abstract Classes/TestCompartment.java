/*

Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in 
this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the 
notice function in each of them to print notice suitable to the type of the compartment. Create a class 
TestCompartment . Write main function to do the following: Declare an array of Compartment of size 
10. Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4. 
Check the polymorphic behavior of the notice method.


*/


import java.util.*;

abstract class Compartment {

public abstract String notice();

}

class FirstClass extends Compartment  {

@Override 
public String notice()
{

return "First Class Compartment ";

}

}


class Ladies extends Compartment {

@Override 
public String notice()
{

return "Ladies Compartment ";

}
}


class General extends Compartment {
@Override 
public String notice()
{

return "Gerneral Compartment ";

}
}


class Luggage extends Compartment {
@Override 
public String notice()
{


return "Luggage Compartment ";


}
}


public class TestCompartment {
public static void main(String[] args)
{


 Compartment[] Compartments = new Compartment[10];
 
 Random random = new Random();


for (int i = 0; i < 10; i++) {
	    		int randomNum = random.nextInt((4 - 1) + 1) + 1;
	    	
	    		if (randomNum == 1)
	    			Compartments[i] = new Luggage();
	    		else if (randomNum == 2)
	    			Compartments[i] = new Ladies();
	    		else if (randomNum == 3)
	    			Compartments[i] = new General();
	    		else if (randomNum == 4)
	    			Compartments[i] = new FirstClass();
	    	
	    		System.out.println(Compartments[i].notice());
	    	}

}
}