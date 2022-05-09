import java.util.*;
class elseif{
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
String s1;
char ch;
int x;
System.out.println("enter char");
s1=sc.next();
ch=s1.charAt(0);
x=ch;
if (x>=65 && x<=90){
System.out.println("capital");
}
else if (x>=91 && x<=122){
System.out.println("small");
}
else if (x>=48  && x<=57){
System.out.println("digit");
}
else{
System.out.println("not char");
}
}}
