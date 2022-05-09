/*

Create a class “Room” which will hold the “height”, “width” and “breadth” of the room in three 
fields(variables). This class also has a method “volume()” to calculate the volume of this room

*/
import java.util.*;

class Room {
    int height;
    int width;
    int breadth;

    Room(){}

    //Room(int h, int w, int b){
      //  height = h;
        //width = w;
        //breadth = b;
    //}
    void accept()
    {
    
    
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter height :  ");
        height = sc.nextInt();
        System.out.println("Enter width :  ");
        width = sc.nextInt();
        System.out.println("Enter breadth  : ");
        breadth = sc.nextInt();
        
    
    }

    int volume(){
        return height * width * breadth;
    }
}

public class Exercise6 {
public static void main(String args[])
{

Room r1 = new Room();
r1.accept();
Room r2 = new Room();
r2.accept();

System.out.println("The volume of room 1 is " + r1.volume());
System.out.println("The volume of room 2 is " + r2.volume());


}
}