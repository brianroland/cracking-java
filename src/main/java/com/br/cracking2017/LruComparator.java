package main.java.com.br.cracking2017;

import java.util.Comparator;

/**
 * Created by brianroland on 7/19/17.
 */
public class LruComparator implements Comparator<LruElement> {

    public int compare(LruElement x, LruElement y) {
        return -(y.priority - x.priority);
    }
}
