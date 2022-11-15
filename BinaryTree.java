public class BinaryTree {
    BTNode node = new BTNode(5);
    public static void main(String[] args) {
        
        BinaryTree bin = new BinaryTree();

        bin.createBinaryTree(bin);

        System.out.print(bin.node.searchBT(4));

        bin.node.inOrderTraversal();
        // System.out.print("In order traversing the tree \n" + bin.node.inOrderTraversal());
        
        // bin.node.printTree();

        // bin.node.searchBT(6);
    }

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


    private boolean searchInTree(int key) {
        return node.searchBT(key);
    }
}
