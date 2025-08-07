import java.util.*;

class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = this.right = null;
    }
}
class BinaryTree{
    // Inorder (L Rt R)

    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    // Preorder (Rt L R)
    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    
    // Postorder (L R Rt)
    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node root = new Node(sc.nextInt());
        root.left = new Node(sc.nextInt());
        root.right = new Node(sc.nextInt());
        root.left.left = new Node(sc.nextInt());
        root.left.right = new Node(sc.nextInt());   
        root.right.left = new Node(sc.nextInt());
        root.right.right = new Node(sc.nextInt());  
        BinaryTree tree = new BinaryTree();
        System.out.print("Inorder: ");
        tree.inOrder(root);
        System.out.print("\nPreorder: ");
        tree.preOrder(root);
        System.out.print("\nPostorder: ");
        tree.postOrder(root);
        sc.close();
    }
}