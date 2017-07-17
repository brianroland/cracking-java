package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking16o17;
import org.junit.Test;

/**
 * Created by brianroland on 7/17/17.
 */
public class Cracking16o17Test {

    @Test
    public void test0() {
        System.out.println("test0: beg");
        System.out.println("test0: end");
    }


    @Test
    public void test1() throws Exception {
        System.out.println("test1: beg");

        int[] a = {0};
        int m = 1;

        int solution = Cracking16o17.solve(a,m);

        System.out.println(String.format("solution=%d",solution));


        System.out.println("test1: end");
    }


    @Test
    public void test2() throws Exception {
        System.out.println("test2: beg");

        int[] a = {-1};
        int m = 1;

        int solution = Cracking16o17.solve(a,m);

        System.out.println(String.format("solution=%d",solution));

        System.out.println("test2: end");
    }


    @Test
    public void test3() throws Exception {
        System.out.println("test3: beg");

        int[] a = {-3, -2, -1};
        int m = 3;

        int solution = Cracking16o17.solve(a,m);

        System.out.println(String.format("solution=%d",solution));

        System.out.println("test3: end");
    }

    @Test
    public void test4() throws Exception {
        System.out.println("test4: beg");

        int[] a = {-3, -2, -1, 0, -1, -2, 4};
        int m = 7;

        int solution = Cracking16o17.solve(a,m);

        System.out.println(String.format("solution=%d",solution));

        System.out.println("test4: end");
    }


    @Test
    public void test5() throws Exception {
        System.out.println("test5: beg");

        int[] a = {-3, -2, -1, 4, -1, -2, 0};
        int m = 7;

        int solution = Cracking16o17.solve(a,m);

        System.out.println(String.format("solution=%d",solution));

        System.out.println("test5: end");
    }


    @Test
    public void test6() throws Exception {
        System.out.println("test6: beg");

        int[] a = {-3, -2, -1, 4, -1, -2, 10};
        int m = 7;

        int solution = Cracking16o17.solve(a,m);

        System.out.println(String.format("solution=%d",solution));

        System.out.println("test6: end");
    }



}
