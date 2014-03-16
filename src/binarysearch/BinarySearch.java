package binarysearch;

public class BinarySearch {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int[] a = new int[args.length - 1];
        for (int i = 0; i < args.length - 1; i++) {
            a[i] = Integer.parseInt(args[i + 1]);
        }

        search(x, a);
    }

    /**
     * Pre: for all i < a.length - 1: a[i] <= a[i + 1]
     * <p/>
     * Post: outputs (begin, length)
     * where
     * begin = min i, for all j < i, a[j] < x
     * length = number of i, a[i] == x
     */
    public static void search(int x, int[] a) {
        int begin = IterativeBinarySearch.binarySearch(x, a);
        // begin = min i, for all j < i, a[j] < x
        int end = IterativeBinarySearch.upperBound(x, a);
        // end = min i, a[i] > x or a.length if a[i] <= x for all i

        int length = end - begin;
        // length = number of i: x <= a[i] < x = number of i: a[i] = x

        System.out.println(begin + " " + length);
    }
}
