/*
substring();
endsWith()
startsWith()

*/


public class Demo1 {
public static void main(String[] args)
{

String s1 = "Hello World";
String s2 = s1.substring(2);
System.out.println(s2);
s2 = s1.substring(2,8);
System.out.println(s2);

// ++++++++++++++ 

System.out.println(s1.startsWith("He"));
System.out.println(s1.startsWith("Hello"));
System.out.println(s1.startsWith("hello"));

System.out.println(s1.endsWith("Hello"));
System.out.println(s1.endsWith("ld"));

System.out.println(s1.endsWith("wor"));

}
}