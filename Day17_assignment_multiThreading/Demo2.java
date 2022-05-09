/*
Multi-Threading
----------------

 */


class Printer {
    void print(String s) {
        try {
            System.out.print("[" + s);
            Thread.sleep(500);
        } catch (Exception e) {

        }
    }

}


class test implements Runnable{
 Printer p;
 String msg;
 Thread t ;

 test(String s , Printer ob1)
 {
     t = new Thread(this);
     p = ob1;
     msg = s;
     t.start();

  }
  @Override
    public void run()
  {
      synchronized (p)
      {
          p.print(msg);
      }
  }



    }




public class Demo2 {
    public static void main(String[] args)
    {

        Printer ob = new Printer();
        test t1 = new test("A",ob);
        test t2 = new test("B",ob);
        test t3 = new test("C",ob);


    }
}
