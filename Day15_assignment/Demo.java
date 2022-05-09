// ByteArrayInputStream 


import java.io.*;
class Demo{
public static void main(String[] args)
{

String msg="hiiii";
byte[] arr = msg.getBytes();
ByteArrayInputStream ob ;
ob = new ByteArrayInputStream(arr);
int x ;
do {

 x = ob.read();
 System.out.print((char)x);

}while(x!=-1);


}
}