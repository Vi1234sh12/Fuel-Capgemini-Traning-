/*
Write a Program to take year input from user like 2001,1992 ,..etc calculate 
how many days from from entered  year to current year.


 Input :     Enter the start year : 2000 
             Enter the End Year : 2022 

 Output :    Leap Year : 6
          Not Leap Year : 16
          Leap Year total Days : 2196
          Not Leap Year Days : 5840
          Total Days : 8036


*/

import java.util.*;

public class Exercise2 {  // class 


// static method can access only inside of class 

static int monthCal(int month)
{
return month;

}
  



static int calNum(int year)
{
    return (year / 4) - (year / 100) +
                        (year / 400);          // this formula to check given year leap or not 

} // End static method 


static void leapNum(int yearS, int yearC,int size,int monthC)
{
    yearS--;
    int num1 = calNum(yearS);
    int num2 = calNum(yearC);
    int num3  = num2 - num1 ;
    int num4 = monthCal(monthC);
    
    
    System.out.print("Leap Year : "+num3 +"\n");                    // print leap year count 
    System.out.print("Not Leap Year : " +(size-num3)+"\n");        // print not leap year count 
     
    System.out.print("Leap Year total Days : "+(num3*366) +"\n");    // leap year days 
    System.out.print("Not Leap Year Days : " +((size-num3)*365)+"\n");   // not leap year days 
    System.out.print("Total Days : " +(((size-num3)*365)+(num3*366))+"\n");  // total count of days 
     System.out.print("Total Month : " +num4);

} // End static method 

public static void main(String[] args) // main method 
{

try { // try catch block 

System.out.println("Enter the Year start : "); // print starting year 
Scanner sc = new Scanner(System.in);
int yearS = sc.nextInt();
System.out.println("Enter the current year : ");  // print ending year
int yearC = sc.nextInt();
System.out.println("Enter the current month  : ");
int monthC = sc.nextInt();
int size = yearC - yearS ;
leapNum(yearS,yearC,size,monthC);




}catch(InputMismatchException e)  // inputmismatch error 
{
System.out.println("InputMismatchException!  Please Enter the correct value ! "); // print message exception error 

} 


} // End Main Method 
} // End Cla ss