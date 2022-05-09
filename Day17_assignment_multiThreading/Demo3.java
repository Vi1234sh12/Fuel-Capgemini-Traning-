class share {
    int x ;

    synchronized  void get()
    {
        System.out.println("Got"+x);

    }
    synchronized  void put(int y)
    {
        x = y ;
        System.out.println("put"+x);

    }
}

class producer implements  Runnable{
    Thread t ;
    share ob ;

}




public class Demo3 {
    public static void main(String[] args)
    {
        share ob = share();
        producer p = producer(ob);
        consumer c = consumer(ob);
    }
}