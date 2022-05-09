/*
Factory Pattern

*/

abstract class Account {

   abstract void calculateInterest();
}

class Saving extends Account {

@Override
void calculateInterest() {

System.out.println("Calculate Interest of Saving ");

}

}

class Loan extends Account {

@Override
void calculateInterest() {

System.out.println("Calculate Interest of Loan ");

}

}



class AccountFactory {
public static Account getAccount(String type)
{

Account obj = null ;

if(type.equalsIgnoreCase("Saving"))
{

obj = new Saving();


}else {

obj = new Loan();


}
return obj;


}
}


class DemoFactory {
public static void main(String[] args)
{

Account ob1 = AccountFactory.getAccount("Loan");
ob1.calculateInterest();

Account ob1 = AccountFactory.getAccount("Saving");
ob1.calculateInterest();


}
}