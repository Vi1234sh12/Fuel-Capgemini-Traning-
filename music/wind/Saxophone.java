
package music.wind; // package inside two directory music & music directory inside another directory is wind 
import music.*; //this import keyword for import Playable class file so we import music  all file 
public class Saxophone implements Playable {  
// class as declear as public because we need acess from outside of package 
// class name is Saxophone 
// implements keyword use when base class are interface 
// implements are allows to creare multiple inheritence in java 

public void play()   // Play method or Function call  
{
// void is represent is datatype 

System.out.println("Saxophone  play method call ");  // print message 

}

}