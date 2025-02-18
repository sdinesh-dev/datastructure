package org.dinesh.datastructures.others.tree;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
    }
}
public class BinaryTree {
    Node root;

    public void insert(int data){
        root = insertRecursive(root, data);
    }

    private Node insertRecursive(Node root, int data){
        if(root == null){
            root = new Node(data);
        } else if(data<root.data){
            root.left = insertRecursive(root.left, data);
        } else if(data > root.data){
            root.right = insertRecursive(root.right, data);
        }
        return root;
    }

    public void inOrder(){
        inorderRecursive(root);
    }

    private void inorderRecursive(Node root){
        if(root != null){
            inorderRecursive(root.left);
            System.out.print(root.data+" ");
            inorderRecursive(root.right);
        }
    }

    public void preOrder(){
        preOrderRecursive(root);
    }

    private void preOrderRecursive(Node root) {
        if(root != null){
            System.out.print(root.data+" ");
            preOrderRecursive(root.left);
            preOrderRecursive(root.right);
        }
    }

    public void postOrder(){
        postOrderRecursive(root);
    }

    private void postOrderRecursive(Node root) {
        if(root != null){
            postOrderRecursive(root.left);
            postOrderRecursive(root.right);
            System.out.print(root.data+" ");
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.insert(15);
        tree.insert(2);
        tree.insert(5);
        tree.inOrder();
        System.out.println();
        tree.preOrder();
        System.out.println();
        tree.postOrder();
    }
}
