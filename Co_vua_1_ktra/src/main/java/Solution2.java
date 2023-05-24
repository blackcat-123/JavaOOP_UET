import static java.lang.Math.sqrt;

public class Solution2 {

    /**
     * day la.
     * javadoc
     **/
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else {
            for (int i = 2; i <= sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}