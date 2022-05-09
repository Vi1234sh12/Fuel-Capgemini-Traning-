import java.util.*;

class DataBase {

static DataBase ob = null ;
private DataBase()
{

}
public static DataBase getInstance()
{

if(ob == null)
{
 ob = new DataBase();
 System.out.println(" DataBase are Created ! ");

}
return ob;
}

public  void  getConnection()
{
System.out.println("you are connected to  DataBase ");
}


public static void main(String[] args)
{

DataBase db = DataBase.getInstance();
db.getConnection();
DataBase db1 = DataBase.getInstance();
db1.getConnection();

}
}