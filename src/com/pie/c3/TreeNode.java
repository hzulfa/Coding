package com.pie.c3;

/**
 * Created by ummehunn on 11/20/2016.
 */
public class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public TreeNode rotateRight(){
        TreeNode newRoot = left;
        left = newRoot.getRight();
        newRoot.right = this;
        return newRoot;
    }
}
