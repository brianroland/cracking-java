package main.java.com.br.cracking2017;

/**
 * Created by brianroland on 7/17/17.
 *
 * build the collection of functions that constitute the interface to a Binary Search Tree
 *
 *
 */
public class BinarySearchTree {

    public static boolean isLeftChild(NodeForBST node) {

        assert node!=null;
        if (node.parent !=null) {
            if (node.parent.left==node) {
                return true;
            }
        }
        return false;
    }

    public static boolean isRightChild(NodeForBST node) {

        assert node!=null;
        if (node.parent!=null) {
            if (node.parent.right==node) {
                return true;
            }
        }
        return false;
    }

    public static NodeForBST min(NodeForBST root) throws Exception {

        assert root!=null;
        NodeForBST curr = root;
        while (curr.left!=null) {
            curr = curr.left;
        }
        return curr;
    }

    public static NodeForBST firstRightParent(NodeForBST node) throws Exception {

        assert isRightChild(node);
        NodeForBST curr = node;

        while (curr.parent != null) {
            // there is a parent
            if (isRightChild(curr)) {
                curr = curr.parent;
            } else if (isLeftChild(curr)) {
                return curr.parent;
            }
        }

        return null;    //never found a successor
    }

    public static NodeForBST successor(NodeForBST node) throws Exception {
        if ( isLeftChild(node)){

            if (node.right!=null) {
                return min(node.right);
            } else {
                return node.parent;
            }

        } else if (isRightChild(node)) {

            if (node.right!=null) {
                return min(node.right);
            } else {
                return firstRightParent(node);
            }
        }

        //no parent
        return node.right;
    }
}
