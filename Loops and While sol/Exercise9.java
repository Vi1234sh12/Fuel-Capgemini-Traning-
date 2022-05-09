/*

Exercise9 while & loop 
Write program to find Armstrong numbers between 1 to n

*/

import java.util.*;

public class Exercise9
{
    public static void main(String[] args) 
     {    
     
Scanner sc = new Scanner(System.in);
System.out.print("Enter the Limit value of n : ");
int limit = sc.nextInt();
 int n, count = 0, a, b, c, sum = 0;
        System.out.print("Armstrong numbers from 1 to n:");
        for(int i = 1; i <= limit; i++)
        {
            n = i;
            while(n > 0)
            {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if(sum == i)
            {
                System.out.print(i+" ");
            }
            sum = 0;
        }
    }
}