/*

Create classes that capture bank customers and bank accounts. A customer has a first and last 
name. An account has a customer and a balance. Make objects for two accounts held by the 
same customer.

*/

class BankCustomers{

String first_name,last_name;

BankCustomers(String First_Name,String Last_Name){


first_name = First_Name;
last_name = Last_Name;


}

void Display(){

System.out.println("Customer Name :"+" "+first_name+" "+last_name);
}


void BankAcc (double B)
{

double Bal  = B;

System.out.println("Account Balance : " +Bal);

}

}

class BankAccount{

BankCustomers forcustomer;
double Balance;

BankAccount(double balance){

Balance = balance;


}

void Display()
{

System.out.println ("Account balance :"+Balance);

}



}

public class Exercise34{
public static void main(String args[])
{

BankCustomers ob1 = new BankCustomers("Vishal","Dhanure");
ob1.Display();
ob1.BankAcc(18.00);
BankCustomers ob2 = new BankCustomers("Vishal","Dhanure");
ob2.Display();
ob2.BankAcc(19000.0);
}
}