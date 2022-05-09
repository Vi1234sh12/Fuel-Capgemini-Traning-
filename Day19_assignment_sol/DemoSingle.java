/*
Singleton Pattern
*/

class Sequence {
static int counter;
static Sequence obj = null ;
private Sequence() {
counter = 0 ;
}

static synchronized Sequence getInstance(){

if(obj == null)
{
obj = new Sequence();
System.out.println("Object Created");
}
return obj;

}

static synchronized int getCount()
{
counter++;
System.out.println("count is "+ counter);
return counter ;

}

}

public class DemoSingle {
public static void main(String[] args)
{

Sequence s = Sequence.getInstance();
s.getCount();
Sequence s2 = Sequence.getInstance();
s.getCount();

}
}