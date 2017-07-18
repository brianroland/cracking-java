package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking16o19;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brianroland on 7/18/17.
 */
public class Cracking16o19Test {

    @Test
    public void test0() {
        System.out.println("test0: beg");
        System.out.println("test0: end");
    }

    @Test
    public void test1() {
        System.out.println("test1: beg");

        int[][] input = new int[4][4];

        input[0][0] = 0;
        input[0][1] = 2;
        input[0][2] = 1;
        input[0][3] = 0;

        input[1][0] = 0;
        input[1][1] = 1;
        input[1][2] = 0;
        input[1][3] = 1;

        input[2][0] = 1;
        input[2][1] = 1;
        input[2][2] = 0;
        input[2][3] = 1;

        input[3][0] = 0;
        input[3][1] = 1;
        input[3][2] = 0;
        input[3][3] = 1;

        // print input array
        for (int iRow=0; iRow<4; ++iRow) {

            System.out.print(String.format("%d",input[iRow][0]));
            for (int iCol=1; iCol<4; ++iCol) {
                System.out.print(String.format(",%d",input[iRow][iCol]));
            }
            System.out.print('\n');
        }

        System.out.println("test1: end");
    }

    @Test
    public void test2() {
        System.out.println("test2, is graph correctly made: beg");

        int[][] input = new int[4][4];

        input[0][0] = 0;
        input[0][1] = 2;
        input[0][2] = 1;
        input[0][3] = 0;

        input[1][0] = 0;
        input[1][1] = 1;
        input[1][2] = 0;
        input[1][3] = 1;

        input[2][0] = 1;
        input[2][1] = 1;
        input[2][2] = 0;
        input[2][3] = 1;

        input[3][0] = 0;
        input[3][1] = 1;
        input[3][2] = 0;
        input[3][3] = 1;

        Cracking16o19 problem = new Cracking16o19();
        problem.createGraph(input, 4, 4);

        assertEquals(problem.idToNodeMap.containsKey("0,0"),true);

        System.out.println("test2, is graph correctly made: end");
    }

    @Test
    public void test3() {
        System.out.println("test3, compute cluster sizes with bfs: beg");

        int[][] input = new int[4][4];

        input[0][0] = 0;
        input[0][1] = 2;
        input[0][2] = 1;
        input[0][3] = 0;

        input[1][0] = 0;
        input[1][1] = 1;
        input[1][2] = 0;
        input[1][3] = 1;

        input[2][0] = 1;
        input[2][1] = 1;
        input[2][2] = 0;
        input[2][3] = 1;

        input[3][0] = 0;
        input[3][1] = 1;
        input[3][2] = 0;
        input[3][3] = 1;

        Cracking16o19 problem = new Cracking16o19();
        problem.createGraph(input, 4, 4);

        problem.bfs();

        System.out.println("test3, compute cluster sizes with bfs: end");
    }


}
