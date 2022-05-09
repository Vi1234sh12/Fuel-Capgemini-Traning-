import java.util.*;

class student {
int id ;
String name;

student(int a , String b)
{
id  = a ;
name = b ;

} 

@Override 
public String toString()
{
return ("("+id+","+name+")");
}

@Override 
public int hashCode()
{

int code ;
code = name.hashCode()+id;
return code ;
}

@Override
public boolean equals(Object obj)
{
boolean f = false;
student st = (student)obj;
if(id==st.id && name.equals(st.name))
{

f = true;

}
return f;
}

}


public class Demo {
public static void main(String[] args)
{

HashSet<student> hs ;
hs = new HashSet<>();

student st1 = new student(1,"A");
student st2 = new student(1,"A");

hs.add(st1);
hs.add(st2);

System.out.println(hs);
System.out.println(st1.hashCode());
System.out.println(st2.hashCode());

}
}
