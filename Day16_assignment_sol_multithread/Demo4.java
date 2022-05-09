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

System.out.println("Child Thread"+i);
Thread.sleep(500);

}

}catch(Exception e) {


  }



}

}

public class Demo4 {
public static void main(String[] args)
{
test t1 = new test("A");
test t2 = new test("B");
test t3 = new test("C");

System.out.println("Start ");

System.out.println("Child Thread A"+t1.t.isAlive());
System.out.println("Child Thread B"+t2.t.isAlive());
System.out.println("Child Thread c"+t3.t.isAlive());

try {

t1.t.join();
t2.t.join();
t3.t.join();
}catch(Exception e)
{
System.out.println("Child Thread A"+t1.t.isAlive());
System.out.println("Child Thread B"+t1.t.isAlive());
System.out.println("Child Thread C"+t1.t.isAlive());


}

System.out.println("End " );

}
}