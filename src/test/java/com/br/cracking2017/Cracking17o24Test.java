package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking17o24;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brianroland on 7/24/17.
 */
public class Cracking17o24Test {


    @Test
    public void test0() {
        System.out.println("Cracking17o24Test: beg");
        System.out.println("Cracking17o24Test: end");
    }

    @Test
    public void test1() throws Exception {
        System.out.println("Cracking17o24Test: beg");

        int[][] a = new int[2][2];
        a[0][0] = 0;
        a[0][1] = -2;
        a[1][0] = -1;
        a[1][1] = 8;

        int result = Cracking17o24.solve(a,2,2);

        System.out.println(String.format("sumForMaxSubarray=%d",result));

        assertEquals(result,8);

        System.out.println("Cracking17o24Test: end");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("Cracking17o24Test: beg");

        int[][] a = new int[3][3];
        a[0][0] = 0;
        a[0][1] = -2;
        a[0][2] = 4;
        a[1][0] = -1;
        a[1][1] = 8;
        a[1][2] = 3;
        a[2][0] = -4;
        a[2][1] = -7;
        a[2][2] = 5;

        int result = Cracking17o24.solve(a,3,3);

        System.out.println(String.format("sumForMaxSubarray=%d",result));

        assertEquals(result, 13);

        System.out.println("Cracking17o24Test: end");
    }


}
