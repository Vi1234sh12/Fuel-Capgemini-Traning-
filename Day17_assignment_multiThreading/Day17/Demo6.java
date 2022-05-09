// wait & notify 

class share {
int x ;
boolean f = false;

synchronized void get()
{

try{

if(f==false)
{
wait();
}

}catch(Exception e)
{


}
System.out.println("GOT"+x);
f = false;
notify();
} 

synchronized void set(int y)
{

try{
if(f==true)
{
wait();
}

}catch(Exception e)
{

}
x = y ;
System.out.println("PUT"+x);
f = true;
notify();


}

}


class Producer implements Runnable {
Thread t;
share ob;

Producer(share ob1)
{

t = new Thread(this);
ob = ob1;
t.start();
}
@Override
public void run()
{
int i=0;
while(true )
{
ob.set(i);
i++;

  }
 }
}

class Consumer implements Runnable {
Thread t;
share ob;

Consumer(share ob1)
{
t = new Thread(this);
ob = ob1;
t.start();
}
@Override 
public void run()
{
int i=0;
while(true)
{
ob.get();
i++;

}
}
}


public class Demo6 {
public static void main(String[] args)
{

share ob = new share();
Producer p = new Producer(ob);
Consumer c = new Consumer(ob);

}
}