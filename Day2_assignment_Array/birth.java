import java.util.*;
class birth{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);

System.out.println("year of birth");
int birth=sc.nextInt();
System.out.println("current year");
int current=sc.nextInt();
int age=current-birth;
if  (current<20){
int lower=current+2000;
int age2=lower-(birth+1900);
System.out.println("yourage:"+age2);}
else if (birth<20){
int age3=current-birth;
System.out.println("yourage:"+age3);
}else {
System.out.println("your age  is : " +age);
}}}