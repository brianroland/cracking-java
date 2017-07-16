package main.java.com.br.cracking2017;

import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashSet;

/**
 * Created by brianroland on 7/15/17.
 */
public class Cracking8o11 {

    int n;
    int[] currency;
    int nCurrency;

    HashSet<String> intermediateDB;

    int nWays;

    public Cracking8o11(int n_, int[] currency_, int nCurrency_) {
        n = n_;
        currency = currency_;
        nCurrency = nCurrency_;
        intermediateDB = new HashSet<String>();

        nWays=0;
    }

    public int solve() {

        //Assert meaningful input
        if (n < 0 | nCurrency < 0) {
            System.out.println("bad input");
            return 0;
        }
        for (int iCurrency=0; iCurrency < nCurrency; ++iCurrency) {
            if (currency[iCurrency] < 0) {
                System.out.println("bad input");
                return 0;
            }
        }

        // Create initial intermediate
        int[] root = new int[nCurrency];
        createStates(root);
        return nWays;
    }


    private void createStates(int[] intermediate) {

        // Check is the intermediate in the DB
        String key = keyFromArray(intermediate);
        //System.out.println(key);
        if (intermediateDB.contains(key)) {
            return;
        } else {
            intermediateDB.add(key);
        }

        // Check is the intermediate a solution
        if (isSolution(intermediate)) {
            nWays += 1;
            return;
        }

        // Check is the intermediate malformed
        if (sumIntermediate(intermediate) > n) {
            return;
        }

        // Create new intermediates
        for (int i=0; i < nCurrency; ++i) {
            //System.out.println(String.format("currency %d",i));
            int[] intermediateNew = intermediate.clone();
            intermediateNew[i] += 1;
            createStates(intermediateNew);
        }
    }


    public String keyFromArray(int[] intermediate) {

        String out = new String();
        out = out + intermediate[0];
        for (int i=1; i<nCurrency; i++) {
            out = out + String.format(",%d",intermediate[i]);
        }
        return out;
    }


    private boolean isSolution(int[] intermediate) {

        int s = sumIntermediate(intermediate);
        return s==n;
    }


    private int sumIntermediate(int[] intermediate) {

        int out = 0;
        for (int i=0; i<nCurrency; ++i) {
            out += currency[i]*intermediate[i];
        }
        return out;
    }

}
