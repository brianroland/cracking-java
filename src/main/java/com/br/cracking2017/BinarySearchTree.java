package main.java.com.br.cracking2017;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by brianroland on 7/17/17.
 *
 * build the collection of functions that constitute the interface to a Binary Search Tree
 *
 *
 *  implemented: min, successor
 *
 *
 */

public class BinarySearchTree {

    public static NodeForBST max(NodeForBST root) throws Exception {
        throw new NotImplementedException();
    }

    public static NodeForBST predecessor(NodeForBST node) throws Exception {
        throw new NotImplementedException();
    }

    public static NodeForBST search(NodeForBST root, NodeForBST query) throws Exception {
        throw new NotImplementedException();
    }

    public static NodeForBST insert(NodeForBST root, NodeForBST node) throws Exception {
        throw new NotImplementedException();
    }

    public static NodeForBST delete(NodeForBST root, NodeForBST target) throws Exception {
        throw new NotImplementedException();
    }

    public static NodeForBST min(NodeForBST root) throws Exception {

        assert root!=null;
        NodeForBST curr = root;
        while (curr.left!=null) {
            curr = curr.left;
        }
        return curr;
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
}
