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

public class Exercise3{
public static void main(String args[])
{

BankCustomers ob1 = new BankCustomers("Vishal","Dhanure");
BankAccount ob2 = new BankAccount(1900.00);
ob1.Display();
ob2.Display();

}
}