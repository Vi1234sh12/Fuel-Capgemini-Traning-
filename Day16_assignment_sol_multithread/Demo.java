//

class test implements Runnable {

Thread t ;

test()
{

t = new Thread(this);
t.start();

}
@Override
public void run()
{

try {

for(int i=0;i<5;i++)
{
System.out.println("Child thread"+i);
Thread.sleep(500);
}

}catch(Exception e)
{


}


}


}


public class Demo {
public static void main(String[] args)
{
test t1 = new test();

try {

for(int i=0;i<5;i++)
{
System.out.println("Main Thread"+i);
Thread.sleep(1000);

}

}catch(InterruptedException e)
{


}


}
}