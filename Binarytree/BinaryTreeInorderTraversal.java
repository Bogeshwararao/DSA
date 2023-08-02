package Binarytree;
import java.util.*;
// BinaryTreeNode class represents a node in the binary tree
// Definition for a binary tree node.

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class TUF {
    static void inOrderTrav(Node curr, ArrayList < Integer > inOrder) {
        if (curr == null)
            return;
    
        inOrderTrav(curr.left, inOrder);
        inOrder.add(curr.data);
        inOrderTrav(curr.right, inOrder);
    }
    static void preOrderTrav(Node curr,ArrayList <Integer> preOrder){
        if(curr==null)
            return;
        preOrder.add(curr.data);
        preOrderTrav(curr.left, preOrder);
        preOrderTrav(curr.right, preOrder);
        
    }
    static void postOrderTrav(Node curr, ArrayList <Integer> postOrder){
        if(curr==null)
            return;
        postOrderTrav(curr.left,postOrder);
        postOrderTrav(curr.right, postOrder);
        postOrder.add(curr.data);
    }




    public static void main(String args[]) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        root.right.right.right = new Node(10);

        // ArrayList < Integer > inOrder = new ArrayList < > ();
        // inOrderTrav(root, inOrder);
        ArrayList <Integer> preOrder = new ArrayList<>();
        preOrderTrav(root,preOrder);


        System.out.println("The inOrder Traversal is : ");
        for (int i = 0; i < preOrder.size(); i++) {
            System.out.print(preOrder.get(i) + " ");
        }
    }
}