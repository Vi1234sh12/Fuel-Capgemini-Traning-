// why we neeed abstract class 
// need of abstract class

abstract class Account {

void getCustinfo()
{
System.out.println("get Cust Info ");

}

abstract void calculateInterest();



}

class Saving extends Account {

@Override 
void calculateInterest()
{

System.out.println("Calculate interest of saving account ");

}



}

class Loan extends Account {

@Override 
void calculateInterest()
{

System.out.println("Calculate interest of Loan Account  ");
}


}

public class DemoAbstractAccount {
public static void main(String args[])
{

// create reference vraibale of abstract class
 Account r ;
r = new Saving();
r.calculateInterest();
r =  new Loan();
r.calculateInterest();




}
}