package binarysearch;

/**
 * http://www.kgeorgiy.info/courses/java-intro/homeworks.html#homework-2
 *
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class IterativeBinarySearch {
    public static void main(String[] args) {
        System.out.println(run(args));
    }

    public static int run(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        return binarySearch(x, a);
    }

    /**
     * Pre:
     * for all i < a.length - 1: a[i] <= a[i + 1]
     * <p/>
     * Post:
     * result = min i, a[i] > x, of a.length if such i does not exist
     */
    public static int upperBound(int x, int[] a) {
        if (x == Integer.MAX_VALUE) {
            // x + 1 > a[i] for all i
            return a.length;
        }
        // x < Integer.MAX_VALUE
        return binarySearch(x + 1, a);
        // result = min i, for all j < i, a[j] < x + 1
        //        = min i, a[i] > x, or a.length if such i does not exist
    }

    /**
     * Pre:
     * for all i < a.length - 1: a[i] <= a[i + 1]
     * <p/>
     * Post:
     * result = min i, a[i] >= x or a.length if such i does not exist
     */
    public static int binarySearch(int x, int[] a) {
        if (a.length == 0 || x > a[a.length - 1]) {
            // for all i: a[i] > x
            return a.length;
        }

        int r = a.length - 1;
        // r == a.length - 1
        int l = -1;
        // r == a.length - 1 && l == -1

        /*
        Inv:
            l < r
            r < a.length && a[r] >= x
            l == -1 || a[l] < x
         */
        while (r - l > 1) {
            // l < r
            // a[r] >= x
            // a[l] < x || l == -1
            int m = (l + r) / 2;
            // l < m <= r
            if (a[m] >= x) {
                // a[m] >= x && m > l
                r = m;
                // l < r && a[r] >= x && (l == -1 || a[l] < x)
            } else {
                l = m;
                // l < r && a[r] >= x && (l == -1 || a[l] < x)
            }
            // l < r && a[r] >= x && (l == -1 || a[l] < x)
        }

        // l == -1 || a[l] < x
        // r - l == 1
        // a[r] >= x

        return r;
    }
}
