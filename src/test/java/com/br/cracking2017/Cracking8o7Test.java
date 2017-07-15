package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking8o7;
import org.junit.Test;

/**
 * Created by brianroland on 7/15/17.
 */
public class Cracking8o7Test {

    @Test
    public void test0() {
        System.out.print("test0: beg\n");
        System.out.print("test0: end\n");
    }

    @Test
    public void test1() {
        System.out.print("test1: beg\n");

        char[] input = new char[] {'a', 'b', 'c'};
        int nInput = 3;

        Cracking8o7 problem = new Cracking8o7(input, nInput);

        problem.solve();

        System.out.print("test1: end\n");
    }

    @Test
    public void test2() {
        System.out.print("test2: beg\n");

        char[] input = new char[] {'a', 'b', 'c', 'd'};
        int nInput = 4;

        Cracking8o7 problem = new Cracking8o7(input, nInput);

        problem.solve();

        System.out.print("test2: end\n");
    }
}