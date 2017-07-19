package main.java.com.br.cracking2017;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by brianroland on 7/17/17.
 *
 * finished linear time algo
 *
 * Does this handle a[i] = comple[i]
 * Does this handle 2 occurances of same value having 1 or 2 complements in the input?
 *
 */
public class Cracking16o24 {

    public static void solve(int[] a, int m, int value) {

        // Count each unique key in the input
        HashMap<Integer, Integer> inputCount = new HashMap<Integer, Integer>();
        for (int i=0; i<m; ++i) {
            if (inputCount.containsKey(a[i])) {
                inputCount.replace(a[i],1+inputCount.get(a[i]));
            } else {
                inputCount.put(a[i], 1);
            }
        }

        // Make complement array
        int[] c = new int[m];
        for (int i=0; i<m; ++i) { c[i] = value - a[i]; }

        // Check each element and the complment
        for (int i=0; i<m; ++i) {

            if (a[i]!=c[i] & inputCount.containsKey(a[i]) & inputCount.containsKey(c[i])) {

                System.out.println(String.format("%d,%d", a[i], c[i]));

                inputCount.replace(a[i], -1 + inputCount.get(a[i]) );
                inputCount.replace(c[i], -1 + inputCount.get(c[i]) );

                if (inputCount.get(a[i])==0) {
                    inputCount.remove(a[i]);
                }

                if (inputCount.get(c[i])==0) {
                    inputCount.remove(c[i]);
                }

            } else if (a[i]==c[i] & inputCount.containsKey(a[i])) {
                if (inputCount.get(a[i]) >= 2) {

                    System.out.println(String.format("%d,%d", a[i], c[i]));
                    inputCount.replace(a[i], -2 + inputCount.get(a[i]));

                    if (inputCount.get(c[i]) == 0) {
                        inputCount.remove(c[i]);
                    }
                }

            }


        }



    }
}
