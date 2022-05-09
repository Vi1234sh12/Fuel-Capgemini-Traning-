//Object Input Stream 

import java.io.*;

class student implements Serializable {
private int id;
private String name;

// getter and setter method 


public int getId()
{
return id;
}

public void setId(int id)
{
this.id = id ;
}
public String getName()
{
return name;
}
public void setName(String name)
{

this.name = name;

}

}

public class Demo5 {
public static void main(String[] args) throws Exception
{
FileInputStream fin;
fin = new FileInputStream("D:\\Code-Code\\Day14_assignment_sol\\studinfo.txt");

ObjectInputStream in ;
in = new ObjectInputStream(fin);

student st3 = (student) in.readObject();
System.out.println(st3.getId());
System.out.println(st3.getName());


}
}