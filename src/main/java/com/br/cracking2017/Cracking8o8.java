package main.java.com.br.cracking2017;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by brianroland on 7/15/17.
 */
public class Cracking8o8 {

    private char[] input;
    private int nInput;
    private HashSet<String> intermediateDB;
    private int countPermutations;

    public Cracking8o8(char[] input_, int nInput_) {
        input = input_;
        nInput = nInput_;

        intermediateDB = new HashSet<String>();
        countPermutations = 0;
    }

    public void solve() {

        // Create the state at the root of the recursion tree
        int positionToFill = 0;
        int[] selected = new int[nInput];
        char[] out = new char[nInput];               //initialize with a bit pattern indicating null

        //Check is valid input
        if (nInput <= 0) { System.out.print("Cracking8o7.solve: input not valid"); }

        //Begin creating tree
        createStates(positionToFill, selected, out);

        Iterator iter = intermediateDB.iterator();

        //System.out.println("%s", iter.next());
        //while (iter.hasNext()) {
        //
        //    System.out.println(iter);
        //    System
        //    System.out.print("\n");
        //}


    }

    private void createStates(int positionToFill, int[] selected, char[] out) {

        //Check is out in the intermediateDB
        String outStr = new String(out);
        if (intermediateDB.contains(outStr)) {
            return;
        } else {
            intermediateDB.add(outStr);
        }

        // Check is it a leaf/terminal state, if so
        if (isLeafState(positionToFill, selected, out)) {
            printArray(out, nInput);
            countPermutations++;
            return;
        }

        for (int i=0; i<nInput; i++) {
            if (selected[i]==0) {

                int[] selectedUpdated = selected.clone();
                char[] outUpdated = out.clone();

                selectedUpdated[i] = 1;
                outUpdated[positionToFill] = input[i];

                createStates(positionToFill+1, selectedUpdated, outUpdated);
            }
        }
    }

    private boolean isLeafState(int positionToFill, int[] selected, char[] out) {

        if (positionToFill == nInput) {
            return true;
        } else {
            return false;
        }
    }


    private void printArray(char[] x, int n) {
        for (int i=0; i<n; i++) {
            System.out.print(x[i]);
        }
        System.out.print('\n');
    }


    public int countPermutations() {
        return countPermutations;
    }

}
