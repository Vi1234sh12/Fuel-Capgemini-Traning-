import java.util.*;

class Address {

int  houseno;
String city;
String areaname;

// getter & setter function 

public void setHouseno(int houseno){

this.houseno = houseno;


}
public void setCity(String city){

this.city = city;


}
public void setAreaname(String areaname){

this.areaname = areaname;
}


 int getHouseno()
{

return houseno;

}

 String getCity(){

return city;
}

 String getAreaname()
{

return areaname ;

}

}



class student{

int id;
String name;
Address adr;

// getter & setter function  -- 6 function 

public void setId(int id)
{

this.id=id;

}

public void setName(String name)
{
this.name = name;

}
public void setAdr(Address adr)
{

this.adr = adr;
}


public int getId()
{

return id;

}


public String getName()
{

return name;
}

public Address getAdr()
{

return adr;

}

}

class Demo2 {

public static void main(String[] args)
{


Address ab = new Address();
ab.setHouseno(1);
ab.setAreaname("ghj");
ab.setCity("Aurangbad");

// create student class object 

student st = new student();
 int x = 101 ;
 st.setId(x);
 st.setAdr(ab);
 st.setName("xyz");
2 
 int id1 ;
 id1 = st.getId();
 String n;
 n = st.getName();
 Address ad1 ;
 ad1=st.getAdr();
 
 int hn;
 hn=ad1.getHouseno();
 String are ;
 are = ad1.getAreaname();
 String cit;
 cit = ad1.getCity();
 
 

}

}

