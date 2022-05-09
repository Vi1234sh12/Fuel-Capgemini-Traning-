// ArrayList Class 


import java.util.*;

public class Demo8 {
public static void main(String[] args)
{

ArrayList<String>ar;
ar = new ArrayList<>();
//check size of ArrayList
System.out.println(ar.size());
//Add item in arraylist 

ar.add("A");
ar.add("B");
ar.add("C");
ar.add("D");
ar.add("E");

System.out.println(ar.get(0));


// System out.println(ar.size());
// add item at specific  index 

ar.add(1,"x");

System.out.println("By using for loop ........");
for(int i = 0 ; i<ar.size();i++)
{
System.out.println(ar.get(i));
}


System.out.println("By using for each loop ......");   // for each loop 
// this for each loop efficient for print sequence of data 
for(String s : ar)
{
System.out.println(s);
}

System.out.println("By using Iterator ");  // print iterator function 
Iterator<String> it;   
it = ar.iterator();  
while(it.hasNext())   // check condition 
{
   System.out.println(it.next());
}


System.out.println("By using ListIterator");
ListIterator it1 ;  
it1 = ar.listIterator();   // list operator same work as other operator are work only difference is that we can print 
// array forward as well as backward direction 

System.out.println("Forward ....");  // print Forward Direction 
while(it1.hasNext())
{
System.out.println(it1.next());
}


System.out.println("Backward .....");   // print Backward  Direction 
while(it1.hasPrevious())
{
System.out.println(it1.previous());  // we use previous function to print previous element in array
} // end while loop 

} // end main method 
} // end class 