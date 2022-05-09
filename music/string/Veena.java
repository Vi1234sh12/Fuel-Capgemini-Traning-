package music.string; // package is reprsent group of related classes 

import music.*; // import music directory inside Playable() class call 

public class Veena implements Playable {   // Veena is public class and Inherited Playable class for override function i.e Play()

public void play() // Override Play method inside Playable interface 
{

System.out.println("Veena Play method call  ! "); // print message 

}  // End method 

}  // End Class 