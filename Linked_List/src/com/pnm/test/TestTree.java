package com.pnm.test;

public class TestTree {
    TreeNode root;

    TestTree(){
        this.root=null;
    }
    public static void main(String[] args) {

        TestTree treeObj = new TestTree();

        treeObj.root = new TreeNode(1);
        treeObj.root.left = new TreeNode(2);
        treeObj.root.right = new TreeNode(3);

        treeObj.root.left.left = new TreeNode(4);
        treeObj.root.left.right = new TreeNode(5);

        treeObj.preOrder(treeObj.root);
    }

    public void preOrder(TreeNode node){
        if(node == null)
            return;

        System.out.print(node.root+" ");
        preOrder(node.left);
        preOrder(node.right);
    }
}

class TreeNode {
    int root;
    TreeNode left,right;

    public TreeNode(int data) {
        this.root = data;
        this.left=null;
        this.right=null;
    }
}
