package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking8o8;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brianroland on 7/15/17.
 */
public class Cracking8o8Test {

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

        Cracking8o8 problem = new Cracking8o8(input, nInput);
        problem.solve();

        System.out.print("test1: end\n");
    }

    @Test
    public void test2() {
        System.out.print("test1: beg\n");

        char[] input = new char[] {'a', 'b', 'b'};
        int nInput = 3;

        Cracking8o8 problem = new Cracking8o8(input, nInput);
        problem.solve();

        System.out.print("test1: end\n");
    }

    @Test
    public void test3() {
        System.out.print("test3: beg\n");

        char[] x = new char[] {'a', 'b', 'c'};
        char[] y = new char[] {'a', 'b', 'c'};

        boolean arraysAreEqual = (x==y);
        System.out.println(String.format("arraysAreEqual=%b", arraysAreEqual));


        String u = "abc";
        String v = "abc";

        boolean stringsAreEqual = (u==v);
        System.out.println(String.format("stringsAreEqual=%b", stringsAreEqual));


        String convert = new String(x);
        boolean arrayConvertsToString = (u==convert);
        System.out.println(convert);
        System.out.println(String.format("arrayConvertsToSTring=%b", arrayConvertsToString));

        System.out.print("test3: end\n");
    }

    @Test
    public void test4() {
        System.out.print("test4: beg\n");

        char[] input = new char[] {'a', 'b', 'b','c', 'c'};
        int nInput = 5;

        Cracking8o8 problem = new Cracking8o8(input, nInput);
        problem.solve();
        int count = problem.countPermutations();

        assertEquals(count, 30);

        System.out.print("test4: end\n");
    }

}
