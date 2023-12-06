import java.io.*;
import java.util.*;

public class hacker_rank1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        String A = "hello";
        String B = "java";
        System.out.println(A.length() + B.length());
        if(A.compareTo(B) > 0)
        {
            System.out.println("Yes");
        } else
        {
            System.out.println("No");
        }
        A = Character.toUpperCase(A.charAt(0)) + A.substring(1);
        B = Character.toUpperCase(B.charAt(0)) + B.substring(1);
         
        System.out.println( A + " " + B );
        
    }
}
