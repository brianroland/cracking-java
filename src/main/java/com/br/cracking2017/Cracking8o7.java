package main.java.com.br.cracking2017;

/**
 * Created by brianroland on 7/15/17.
 *
 * Cracking8o7: recursive solution --> there should be an iterative solution as well
 *
 *
 *
 */
public class Cracking8o7 {

    char[] input;
    int nInput;

    public Cracking8o7(char[] input_, int nInput_) {
        input = input_;
        nInput = nInput_;
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
    }

    private void createStates(int positionToFill, int[] selected, char[] out) {

        // Check is it a leaf/terminal state, if so
        if (isLeafState(positionToFill, selected, out)) {
            printArray(out, nInput);
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


}
