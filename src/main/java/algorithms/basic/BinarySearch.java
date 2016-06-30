package algorithms.basic;

import java.util.Arrays;

/**
 * Created by fb on 16/6/12.
 * algs4.cs.princeton.edu
 */
public class BinarySearch {
    /**
    * @param sa sorted array
    *
    */
    public static int rank(int key, int[] sa)
    {
        int lo = 0;
        int hi = sa.length - 1;
        while (lo <= hi){
            int mid = lo + (hi - lo) /2;
            if (key < sa[mid]) hi = mid -1;
            else if (key > sa[mid]) lo = mid +1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] ints = {1, 3, 2, 5, 7, 8};
        int key = 5;

        Arrays.stream(ints).forEach(e -> System.out.print(e + ", "));
        System.out.println("");

        Arrays.sort(ints);
        Arrays.stream(ints).forEach(e -> System.out.print(e + ", "));
        System.out.println("");

        System.out.println(rank(key, ints));
    }
}
