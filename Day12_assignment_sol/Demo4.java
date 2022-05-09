// do not use  ==  operate to compare String 


public class Demo4 {
public static void main(String[] args)
{

String s1 = new String("abc");
String s2 = new String("abc");

if(s1==s2)
{

System.out.println("equals");
}else{

System.out.println("not equal ");

}
}
}