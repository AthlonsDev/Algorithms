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
        if (root == null) {
            return;
        }

        InOrder(root.left);
        System.out.print(root.data + " -> ");
        InOrder(root.right);
        // System.out.print(root.left + " -> ");

    }
    
    public void inOrderTraversal() {
        InOrder(root);
        // printTree(root);
    }

    public String printTree() {
        if(root == null) {
            return "";
        }
        String str = "";
        inOrderTraversal();
        return str;

    }
    
}

