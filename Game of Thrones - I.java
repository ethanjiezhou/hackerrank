import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans;
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        ans = checkPermutation(inputString);
        System.out.println(ans);
        myScan.close();
    }
    public static String checkPermutation(String inputString) {
        BitSet bs = new BitSet();
        for (byte b : inputString.getBytes())
            bs.flip(b);
        if(bs.cardinality() < 2)
            return "YES";
        return "NO";
    }
}