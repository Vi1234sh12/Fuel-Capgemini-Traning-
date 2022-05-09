/*
 Example for pass by reference 
 
 Null pointer expection  
 

*/

class test {

  int i,j;
  
 void setIj(int x , int y)
 {
    i = x;
    j = y;
   
 }
   void add()
   {
   
   System.out.println(i+j);
   }
 


}

public class DemoPassbyValue
{
public static void main(String[] args)
{

test t1 = new test();

test t2 = null;

t1.setIj(10,20);

t2 = t1 ;
t2.setIj(30,40);
t1.add();
t2.add();




}
}