package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking1o5;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brianroland on 7/14/17.
 */
public class Cracking1o5Test {

    @Test
    public void test0() {
        System.out.print("test0: beg\n");
        System.out.print("test0: end\n");
    }

    @Test
    public void test1() {
        System.out.print("test1, print input: beg\n");

        char[] query = new char[] {'b', 'a', 'l', 'a', 'n', 'c', 'e'};
        char[] target = new char[] {'b', 'a', 'p', 'a', 'n', 'c', 'e'};

        int nQuery = query.length;
        int nTarget = target.length;

        Cracking1o5 problem = new Cracking1o5(query, nQuery, target, nTarget);
        problem.printInput();

        assertEquals(problem.target, problem.longer);

        System.out.print("test1, print input: end\n");
    }

    @Test
    public void test2() {
        System.out.print("test2, solve single replacement case: beg\n");

        char[] query = new char[]  {'p', 'a', 'l', 'e'};
        char[] target = new char[] {'b', 'a', 'l', 'e'};

        int nQuery = query.length;
        int nTarget = target.length;

        Cracking1o5 problem = new Cracking1o5(query, nQuery, target, nTarget);
        boolean solution = problem.solve();

        System.out.print(String.format("solution=%b\n", solution));
        assertEquals(solution, true);

        System.out.print("test2, solve single replacement case: end\n");
    }

    @Test
    public void test3() {
        System.out.print("test3, solve single deletion case: beg\n");

        char[] query = new char[]  {'p', 'a', 'l', 'e'};
        char[] target = new char[] {'a', 'l', 'e'};

        int nQuery = query.length;
        int nTarget = target.length;

        Cracking1o5 problem = new Cracking1o5(query, nQuery, target, nTarget);
        boolean solution = problem.solve();

        System.out.print(String.format("solution=%b\n", solution));
        assertEquals(solution, true);

        System.out.print("test3, solve single deletion case: end\n");
    }


    @Test
    public void test4() {
        System.out.print("test4, solve double deletion case: beg\n");

        char[] query = new char[]  {'p', 'a', 'l', 'e'};
        char[] target = new char[] {'l', 'e'};

        int nQuery = query.length;
        int nTarget = target.length;

        Cracking1o5 problem = new Cracking1o5(query, nQuery, target, nTarget);
        boolean solution = problem.solve();

        System.out.print(String.format("solution=%b\n", solution));
        assertEquals(solution, false);

        System.out.print("test4, solve double deletion case: end\n");
    }


    @Test
    public void test5() {
        System.out.print("test5, solve double replacement case: beg\n");

        char[] query = new char[]  {'p', 'a', 'l', 'e'};
        char[] target = new char[] {'b', 'i', 'l', 'e'};

        int nQuery = query.length;
        int nTarget = target.length;

        Cracking1o5 problem = new Cracking1o5(query, nQuery, target, nTarget);
        boolean solution = problem.solve();

        System.out.print(String.format("solution=%b\n", solution));
        assertEquals(solution, false);

        System.out.print("test5, solve double deletion case: end\n");
    }




}
