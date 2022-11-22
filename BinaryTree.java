public class BinaryTree {
    BTNode node = new BTNode(5);
    public static void main(String[] args) {
        
        BinaryTree bin = new BinaryTree();

        bin.createBinaryTree(bin);

        bin.node.deleteNodeFromTree(10);

        bin.node.inOrderTraversal();



    }
    
// calls method to insert node into the tree
    private BinaryTree createBinaryTree(BinaryTree bin) {
        bin.node.insert(8);
        bin.node.insert(3);
        bin.node.insert(1);
        bin.node.insert(6);
        bin.node.insert(7);
        bin.node.insert(10);
        bin.node.insert(14);
        bin.node.insert(4);

        return bin;
    }

// Finds if number entered is part of the tree
    private boolean searchInTree(int key) {
        return node.searchBT(key);
    }
}
