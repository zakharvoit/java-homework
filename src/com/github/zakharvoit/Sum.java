package com.github.zakharvoit;

/**
 * Task 1 (http://www.kgeorgiy.info/courses/java-intro/homeworks.html)
 * <p/>
 * Gets numbers as command line arguments and returns their sum.
 *
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class Sum {
    public static void main(String[] args) {
        System.out.println(solve(args));
    }

    public static int solve(String[] args) {
        int res = 0;
        for (String arg : args) {
            String[] tokens = arg.split("\\s");
            for (String x : tokens) {
                x = x.trim();
                if (!x.isEmpty()) {
                    res += Integer.parseInt(x);
                }
            }
        }
        return res;
    }
}
