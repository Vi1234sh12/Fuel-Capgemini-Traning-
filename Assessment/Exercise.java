import java.util.*;

public class Exercise {
    public static void main(String[] args) {
        System.out.println("Enter the size : ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 1; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < size; i++) {
            arr[i] = arr[i] * i;
        }
        System.out.println("Square root : ");
        for (int i = 1; i < size; i++) {
            System.out.println(arr[i]); // print square root
        }

    } // end Main method

} // End Exercise class