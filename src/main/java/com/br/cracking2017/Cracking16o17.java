package main.java.com.br.cracking2017;

import static java.lang.StrictMath.max;

/**
 * Created by brianroland on 7/17/17.
 */
public class Cracking16o17 {


    public static int solve(int[] a, int m) throws Exception {

        assert m>0;

        int left=0;
        int right=0;

        int value = a[left];
        int running_sum = 0;

        for (int i=1; i<m;++i) {

            int x = a[i];

            if (value<0) {

                if (x>value) {
                    value = x;
                    left=i;
                    right=i;
                }

            } else {

                if (x <= 0) {
                    running_sum += x;
                } else  {
                    running_sum += x;

                    if (value+running_sum > value) {
                        left = left;
                        right = i;
                        value = value + running_sum;
                    }

                    if (x > value) {
                        left = i;
                        right = i;
                        value = x;
                    }
                }
            }
        }

        return value;
    }


    private static int sum(int[] b, int l, int r) {
        int out =0;
        for (int i=l; i<=r;++i) {
            out += b[i];
        }
        return out;
    }

}
