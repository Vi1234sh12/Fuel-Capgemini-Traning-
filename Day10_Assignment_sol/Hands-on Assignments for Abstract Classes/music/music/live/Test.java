
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
import music.live.Test;

public class Test {
public static void main(String[] args)
{

Veena ob = new Veena();
ob.Play();
Saxophone ob1 = new Saxophone();
ob1.Play();
Playable ob2 = new Playable();
ob2.Play();

 Playable pv, ps; 
 pv = new Veena();
 ps = new Saxophone();
 pv.Play();
 ps.Play();       


}
}