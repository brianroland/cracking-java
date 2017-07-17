package main.java.com.br.cracking2017;

/**
 * Created by brianroland on 7/17/17.
 */
public class NodeForBST {

    public int id;
    public String data;

    public NodeForBST parent;
    public NodeForBST left;
    public NodeForBST right;

    public NodeForBST(int id_, String data_) {
        id = id_;
        data = data_;
    }

    public void setAsLeftChildOf(NodeForBST parent_) {
        parent_.left = this;
        this.parent = parent_;
    }

    public void setAsRightChildOf(NodeForBST parent_) {
        parent_.right = this;
        this.parent = parent_;
    }

}
