// import your libraries
import static java.lang.Math.abs;

import java.util.Scanner;

public class Solution {
    /**
     *  Javadoc.
     */
    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return abs(gcd(b, a % b));
        }
    }

}
