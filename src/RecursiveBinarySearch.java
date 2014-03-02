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

    /*
    Pre:
        1) for all i < a.length - 1: a[i] < a[i + 1]
        2) a[a.length - 1] >= x
    Post:
        result = min i, a[i] >= x
     */
    public static int binarySearch(int x, int[] a) {
        return binarySearchOnSubarray(x, a, -1, a.length - 1);
    }

    /*
    Pre:
        1) for all i < a.length - 1: a[i] < a[i + 1]
        2) a[l] not exists or a[l] < x
        3) exists a[r] >= x
    Post:
        result = min i, a[i] >= x
     */
    public static int binarySearchOnSubarray(int x, int[] a, int l, int r) {
        if (r - l == 1) {
            return r;
        }

        int m = (l + r) / 2;

        if (a[m] >= x) {
            return binarySearchOnSubarray(x, a, l, m);
        }

        return binarySearchOnSubarray(x, a, m, r);
    }
}
