package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.Cracking16o25;
import main.java.com.br.cracking2017.LruComparator;
import main.java.com.br.cracking2017.LruElement;
import org.junit.Test;

import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

/**
 * Created by brianroland on 7/19/17.
 *
 * assume input is a sequence of distinct keys
 *
 */
public class Cracking16o25Test {

    @Test
    public void test0() {
        System.out.println("test0: beg");
        System.out.println("test0: end");
    }

    @Test
    public void test1() {
        System.out.println("test1, test priorityQueue adding, comparator, and remove: beg");

        int capacity = 11;

        PriorityQueue<LruElement> q = new PriorityQueue<LruElement>(capacity, new LruComparator());
        q.add(new LruElement("first", 1));
        System.out.println(String.format("the key for the lowest priority element = %s ",q.peek().key));

        q.add(new LruElement("second", 2));
        q.add(new LruElement("third", 3));
        System.out.println(String.format("the key for the lowest priority element = %s ",q.peek().key));

        q.add(new LruElement("fourth", -1));
        System.out.println(String.format("the key for the lowest priority element = %s ",q.peek().key));

        q.remove(new LruElement("fourth", 15));
        System.out.println(String.format("the key for the lowest priority element = %s ",q.peek().key));

        System.out.println("test1, test priorityQueue: end");
    }

    @Test
    public void test2() {
        System.out.println("test2, test capacity: beg");

        int maxElements = 3;

        Cracking16o25 problem = new Cracking16o25(maxElements);

        problem.put("key0", "value0");
        problem.put("key1", "value1");
        problem.get("key0");
        problem.get("key1");
        problem.get("key1");

        problem.put("key2", "value2");


        assertEquals(problem.get("key0"), null);       //assert that key0 has been evicted


        System.out.println("test2: end");
    }
}
