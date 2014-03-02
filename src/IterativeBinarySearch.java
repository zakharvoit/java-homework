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

    /*
    Pre:
        1) for all i < a.length - 1: a[i] < a[i + 1]
        2) exists a[a.length - 1] >= x
    Post:
        result = min i, a[i] >= x
     */
    public static int binarySearch(int x, int[] a) {
        int r = a.length - 1;
        int l = -1;

        /*
        Inv:
            exists a[r] >= x
            a[l] not exists or a[l] < x
         */
        while (r - l > 1) {
            int m = (l + r) / 2;
            if (a[m] >= x) {
                r = m;
            } else {
                l = m;
            }
        }

        return r;
    }
}
