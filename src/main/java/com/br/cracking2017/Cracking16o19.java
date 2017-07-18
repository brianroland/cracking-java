package main.java.com.br.cracking2017;

import java.util.*;

/**
 * Created by brianroland on 7/18/17.
 */
public class Cracking16o19 {

    public ArrayList<NodeForUndirectedGraph> nodeList;                       // consider this the graph
    public HashMap<String, NodeForUndirectedGraph> idToNodeMap;              // consider this a helper data structure

    public void createGraph(int[][] input, int nRow, int nCol) {

        nodeList = new ArrayList<NodeForUndirectedGraph>();
        idToNodeMap = new HashMap<String, NodeForUndirectedGraph>();

        //create node objects
        for (int iRow=0; iRow < nRow; ++iRow) {
            for (int iCol=0; iCol < nCol; ++iCol){

                if (input[iRow][iCol]==0) {

                    String id = makeId(iRow, iCol);
                    NodeForUndirectedGraph x = new  NodeForUndirectedGraph(id);
                    nodeList.add(x);
                    idToNodeMap.put(id,x);
                }
            }
        }

        //create edges
        for (int iRow=0; iRow < nRow; ++iRow) {
            for (int iCol=0; iCol < nCol; ++iCol){

                if (input[iRow][iCol]==0) {

                    String id = makeId(iRow, iCol);
                    String idLeft = makeIdLeft(id);
                    String idUp = makeIdUp(id);
                    String idLeftUp = makeIdLeftUp(id);
                    String idLeftDown = makeIdLeftDown(id);

                    if ( idToNodeMap.containsKey(idLeft)) {
                        NodeForUndirectedGraph.connect(idToNodeMap.get(id), idToNodeMap.get(idLeft)   );
                    }
                    if ( idToNodeMap.containsKey(idUp)) {
                        NodeForUndirectedGraph.connect(idToNodeMap.get(id), idToNodeMap.get(idUp)   );
                    }
                    if ( idToNodeMap.containsKey(idLeftUp)) {
                        NodeForUndirectedGraph.connect(idToNodeMap.get(id), idToNodeMap.get(idLeftUp)   );
                    }
                    if ( idToNodeMap.containsKey(idLeftDown)) {
                        NodeForUndirectedGraph.connect(idToNodeMap.get(id), idToNodeMap.get(idLeftDown)   );
                    }

                }
            }
        }


    }

    public void bfs() {

        int nNodes = nodeList.size();
        HashSet<NodeForUndirectedGraph> putInSomeQ = new HashSet<NodeForUndirectedGraph>();
        ArrayList<Integer> clusterSizes = new ArrayList<Integer>();

        for (int iNodeToInitSearch=0; iNodeToInitSearch < nNodes; ++iNodeToInitSearch) {

            if (putInSomeQ.contains(nodeList.get(iNodeToInitSearch))) {continue;}

            // Put this node in the queue
            int clusterSize = 0;
            LinkedList<NodeForUndirectedGraph> q = new LinkedList<NodeForUndirectedGraph>();
            q.add(nodeList.get(iNodeToInitSearch));
            putInSomeQ.add(nodeList.get(iNodeToInitSearch));

            while (!q.isEmpty()) {

                NodeForUndirectedGraph x = q.removeFirst();
                clusterSize += 1;

                for (int iNbr=0; iNbr < x.nbrs.size(); ++iNbr) {
                    NodeForUndirectedGraph u = x.nbrs.get(iNbr);

                    if (!putInSomeQ.contains(u) ) {
                        q.add(u);
                        putInSomeQ.add(u);
                    }
                }
            }
            clusterSizes.add(clusterSize);
        }

        System.out.println(clusterSizes);
    }

    private String makeId(int iRow, int iCol){
        return String.format("%d,%d", iRow, iCol);
    }

    private String makeIdLeft(String id) {
        Integer iRow = new Integer(id.split(",")[0]);
        Integer iCol = new Integer(id.split(",")[1]);
        return String.format("%d,%d",iRow-1,iCol);
    }

    private String makeIdUp(String id) {
        Integer iRow = new Integer(id.split(",")[0]);
        Integer iCol = new Integer(id.split(",")[1]);
        return String.format("%d,%d",iRow,iCol-1);
    }

    private String makeIdLeftUp(String id) {
        Integer iRow = new Integer(id.split(",")[0]);
        Integer iCol = new Integer(id.split(",")[1]);
        return String.format("%d,%d",iRow-1,iCol-1);
    }

    private String makeIdLeftDown(String id) {
        Integer iRow = new Integer(id.split(",")[0]);
        Integer iCol = new Integer(id.split(",")[1]);
        return String.format("%d,%d",iRow-1,iCol+1);
    }

}
