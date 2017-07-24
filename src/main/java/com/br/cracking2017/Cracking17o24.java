package main.java.com.br.cracking2017;

/**
 * Created by brianroland on 7/24/17.
 */
public class Cracking17o24 {


    public static int solve(int[][] a, int nRow, int nCol) throws Exception {

        int sumForMaxSubarray = 0;

        for (int r0=0; r0 < nRow; ++r0) {
            int[] sumOverRows = new int[nCol];

            for (int r1=r0+1; r1 <= nRow; ++r1) {

                //Update sumOverRows
                for (int c=0; c < nCol; ++c) {
                    sumOverRows[c] += a[r1-1][c];
                }

                int sumForMaxSubarrayThis_r0_r1 = Cracking16o17.solve(sumOverRows,nCol);

                if (sumForMaxSubarrayThis_r0_r1 > sumForMaxSubarray) {
                    sumForMaxSubarray = sumForMaxSubarrayThis_r0_r1;
                }

            }
        }

        return sumForMaxSubarray;
    }

}
