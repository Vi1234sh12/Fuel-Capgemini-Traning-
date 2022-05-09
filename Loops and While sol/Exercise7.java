// Exercise7
// 3. Write program to check a enter number is Prime number or not using while & for loop


import java.util.*;
public class Exercise7 {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Number :");
    int num = sc.nextInt();
    boolean flag = false;
    for (int i = 2; i <= num / 2; ++i) {
      // condition for nonprime number
      if (num % i == 0) {
        flag = true;
        break;
      }
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}