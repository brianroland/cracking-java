package test.java.com.br.cracking2017;

import main.java.com.br.cracking2017.BinarySearchTree;
import main.java.com.br.cracking2017.Cracking4o6;
import main.java.com.br.cracking2017.NodeForBST;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by brianroland on 7/17/17.
 */
public class Cracking4o6Test {

    @Test
    public void test0() {
        System.out.println("test0, create node: beg");

        NodeForBST node = new NodeForBST(0, "apple");
        System.out.println(String.format("id=%d", node.id));
        System.out.println(String.format("data=%s", node.data));

        System.out.println("test0, create node: end");
    }


    @Test
    public void test1() {
        System.out.println("test1, create small tree: beg");

        NodeForBST node0 = new NodeForBST(0, "apple");
        NodeForBST node1 = new NodeForBST(1, "banana");
        NodeForBST node2 = new NodeForBST(2, "coconut");

        node1.setAsLeftChildOf(node0);
        node2.setAsRightChildOf(node0);

        System.out.println(String.format("id=%d", node0.left.id));
        System.out.println(String.format("data=%s", node0.left.data));

        System.out.println("test1, create small tree: end");
    }

    @Test
    public void test2() throws Exception {
        System.out.println("test2, test min: beg");

        NodeForBST node0 = new NodeForBST(0, "apple");
        NodeForBST node1 = new NodeForBST(1, "banana");
        NodeForBST node2 = new NodeForBST(2, "coconut");
        NodeForBST node3 = new NodeForBST(3, "date");

        node1.setAsLeftChildOf(node0);
        node2.setAsRightChildOf(node0);
        node3.setAsLeftChildOf(node1);

        NodeForBST nodeMin = BinarySearchTree.min(node0);
        System.out.println(String.format("id=%d", nodeMin.id));
        System.out.println(String.format("data=%s", nodeMin.data));

        System.out.println("test2, test min: end");
    }


    @Test
    public void test3() throws Exception {
        System.out.println("test3, test successor: beg");

        NodeForBST node0 = new NodeForBST(0, "apple");
        NodeForBST node1 = new NodeForBST(1, "banana");
        NodeForBST node2 = new NodeForBST(2, "coconut");
        NodeForBST node3 = new NodeForBST(3, "date");
        NodeForBST node4 = new NodeForBST(4, "elderberry");
        NodeForBST node5 = new NodeForBST(5, "fig");
        NodeForBST node6 = new NodeForBST(6, "grape");


        // Level 1
        node1.setAsLeftChildOf(node0);
        node2.setAsRightChildOf(node0);

        // Level 2
        node3.setAsLeftChildOf(node1);
        node4.setAsRightChildOf(node1);

        // Level 3
        node5.setAsLeftChildOf(node4);
        node6.setAsRightChildOf(node4);

        NodeForBST nodeSuccessor = Cracking4o6.solve(node6);
        if (nodeSuccessor != null) {
            System.out.println(String.format("id=%d", nodeSuccessor.id));
            System.out.println(String.format("data=%s", nodeSuccessor.data));
        }

        assert nodeSuccessor.data=="apple";

        System.out.println("test3, test successor: end");
    }

    @Test
    public void test4() throws Exception {
        System.out.println("test4, test successor: beg");

        NodeForBST node0 = new NodeForBST(0, "apple");
        NodeForBST node1 = new NodeForBST(1, "banana");
        NodeForBST node2 = new NodeForBST(2, "coconut");

        // Level 1
        node1.setAsRightChildOf(node0);

        // Level 2
        node2.setAsRightChildOf(node1);

        NodeForBST nodeSuccessor = Cracking4o6.solve(node2);
        assertEquals(nodeSuccessor, null);

        System.out.println("test4, test successor: end");
    }

}
