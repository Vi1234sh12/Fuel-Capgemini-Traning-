/*
Factory pattern : 

Factory pattern use when signle base class & Multiple dervied class are their . based on input parameter decide which class object retrun  that's called Factory pattern.
example : Banking class and two dervied class like saving or loan 

*/

abstract class Account {

abstract void calculateInterest();

}

class Saving extends Account {


@Override
public void calculateInterest()
{
System.out.println("Calculate of Interest of Saving ");

}

} // End Saving class 

class Loan extends Account{

@Override
public void calculateInterest()
{

System.out.println("Calculate Interest of loan");

}


}  // End loan class 


class classFactoryPattern { 

static Account getAccount(String type) // string type 
{

Account obj = null ;  // 

if(type.equalsIgnoreCase("saving"))
{
obj = new Saving(); // object of saving class 
}
else if(type.equalsIgnoreCase("loan"))
{
obj = new Loan();   // object of loan class 
}
return obj;    // return object or both class loan or saving if condition are match 

}  // end static getAccount method 

}  // End class classFactroyPattern 


class DemoFactory  {  //  class DemoFactory 
public static void main(String[] args)  // Main Method
{

Account ob1 = classFactoryPattern.getAccount("loan");
Account ob2 = classFactoryPattern.getAccount("saving");  
ob1.calculateInterest();   // ob1 object call loan method 
ob2.calculateInterest();   // ob2 object call saving method 


} // End Main Method 
} // End class 