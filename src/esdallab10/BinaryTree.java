package esdallab10;

/**
 * @author Sistemas
 */

public class BinaryTree {
    NodeTree root;

    public BinaryTree() {
        root = null;
    }

    public void preOrder(NodeTree node) {
        if (node == null)
            return;
        visit(node);
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder(NodeTree node) {
        if (node == null)
            return;
        inOrder(node.left);
        visit(node);
        inOrder(node.right);
    }

    public void postOrder(NodeTree node) {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        visit(node);
    }

    public void visit(NodeTree node) {
        System.out.print(node.letra + " ");
    }
}