import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count = 0;
        int max = 0;
        while(n > 0){
            int m = n % 2;
            n = n / 2;
            if(m == 1) {
                count++;
            } else {
                count = 0;
            }
            max = Math.max(count, max);
        }
        System.out.println(max);
        in.close();
    }
}