class test implements Runnable {
Thread t ;
test(String n){

t = new Thread(this);
t.setName(n);
t.start();

}

@Override 
public void run()
{
   try {
   
   for(int i=0;i<5;i++)
   {
    System.out.println("Child Thread "+i);
    Thread.sleep(500);
   
   }
   
   
   }catch(Exception e)
   {
   
   
   }

}

}

public class Demo2 {
public static void main(String[] args)
{
test t1 = new test("A");
test t2 = new test("B");
test t3 = new test("C");

try{

for(int i=0;i<5;i++)
{

System.out.println("Main Thread"+i);
Thread.sleep(1500);
}

}catch(InterruptedException e)
{


}

}
}