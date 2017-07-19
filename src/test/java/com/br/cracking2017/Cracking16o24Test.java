package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking16o24;
import org.junit.Test;

/**
 *
 * finished linear time algo
 *
 *
 * Created by brianroland on 7/17/17.
 */
public class Cracking16o24Test {

    @Test
    public void test0() {
        System.out.println("test0: beg");
        System.out.println("test0: end");
    }

    @Test
    public void test1() {
        System.out.println("test1: beg");

        int[] a = new int[]{4,2,3,1,8,8};
        int m = 6;
        int value = 6;

        Cracking16o24 problem = new Cracking16o24();
        problem.solve(a, m, value);

        System.out.println("test1: end");
    }

    @Test
    public void test2() {
        System.out.println("test2: beg");

        int[] a = new int[]{4,4,4,2,2,3,3,1};
        int m = 8;
        int value = 6;

        Cracking16o24 problem = new Cracking16o24();
        problem.solve(a, m, value);

        System.out.println("test2: end");
    }

}
