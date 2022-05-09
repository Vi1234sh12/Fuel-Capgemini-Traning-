// CharArrayReader

import java.io.*;
class Demo2 {
public static void main(String[] args)
{

String msg = "देवगिरी ";
char[] arr = msg.toCharArray();
CharArrayReader ob;
ob=new CharArrayReader(arr);
int x;
do{


     x = ob.read();
     System.out.print((char)x);


}while(x!=-1);


}
}
