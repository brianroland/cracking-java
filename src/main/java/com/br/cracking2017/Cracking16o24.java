package main.java.com.br.cracking2017;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by brianroland on 7/17/17.
 *
 *
 *
 * WIP
 *
 * Does this handle a[i] = comple[i]
 * Does this handle 2 occurances of same value having 1 or 2 complements in the input?
 *
 */
public class Cracking16o24 {

    public static void solve(int[] a, int m, int value) {

        int[] complements = new int[m];
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        for (int i = 0; i < m; ++i) {

            if (count.containsKey(a[i])) {
                Integer currentValue = count.get(a[i]);
                currentValue += 1;
                count.replace(a[i], currentValue);
            } else {
                count.put(a[i], 1);
            }
            complements[i] = value - a[i];
        }

        System.out.println("check hashmap interface");
        for (Integer key : count.keySet()) {
            System.out.println(String.format("key %d has count %d", key, count.get(key)));
        }

        for (int i = 0; i < m; ++i) {

            if (a[i] != complements[i] & count.containsKey(complements[i])) {

                System.out.println(String.format("%d, %d", a[i], complements[i]));
                count.remove(a[i]);

            } else if (a[i] == complements[i] & count.containsKey(a[i]) ) {

                if (count.get(a[i]) > 1 ) {

                    System.out.println(String.format("%d, %d", a[i], complements[i]));
                    count.remove(a[i]);
                }
            }

        }
    }
}
