import java.util.*;

class DemoFour
{

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Sentence : " );
String str = sc.nextLine();
int times = str.length();
int i = 0 ;
while(i<=times)
{


System.out.println(str +"\t" +  i );
i += 1;


}

}
}