import java.util.*;

class Simple{

public static void main(String args[]){
String  itemname;
float itemprice,total;
int choice;
Scanner sc ;
sc = new Scanner(System.in);
System.out.print("Enter the item Name : ");
itemname = sc.next();
System.out.println("Enter the Items Price : " );
itemprice = sc.nextFloat(); 
if (itemprice < 10){

total = itemprice + 2 ;

}else{

total  = itemprice;
}
System.out.println("Overnight delivery (0 = no, 1=yes)");
choice = sc.nextInt();
if (choice == 1)
{

total += 3;
}

System.out.println("Total Cost : " + total);

}
}