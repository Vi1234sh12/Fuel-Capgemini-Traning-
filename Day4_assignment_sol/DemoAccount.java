import java.util.*;
class Account{

   int id;
   String name;
   int balance;
   
   Account(int id,String name,int balance){
   
         this.id=id;
         this.name=name;
         this.balance = balance;
         
         System.out.println("Constructor with argument : ");
         
   } 
   
   Account(){
   
   id = 1;
   name = "xyz";
   balance = 20000;
   
   
   System.out.println("Constructor without Arugment :");
   
   
   }


    void showAccount()
    {
    
    
    System.out.println("*************************");
    System.out.println(" Account Id : "+" "+id);
    System.out.println(" Name of person : "+name);
    System.out.println("Account  Balance : "+balance);
    System.out.println("******************************");     
    }
    
    void deposit(int amt)
    {
    
    balance+=amt;
    
    }
    
    void withDraw(int amt)
    {
    
    balance-=amt;
    
    
    }
   

}

public class DemoAccount{
public static void main(String args[])
{

Account t1 = new Account();
t1.showAccount();
t1.deposit(500);
t1.showAccount();
Account t2 = new Account(2,"abcs",1500);
t2.showAccount();


}
}