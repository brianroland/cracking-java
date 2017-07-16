package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking8o11;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brianroland on 7/15/17.
 */
public class Cracking8o11Test {


    @Test
    public void test0() {
        System.out.println("test0: beg");
        System.out.println("test0: end");
    }

    @Test
    public void test1() {
        System.out.println("test1, test keyFromArray(): beg");

        int n = 25;
        int[] currency = new int[] {25, 10, 5, 1};
        int nCurrency = 4;

        int[] x = new int[] {0,1,2,3};

        Cracking8o11 problem = new Cracking8o11(n, currency, nCurrency);
        String y = problem.keyFromArray(x);
        System.out.println(y);

        System.out.println("test1, test keyFromArray(): end");
    }

    @Test
    public void test2() {
        System.out.println("test2: beg");

        int n = 1;
        int[] currency = new int[] {25, 10, 5, 1};
        int nCurrency = 4;

        Cracking8o11 problem = new Cracking8o11(n, currency, nCurrency);
        int nWays = problem.solve();
        System.out.println(String.format("nWays=%d", nWays));

        System.out.println("test2: end");
    }

    @Test
    public void test3() {
        System.out.println("test3: beg");

        int n = 10;
        int[] currency = new int[] {25, 10, 5, 1};
        int nCurrency = 4;

        Cracking8o11 problem = new Cracking8o11(n, currency, nCurrency);
        int nWays = problem.solve();
        System.out.println(String.format("nWays=%d", nWays));
        assertEquals(nWays,4);

        System.out.println("test3: end");
    }


}
