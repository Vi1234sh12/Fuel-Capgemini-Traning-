// this example for why 

class a { 

@Override

public String toString()
{

return "this is object of A class ";

}

}
class b extends a {

@Override
public String toString()
{

return "this is object of B class ";

}

}

public class DemoOver {
public static void main(String[] args)
{
 
 a ob = new a();
 b ob2 = new b();
 System.out.println(ob);
System.out.println(ob2);
System.out.println(ob.toString());
System.out.println(ob2.toString());
}
}



/*
this example for default toString pass the object class then they return hashcode of A class and B class 
 a@5acf9800   - > default  value of A class from parent class(object class)
 b@4617c264   -> default value of b class from A class 
 a@5acf9800 ---- > default value under tostring method or function 
 b@4617c264 ------ > same as above line 
 
 
 
 ---------------------------> Add toString Override Method --> 
 
 this is object of A class 
 this is object of B class 
 this is object of A class 
 this is object of B class 
 

 

*/