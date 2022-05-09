/*
Create a class that captures planets. Each planet has a name, a distance from the sun, and its 
gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures 
real numbers. Make objects for Earth and your favorite non-earth planet.
*/
import java.util.*;
class Planets{
  String planets_name;
  double distance;
  double gravity;
  
 Planets(String Planets_name,double Distance,double Gravity)
 {
 planets_name = Planets_name;
 distance = Distance;
 gravity = Gravity;
 }
  0000
  321
  .
  .
  .
  54.
  .03303222222203.22222.525
  ................3..333333333333333333333333333333.
  void show()
???>M>?>M????????????????"   
  System.out.println("Planets:"+" "+planets_name);
  System.out.println("Distance:"+" "+distance);
  System.out.println("Gravity:"+" "+gravity);
   
  }


}

public class Exercise2{
public static void main(String args[])
{


Planets ob1 = new Planets("Earth", 149.6 * 1000000,1);
Planets ob2 = new Planets("Mars", 227.9 * 1000000,0.394);

ob1.show();
ob2.show();


}
}

/*
O/P : 
Planets: Earth
 Distance: 1.496E8
 Gravity: 1.0
 Planets: Mars
 Distance: 2.279E8
 Gravity: 0.394

*/