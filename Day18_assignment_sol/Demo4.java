class Test<T>
{

T i;
 void set(T x)
 {
 i = x ;
 }
 
 void show()
 {
 System.out.println(i);
 System.out.println(i.getClass().getName());
 
 }

}



public class Demo4 {
public static void main(String[] args)
{

Test<Integer> t1 = new Test<>();
Test<String> t2 = new Test<>();
t1.set(100);
t2.set("Hello world");
t1.show();
t2.show();


}
}
