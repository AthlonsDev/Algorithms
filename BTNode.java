    /**
     * Author: Andrea Sanna u1612023
     */

class BTNode {

    int data;
    BTNode left, right;
    BTNode root;
    private int key;

    public BTNode(int key) {
        data = key;
        left = right = null;
    }

    private BTNode insertNode(BTNode root, int key) {

        if(root == null) {
            root = new BTNode(key);
            return root;
        }

        if(key < root.data) {
            root.left = insertNode(root.left, key);
        }
        else if(key > root.data) {
            root.right = insertNode(root.right, key);
        }     
        else {
            // the value is already in the tree
            return root;
        }

        return root;
    }

    public void insert(int key) {
        root = insertNode(root, key);
        // System.out.print(key + " -> ");
    }

    private boolean searchTree(BTNode root, int key) {
        if(root == null) {
            return false;
        }

        if(key == root.data) {
            return true;
        }

        return key < root.data ? searchTree(root.left, key)
        : searchTree(root.right, key);


    }

    public boolean searchBT(int key) {
        return searchTree(root, key);

    }

    private void InOrder(BTNode root) {
        if (root == null)
            return;

        InOrder(root.left);
        System.out.print(" -> " + root.data);
        InOrder(root.right);

    }
    
    public void inOrderTraversal() {
        InOrder(root);
    }

    private void preOrder(BTNode root) {
        if (root == null)  
        return;

        System.out.print(" -> " + root.data);  
        preOrder(root.left);  
        preOrder(root.right);  
       
    }

    private void postOrder(BTNode root) {
        if (root == null)  
        return;

        postOrder(root.left);       
        postOrder(root.right);  
        System.out.print(" -> " + root.data); 
       
    }

    public void postOrderTraversal() {
        postOrder(root);
    }

    public void preOrderTraversal() {
        preOrder(root);
    }

    private int MinValue(BTNode root) {
        while(root.left != null) {
            root = root.left;
        }
        System.out.print(root.data);
        return root.data;
    }

    private BTNode DeleteNode(BTNode current, int key) {
        if(current == null) {
            return null;
        }

        if(key>current.data) {
            current.right = DeleteNode(current.right, key);
            return current;
        }

        if(key < current.data) {
            current.left = DeleteNode(current.left, key);
            return current;
        }
        // no children
        if(current.left == null && current.right == null) {
            return null;
        }
                // one child
        if (current.right == null) {
            return current.left;
        }
        if (current.left == null) {
            return current.right;
        }
        if(current.left != null && current.right != null) {
            current.key = MinValue(root.right);
            current.right = DeleteNode(current.right, current.key);

        }
       
        return current;
    }

    public void deleteNodeFromTree(int key) {
        DeleteNode(root, key);
    }
}

