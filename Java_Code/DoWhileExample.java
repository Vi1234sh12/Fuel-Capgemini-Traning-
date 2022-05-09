import java.util.*;

public class DoWhileExample {    
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in);
System.out.print("Enter the starting number \n ");
int start = sc.nextInt();
System.out.print("Enter the ending number   \n ");
int End  = sc.nextInt();       
    do{    
        System.out.println(start);    
    start++;    
    }while(start<=End);    
}    
}  