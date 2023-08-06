package Binarytree;

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

class MediumBt {
    public boolean isBalanced(Node root) {
        return dfsHeight(root) != -1;
    }

    int dfsHeight(Node root) {
        if (root == null) return 0;

        int leftHeight = dfsHeight(root.left);
        if (leftHeight == -1) return -1;
        int rightHeight = dfsHeight(root.right);
        if (rightHeight == -1) return -1;

        if (Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String args[]) {
        MediumBt bt = new MediumBt(); // Create an instance of MediumBt
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.left.right.left = new Node(8);
        // root.right.left = new Node(6);
        // root.right.right = new Node(7);
        // root.right.right.left = new Node(9);
        // root.right.right.right = new Node(10);

        boolean balanced = bt.isBalanced(root); // Call the isBalanced method using the instance
        System.out.println("Is the binary tree balanced? " + balanced);
    }
}
