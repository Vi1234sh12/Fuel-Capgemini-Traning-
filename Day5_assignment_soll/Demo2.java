public class Demo2 {

public static void main(String[] args)
{

// boxing 

int x = 102;
Integer ob  = new Integer(x);



// un boxing 
 int y;
 y = ob.intValue();

System.out.println(y);

//-------------------------

// Auto Boxing 

int p=104;
Integer ob2 = p;

// Auto UnBoxing 

int q ;
q = ob2;

System.out.println(q);



}
}