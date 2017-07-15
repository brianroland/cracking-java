package main.java.com.br.cracking2017;

/**
 * Created by brianroland on 7/14/17.
 *
 *  A recursive / exponential solution: okay for restricted input
 *
 *  For general input, this will take exponential time
 *
 */
public class Cracking1o5 {

    public char[] query;
    public char[] target;
    int nQuery;
    int nTarget;

    public char[] longer;
    public char[] shorter;
    int nL;
    int nS;


    public Cracking1o5(char[] query_, int nQuery_, char[] target_, int nTarget_) {

        query = query_;
        nQuery = nQuery_;
        target = target_;
        nTarget = nTarget_;

        if (nQuery <= nTarget) {

            longer = target;
            shorter = query;
            nL = nTarget;
            nS = nQuery;

        } else {

            longer = query;
            shorter = target;
            nL = nQuery;
            nS = nTarget;
        }
    }

    public void printInput() {

        System.out.print("query:\n");
        for (int iQ=0; iQ < nQuery; ++iQ) {
            System.out.print(query[iQ]);
        }
        System.out.print("\n");

        System.out.print("target:\n");
        for (int iT=0; iT < nTarget; ++iT) {
            System.out.print(target[iT]);
        }
        System.out.print("\n");


        System.out.print("longer:\n");
        for (int iL=0; iL < nL; ++iL) {
            System.out.print(longer[iL]);
        }
        System.out.print("\n");

        System.out.print("shorter:\n");
        for (int iS=0; iS < nS; ++iS) {
            System.out.print(shorter[iS]);
        }
        System.out.print("\n");
    }



    private boolean isStateTerminal(int state_iL, int state_iS, int state_jS, int state_nDelete, int state_nReplace) {

        return ((state_nDelete + state_nReplace) > 1) | ((state_iS > nS) | (state_iL > nL));

    }


    private boolean doesStateSolveProblem(int state_iL, int state_iS, int state_jS, int state_nDelete, int state_nReplace) {

        return (state_iL==nL & state_iS==nS) & ((state_nDelete + state_nReplace) <= 1);
    }


    private boolean createNewStates(int state_iL, int state_iS, int state_jS, int state_nDelete, int state_nReplace) {




        if (doesStateSolveProblem(state_iL, state_iS, state_jS, state_nDelete, state_nReplace)) {
            return true;
        }


        if (isStateTerminal(state_iL, state_iS, state_jS, state_nDelete, state_nReplace)) {
            return false;
        }


        //check equality of characters
        if (shorter[state_iS] == longer[state_iL]) {

            return createNewStates(state_iL+1, state_iS+1, state_jS, state_nDelete, state_nReplace);

        } else {


            boolean outReplace = createNewStates(state_iL+1, state_iS+1, state_jS, state_nDelete, state_nReplace+1);
            boolean outDelete = createNewStates(state_iL+1, state_iS, state_jS, state_nDelete+1, state_nReplace);


            return outReplace | outDelete;

        }

    }

    public boolean solve() {

        //storage on the stack
        int state_iL = 0;
        int state_iS = 0;
        int state_jS = 0;
        int state_nDelete = 0;
        int state_nReplace = 0;

        boolean out = createNewStates(state_iL, state_iS, state_jS, state_nDelete, state_nReplace);

        return out;
    }


}
