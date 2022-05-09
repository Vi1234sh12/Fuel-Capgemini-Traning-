/*
Write a class “Box” that with three member-variables “height”, “width” and “breadth”. Write 
suitable constructors to initialize them. Add functions like “getVolume” and “getArea” that will 
return volume and surface area respectively. Create object of boxes and then print their volume 
and surface area

*/

class Box
{

int height , width , breadth ;
double volume , area ;

Box(int h , int w , int b)
{

height = h;
width = w ;
breadth = b;

System.out.println("Height :"+" "+height);
System.out.println("width :"+" "+width);
System.out.println("breadth :"+" "+breadth);



}

void getVolume()
{


volume = height * width * breadth ;
System.out.println("Box of Volume :"+" "+volume);



}

void getArea()
{


area = height * width ;

System.out.println("Box of Area :"+" "+area);



}



}


public class Exercise8
{
public static void main(String args[])
{

Box ob1 = new Box(1,2,3);
ob1.getVolume();
ob1.getArea();








}
}