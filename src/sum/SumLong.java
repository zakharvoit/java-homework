package sum;

import java.math.BigInteger;

/**
 * Task 1 modified (http://www.kgeorgiy.info/courses/java-intro/homeworks.html#homework-1)
 * <p/>
 * Gets numbers as command line arguments (10 and 16 radix) and returns their sum in long.
 *
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class SumLong {
    public static void main(String[] args) {
        System.out.println(solve(args));
    }

    public static long solve(String[] args) {
        long res = 0;
        for (String arg : args) {
            String[] tokens = arg.split("\\s");
            for (String x : tokens) {
                x = x.trim().toLowerCase();
                if (!x.isEmpty()) {
                    if (x.length() >= 3 && x.charAt(0) == '0' && x.charAt(1) == 'x') {
                        res += new BigInteger(x.substring(2, x.length()), 16).longValue();
                    } else {
                        res += Long.parseLong(x, 10);
                    }
                }
            }
        }
        return res;
    }

}
