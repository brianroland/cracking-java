package main.java.com.br.cracking2017;

import java.util.ArrayList;

/**
 * Created by brianroland on 7/18/17.
 */
public class NodeForUndirectedGraph {

    public String id;
    public ArrayList<NodeForUndirectedGraph> nbrs;

    public NodeForUndirectedGraph(String id_) {
        id = id_;
        nbrs = new ArrayList<NodeForUndirectedGraph>();
    }

    public static void connect(NodeForUndirectedGraph node0, NodeForUndirectedGraph node1) {

        // assume code will not add the same node twice
        node0.nbrs.add(node1);
        node1.nbrs.add(node0);
    }
}
