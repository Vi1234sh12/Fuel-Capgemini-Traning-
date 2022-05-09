import java.util.*;
import java.text.*;

public class OneLetterbylineone
{
    public static void main (String[] args)
    {
        int length;
        char current;
        String msg = "user input";

        Scanner scan = new Scanner(System.in);
        System.out.println ("Enter a string: ");
        msg = scan.nextLine();
        length = msg.length();

        for (int count = 0; count < length; count++)
        {
            current = msg.charAt(count);
            System.out.println (current);
            count++;
        }
    }
}