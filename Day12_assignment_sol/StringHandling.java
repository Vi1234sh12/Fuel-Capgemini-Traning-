import java.util.*;

public class StringHandling {
public static void main(String[] args)
{
 
char ch = 'a';   // character  '' 
String s1 = "a"; // String  " " 

char[] arr = {'A','B','C','D'};
String s3 = new String(arr);
System.out.println(s3);

//by using byte array 

byte[] arr1 ={97,98,99,100};
String s4 = new String(arr1);
System.out.println(s4);

//

String s5 = new String(s4);
System.out.println(s3);

}
}