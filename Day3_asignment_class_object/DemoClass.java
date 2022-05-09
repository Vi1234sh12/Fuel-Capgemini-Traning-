class Circle{

 float radius, area ;
 
 void setRadius(float x)
 {
 
 radius = x ;
  System.out.println("radius of circle :"+radius);
 }
 void calculateArea()
 {
 
  double area = 3.14 * radius * radius;
  System.out.println("area of circle :"+area);
 
 }





}

public class DemoClass
{
public static void main(String args[])
{

Circle ob1 = new Circle();
Circle ob2 = new Circle();

ob1.setRadius(1.2f);
ob2.setRadius(3.4f);
ob1.calculateArea();
ob2.calculateArea();





}
}