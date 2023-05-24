public class Solution {

    // Type your main code here
    /**
     * day la.
     * javadoc
     **/
    public static long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1) {
            return n;
        }
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        for (int i = 2; i < n; i++) {
            f0 = f1;
            f1 = fn;
            fn = f0 + f1;
            if (n > 92) {
                return Long.MAX_VALUE;
            }
        }
        return fn;
    }

}