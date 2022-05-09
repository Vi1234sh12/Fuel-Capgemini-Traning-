/*

assignment sol : 

Write an interface called Playable, with a method void play(); Let this interface be placed in a 
package called music.
Write a class called Veena which implements Playable interface. Let this class be placed in a 
package music.string
Write a class called Saxophone which implements Playable interface. Let this class be placed in 
a package music.wind
Write another class Test in a package called live. Then, a. Create an instance of Veena and call 
play() method b. Create an instance of Saxophone and call play() method c. Place the above 
instances in a variable of type Playable and then call play()


*/

package music.live;   // music directory inside live directory so create package 
import music.wind.*; // music -- > wind -- > directory inside saxophone class file present
import music.string.*; // music -- > string -- > directory inside veena class file are present 

public class Test { // decler class name is test 
public static void main(String[] args) // main method call 
{
Veena v1 = new Veena(); // create object of veena class 
v1.play(); // play method call
Saxophone s1 = new Saxophone(); // create mew object that's s1 
s1.play(); // play method call  
} // end of main method 
} // end of test class 

