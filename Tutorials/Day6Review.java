import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = Integer.valueOf(in.nextLine());
        
        for(int i = 0; i < N; i++) {
            String str = in.nextLine();
            handler(str);
        }
        
        in.close();
    }
    
    public static void handler(String str) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }
        sb.append(" ");
        for(int i = 1; i < str.length(); i += 2) {
            sb.append(str.charAt(i));
        }
        
        System.out.println(sb.toString());
    }
}