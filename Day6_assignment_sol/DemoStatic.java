/*

Static Method

*/

import java.util.*;

class Test {

int i;


static int j;

Test()
{
  i = i + 1;
  j = j + 1;

}


void display()
{

System.out.println(i);
System.out.println(j);

}

}


public class DemoStatic {

public static void main(String[] args)
{


 Test t1 = new Test();
 Test t2 = new Test();
 Test t3 = new Test();
 
t1.display();
t2.display();
t3.display();


}
}