package esdallab10;

/**
 * @author Sistemas
 */

public class NodeTree {
    char letra;
    NodeTree left;
    NodeTree right;
    
    public NodeTree(char item){
        letra = item;
        left = right = null;
    }
}