import  java.util.*;

class student1 {
    int id;
    String name;

    student1(int a , String b)
    {
        id = a ;
        name = b;

    }


    @Override
    public String toString()
    {
        return ("("+"id"+","+name+")");
    }

    @Override
    public int hashCode()
    {
    
       // int[] arr = new  int[10];
      // String a = "helloworld";
      //  int size = a.length();
        int code;
      //  code = name.hashCode()%50;
      //code = name.hashCode()*50;
      //code = name.hashCode()^50;
     // code = name.hashCode()-arr.length;
     code = name.hashCode() + id;

        return code;
    }

    @Override
    public boolean equals(Object obj)
    {
        boolean f = false;
        // type casting

        student st = (student) obj;
        if(id == st.id && name.equals(st.name))
        {
            f = true;

        }
        return f;
    }
}



public class Demo1 {
    public static void main(String[] args) {
        HashSet<student1> hs ;
        hs = new HashSet<>();

        student1 st1 = new student1(1,"A");
        student1 st2 = new student1(1,"A");

        hs.add(st1);
        hs.add(st2);

        System.out.println(hs);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
