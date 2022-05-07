/*

 

Exercise 1 — Internet Delicatessen
You have been asked to write a program for the Sam and Ella Delicatessen. The program takes
daily orders from the Internet. It asks for the item, its price in cents, and if express delivery is
wanted. The program writes out the order and the charges. Regular delivery for items under $10
is $2.00; for items $10 or more delivery is free. For express delivery add $3.00.
Enter the item: Tuna Salad
Enter the price: 4.50
Overnight delivery (0==no, 1==yes): 1
Invoice:
 Tuna Salad 4.50
 delivery 5.00
 total 9.50

*/



import java.util.Scanner;

public class Exercise1
{
   public static void main(String[] args)
   {
      double regPrice = 2.00;
      double overnightPrice = 0.00;

      Scanner keyboard = new Scanner(System.in);

      System.out.print("Enter the item: ");
      String itemName = keyboard.nextLine();

      System.out.println();

      System.out.print("Enter the price: ");
      double itemPrice = keyboard.nextDouble();

      System.out.println();

      System.out.print("Overnight delivery (0 == no, 1 == yes): ");
      int overnightCheck = keyboard.nextInt();

      System.out.println();


      if(overnightCheck >= 0 && overnightCheck <= 1)
      {
         if(overnightCheck == 1)
            overnightPrice = 5.00;
      }

      System.out.println("             Invoice:          \n"+
      "===================================\n");

      System.out.print(itemName);
      System.out.printf("       %.2f",itemPrice);

      if(itemPrice > 10)
         regPrice = 3.00;

      System.out.println();

      double totalShip = regPrice+ overnightPrice;

      System.out.printf("Shipping         %.2f",totalShip);

      System.out.println();

      double totalPrice = itemPrice + totalShip;

      System.out.printf("Total            %.2f",totalPrice);
   }
}