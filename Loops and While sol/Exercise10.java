/*
Assignment while & loop

Write program to find the sum of first and last digit of any number(number may contain 
3 digit,4 digit or 5 digit
*/

public class Exercise10
{   
    public static void main(String args[]) 
    {   
        int number = 502356997;
        int firstDigit = 0;
        int lastDigit = 0;
 
        lastDigit = number%10;
        System.out.println("Last digit: "+lastDigit);
 
        while(number!=0) {
            firstDigit = number%10;
            number /= 10;
        }
        System.out.println("First digit: "+firstDigit);
    }
}