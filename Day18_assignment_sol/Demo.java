// generics1 

class student {   //student class 
int id;            // id 
String name;      // name 

}  // end class 


class Test<T> {   // generies class 
T i;       
Test(T x)   // test constructor 
{
i = x ;
}


void show()   // show function 
{
System.out.println(i);   // print i value 
System.out.println(i.getClass().getName());    

}


}

public class Demo {
public static void main(String[] args)
{

Test<Integer> ob1 = new Test<>(10);
Test<String> ob2 = new Test<>("hello");
ob1.show();
ob2.show();
student st = new student();
Test<student> ob3 = new Test<>(st);
ob3.show();
}
}