/**
 * http://www.kgeorgiy.info/courses/java-intro/homeworks.html#homework-2
 *
 * @author Zakhar Voit (zakharvoit@gmail.com)
 */
public class RecursiveBinarySearch {
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
     * result = min i, a[i] >= x or a.length if such i does not exist
     */
    public static int binarySearch(int x, int[] a) {
        if (a.length == 0 || a[a.length - 1] < x) {
            // for all i: a[i] < x
            return a.length;
        }
        // a[a.length - 1] >= x
        return binarySearchOnSubarray(x, a, -1, a.length - 1);
    }

    /**
     * Pre:
     * 1) for all i < a.length - 1: a[i] <= a[i + 1]
     * 2) l == -1 or a[l] < x
     * 3) r < a.length and a[r] >= x
     * <p/>
     * Post:
     * result = min i: l < i && i <= r && a[i] >= x
     */
    private static int binarySearchOnSubarray(int x, int[] a, int l, int r) {
        if (r - l == 1) {
            // l == -1 || a[l] < x
            // a[r] >= x
            // r - l == 1
            return r;
        }

        int m = (l + r) / 2;
        // l < m <= r

        if (a[m] >= x) {
            // (l == -1 || a[l] < x) && a[m] >= x
            return binarySearchOnSubarray(x, a, l, m);
        }

        // (m == -1 || a[m] < x) && a[r] >= x
        return binarySearchOnSubarray(x, a, m, r);
    }
}
