import java.util.*;
class Address {

String hn;
String ar;
String city;

void setHn( String hn )
{
  this.hn = hn;

}
void setAr()
{
this.ar = ar;
}
void setCity()
{

this.city = city;

}


String getHn()
{
return hn;
}
String getAr()
{
return ar;
}
String getCity()
{
return city;
}


}


class student{

int id;
String name;
Address adr;


void setId(int id)
{
this.id = id ;
}
void setName(String name)
{
this.name = name;
}
void setAdr(Address adr)
{
this.adr = adr;
}


}

public class Stduent_Address {
public static void main(String args[])
{

Address ab = new Address();
ab.setHn("Matoshri");
ab.setAr("WALUJ");
ab.setCity("Aurangabad");

// create student class object 

student st = new student();

int x = 101 ;
 st.setId(x);
 st.setAdr(ab);
 st.setName("xyz");


int id1 ;
id1 = st.setId();
String na;
na = st.setName();
Address ab1 ;
ab1 = st.getAdr();


String hou ;
hou = ab1.getHn();
String areaa ;
areaa = ab1.getAdr();
String cit ;
cit = ab1.getCity();

}
}