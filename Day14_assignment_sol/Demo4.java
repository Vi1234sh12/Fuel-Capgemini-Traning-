//ObjectOutputStream

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


public class Demo4 {
public static void main(String[] args) throws Exception 
{


student st ;
st = new student();
st.setId(1122);
st.setName("xyz");
FileOutputStream fout;
fout = new FileOutputStream("D:\\Code-Code\\Day14_assignment_sol\\studinfo.txt");

ObjectOutputStream out ;
out = new ObjectOutputStream(fout);

out.writeObject(st);


out.close();


}
}