package com.pnm.tree.binarytree;

public class CustomBinaryTree {
    TreeNode root;

    CustomBinaryTree(){
        this.root=null;
    }
    public static void main(String[] args) {

        CustomBinaryTree treeObj = new CustomBinaryTree();

        treeObj.root = new TreeNode(1);
        treeObj.root.left = new TreeNode(2);
        treeObj.root.right = new TreeNode(3);

        treeObj.root.left.left = new TreeNode(4);
        treeObj.root.left.right = new TreeNode(5);

        System.out.println("\nPREORDER TRAVERSAL");
        treeObj.preOrderTraversal(treeObj.root);

        System.out.println("\nINORDER TRAVERSAL");
        treeObj.inOrderTraversal(treeObj.root);

        System.out.println("\nPOSTORDER TRAVERSAL");
        treeObj.postOrderTraversal(treeObj.root);
    }

    public void preOrderTraversal(TreeNode node){
        if(node == null)
            return;

        System.out.print(node.root+" ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(TreeNode node){
        if(node == null)
            return;
        inOrderTraversal(node.left);
        System.out.print(node.root+" ");
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(TreeNode node){
        if(node == null)
            return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.print(node.root+" ");
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
