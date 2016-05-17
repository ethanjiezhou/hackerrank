import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner it = new Scanner(System.in);
        
        int n = it.nextInt();
        int result = factorial(n);
        System.out.print(result);
        
        it.close();
    }
    
    public static int factorial(int n) {
        if(n == 1)
            return n;
        
        return n * factorial(n - 1);
    }
}