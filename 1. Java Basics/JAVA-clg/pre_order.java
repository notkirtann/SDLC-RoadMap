// public class Node {
//     int data;
//     Node left, right;

//     public Node(int item) {
//         data = item;
//         left = right = null;
//     }
// }

class pre_order{
    Node root; 
    public pre_order() {
        root = null;
    }

    public void preOrder(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }



    public static void main(String[] args) {
        pre_order tree = new pre_order();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is: ");
        tree.preOrder(tree.root);
    }   
}