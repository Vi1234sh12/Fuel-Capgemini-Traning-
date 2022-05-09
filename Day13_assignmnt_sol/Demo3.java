/*

()

*/

public class Demo3 {
public static void main(String[] args)
{

StringBuffer sb ; 
sb = new StringBuffer("Hello");
System.out.println(sb.capacity());
System.out.println(sb.length());
System.out.println(sb);

sb.setCharAt(0 , 'h');
System.out.println(sb);

// append

sb.append(10);
sb.append(5.6);
sb.append("hi");

System.out.println(sb);

// sb.deleteCharAt()
// delete

sb.delete(1,7);   
System.out.println(sb);      // delete char between between 1 to 6 

StringBuffer sb1 ; 
sb1 = new StringBuffer("I  Java");   // we create Stringbuffer object sb1 


// stringbuffer is fast as compare to string builder 


System.out.println(sb1);
sb1.insert(2,"LIKE");      // insert method add specific index with range (start  , "value ")
System.out.println(sb1);

sb1.reverse();   // call reverse method 
System.out.println(sb1);
String s3 = sb1.toString();  // stringbuffer object convert as String Object 


} // end main method 
} // end demo3 class 