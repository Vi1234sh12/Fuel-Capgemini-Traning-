/*
Create an ArrayList which will be able to store only Strings. Create a printAll method which will print
all the elements using an Iterator.
*/

import java.util.*;

public class Exercise2 {

public ArrayList<String> list = new ArrayList<>();

public ArrayList<String>printString() {

list = new ArrayList<>();

   list.add("xyz");
   list.add("abc");
   list.add("asd");
   list.add("vis");
   list.add("jsf");

return list;

}

public ArrayList<String>printring() {

ArrayList<String> newList = new ArrayList<String>();     
     for (String item : list) {
			newList.add(item );
			System.out.println(item);
		}
		
		return newList;
}



public static void main(String[] args)
{

Exercise2 ob = new Exercise2();
ob.printString(); 
ob.printring();


}
}