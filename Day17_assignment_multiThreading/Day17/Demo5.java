class share {
int x ;
synchronized void get()
{

System.out.println("GOT"+x);

}

synchronized void set(int y)
{
x = y ;
System.out.println("PUT"+x);

}

}


class Producer implements Runnable {
Thread t;
share ob;

Producer(share ob1)
{
t = new Thread(this);
ob = ob1 ;
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


public class Demo5 {
public static void main(String[] args)
{
share  ob = new share();

Producer p = new  Producer(ob);
Consumer c = new Consumer(ob);


}
}