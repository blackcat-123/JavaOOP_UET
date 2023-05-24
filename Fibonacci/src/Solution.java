// Import your library
// Do not change the name of Solution class

public class Solution {

    // Comment
    // First line

    public class long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0 || n == 1){
            return n;
        }
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        for (int i = 2; i < n; i++){
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
