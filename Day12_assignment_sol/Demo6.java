// split 

public class Demo6 {
public static void main(String[] args)
{

String s1 = "this is demo string ";

String[] arr = s1.split(" ");
for(String s2 : arr)
{
System.out.println(s2.toUpperCase());
System.out.println(s2.toLowerCase());

}

}
}