//upper traingle//
import java.util.*;
  
public class upper
{
    private static final int N = 4;
      public static Boolean isUpperTriangularMatrix(int mat[][])
    {
        for (int i = 1; i < N ; i++)
            for (int j = 0; j < i; j++)
                if (mat[i][j] != 0)
                    return false;
        return true;
    } 
      
        public static void main(String argc[]){
        int[][] mat= { { 1, 3, 5, 3 },
                       { 0, 4, 6, 2 },
                       { 0, 0, 2, 5 },
                       { 0, 0, 0, 6 } };
                      
        if (isUpperTriangularMatrix(mat))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}