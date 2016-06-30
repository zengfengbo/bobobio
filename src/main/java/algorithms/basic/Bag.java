package algorithms.basic;

import java.util.Arrays;
import java.util.Iterator;

/**
 * Created by fb on 16/6/19.
 */
public class Bag<Iterm> implements Iterable<Iterm> {

    public static void main(String[] args) {
        System.out.println("test");
        System.out.println(new Bag<Integer>(8).isEmpty());
        Bag<Integer> a_bag = new Bag<Integer>(8);
        a_bag.add(2);
        System.out.println(a_bag);
        for( Integer it: a_bag) System.out.println(it);
    }

    private Iterm[] iterms;
    private int length;

    public Bag(int N) {
        iterms = (Iterm[]) new Object[N];
        length = N;
    }
    public Bag() {
        iterms = (Iterm[]) new Object[0];
    }

    void add(Iterm iterm) {
        Iterm[] itermsOld = iterms;
        length = iterms.length + 1;
        iterms = (Iterm[]) new Object[length];

        iterms[length-1] = iterm;
        for (int i = 0; i < length-1; i++) {
            iterms[i] = itermsOld[i];
        }
    }

    boolean isEmpty() {
        if (length==0) return true;
        else return false;
    }

    int size() {
        return  length;
    }

    @Override
    public String toString() {
        return "Bag{" +
                "iterms=" + Arrays.toString(iterms) +
                ", length=" + length +
                '}';
    }

    @Override
    public Iterator<Iterm> iterator() {
        return new BagIterator();
    }

    private class BagIterator implements Iterator<Iterm> {
        private int i = -1;
        public boolean hasNext() { return i >= -1 && i < length-1;}
        public Iterm next() {
            return iterms[++i];
        }
        public void remove() {}
    }
}
