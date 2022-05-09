/*
Create classes that capture bank customers and bank accounts. A customer has a first and last 
name. An account has a customer and a balance. Make objects for two accounts held by the 
same customer.
*/

import java.util.*;
class BankCustomer {
 
     String fname;
     String lname;
     
     void setFname(String fname){
     
     this.fname = fname;
     
     }
     
     String getFname()
     {
     
     return this.fname;
     
     }
     void setLname(String lname){
     
       this.lname = lname;
     
     }
      String getLname()
      {
      
      return this.lname;
      
      }

}

class BankAccount {

  int balance;
  BankCustomer cust;
  
  void showAccount()
  {
  
  
  System.out.println("first name :"+cust.getFname());
  System.out.println("last name :"+cust.getLname());
  System.out.println("Balance :"+balance);
  
  }
  
  BankAccount(BankCustomer cust,int balance){
  
  this.cust = cust;
  this.balance = balance;
  
  }
  


}

public class DemoExercise3{
public static void main(String args[])
{


BankCustomer ob1 = new BankCustomer();
ob1.setFname("ABC");
ob1.setLname("XYZ");
System.out.println("---------------- SAME PERSON TWO DIFFERENT  ACCOUNT ID CHECK  -------------");
BankAccount acc1 = new  BankAccount(ob1,1000);
acc1.showAccount();
BankAccount acc2 = new BankAccount(ob1,500);
acc2.showAccount();
System.out.println("---------------- END OF PROGRAM -------------");



}
}



