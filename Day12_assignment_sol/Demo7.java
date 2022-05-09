import java.util.*;

// equal  , equalsIngnoreCase , trim 

public class Demo7 {
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.println("Enter username ");
String un = sc.nextLine();
System.out.println("Enter the Password ");
String pass = sc.nextLine();
un = un.trim();
pass = pass.trim();

// if(un.equal("abc") && pass.equal("xyz")){
// System.out.println("Valid ");
//}else{
//  System.out.println("InValid ");
// }
if(un.equalsIgnoreCase("abc")&& pass.equalsIgnoreCase("xyz"))
{

System.out.println(" Valid " );


}else {

System.out.println("Invalid ");

}

}
}