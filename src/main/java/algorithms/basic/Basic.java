package algorithms.basic;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Arrays;

/**
 * Created by fb on 16/6/12.
 */
public class Basic {
    public static void main(String[] args)
    {
        System.out.println(gcd(10000000,250000000));
        Arrays.stream(seq(1,20,3)).forEach(e -> System.out.println(e));
        //plot_points();
        int N = 50;
        double[] a = new double[N];
        for (int i = 0; i < N; i++) {
            a[i] = StdRandom.random();
        }
        //plot_bars(a);
        Arrays.sort(a);
        //plot_bars(a);
        int[] ints = {1};

        System.out.println(all_equal(ints));
    }

    public static int gcd(int p, int q)
    {
        if (q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }

    public static int[] seq(int from, int to, int by)
    {
        int[] ints = new int[(to - from)/by];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = from + i * by;
        }
        return ints;
    }

    public static void plot_points()
    {
        int N = 100;
        StdDraw.setXscale(0, N);
        StdDraw.setYscale(0, N*N);
        StdDraw.setPenRadius(.01);

        for (int i =1; i <= N; i++) {
            StdDraw.point(i,i);
            StdDraw.point(i, i*i);
            StdDraw.point(i, i*Math.log(i));
        }
    }

    public static void plot_bars(double[] a)
    {
        int N = a.length;

        for (int i =0; i < N; i++) {
            double x = 1.0 * i/N;
            double y = a[i] / 2.0;
            double rw = 0.5 / N;
            double rh = a[i]/2.0;

            StdDraw.filledRectangle(x,y,rw,rh);
        }
    }

    public static boolean all_equal(int[] a)
    {
        int length = a.length;
        if (length <= 1)
            return true;
        else {
            int a0 = a[0];
            for (int i = 1; i < length; i++) {
                if (a[i] != a0) {
                    return false;
                }
            }
            return true;
        }
    }
}
