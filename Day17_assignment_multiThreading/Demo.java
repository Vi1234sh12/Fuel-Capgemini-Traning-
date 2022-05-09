class Share {
    int x;
    synchronized void get()
    {
        System.out.println("Got"+x);
    }

    synchronized  void set(int y)
    {
        x = y ;
        System.out.println("put"+x);

    }

}

class producer implements Runnable {
    Thread t;
    Share ob ;

    producer(Share ob1)
    {
        t = new Thread(this);
        ob = ob1;
        t.start();
    }
    @Override
    public void run()
    {
        int i = 0;
        while (true){
            ob.set(i);
            i++;
        }
    }
}

class consumer implements Runnable {
    Thread t;
    Share ob;

    consumer(share ob1)
    {
        t = new Thread(this);
        ob = ob1;
        t.start();
    }

    @Override
    public void run()
    {
        int i = 0;
        while(true){
            ob.get();
            i++;
        }
    }
}


public class Demo {
    public static void main(String[] args)
    {

         Share ob = new Share();
         producer p = new producer(ob);
         consumer c = new consumer(ob);
         
    }
}