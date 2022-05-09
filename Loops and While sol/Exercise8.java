/*
Assignment 8  while & loop 
Write program to calculate power of number (a raise to b) using while & for loop


*/


import java.util.*;
class Exercise8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of base & Exponent : ");
    int base = sc.nextInt();
    int exponent = sc.nextInt();

    long result = 1;

    while (exponent != 0) {
      result *= base;
      --exponent;
    }

    System.out.println("Answer = " + result);
  }
}