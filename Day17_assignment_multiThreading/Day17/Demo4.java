// synchronization

class share {
int x ;
synchronized void set()
{

 System.out.println("Got"+x);

}
synchronized void put(int y)
{
  x = y ;
  System.out.println("put"+x);

}


}

class producer implements Runnable {
Thread t ;
share ob ;

producer(share ob1 )
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
   ob.set();
    i++;
  
  }
  
}

}


class consumer implements Runnable {
Thread t ;

share ob1;

consumer(share ob)
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
  
   ob.put();
    i++;
  
  }


}


}



class Demo4 {
public static void main()
{

share ob = new share();
producer p = new producer(ob);
consumer c = new consumer(ob);


}
}


