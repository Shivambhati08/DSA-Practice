
import java.util.*;

public class BinarySearchTreeOP {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
        }
    }
    static class BST{
        public Node buildTree(Node root, int val){
            if(root == null){
                root = new Node(val);
                return root;
            }
            if(root.data < val){
                root.right =  buildTree(root.right, val);
            }
            if(root.data > val){
                root.left = buildTree(root.left, val);
            }
            return root;
        }
        public void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node curr = q.remove();
                System.out.print(curr.data+" ");
                if(curr.left != null){
                    q.add(curr.left);
                }
                if(curr.right != null){
                    q.add(curr.right);
                }
            }
        }
        public void rootToLeaves(Node root, ArrayList<Integer> list){
            if(root == null){
                return;
            }
            list.add(root.data);
            
            if(root.left == null && root.right == null){
                System.out.println(list);
            }
            // else{
                rootToLeaves(root.left, list);
                rootToLeaves(root.right, list);
            // }
            list.remove(list.size()-1);
        }
    }
        public static void main(String[] args) {
            BST tree = new BST();
            Node root = null;
            int[] values = {8, 5, 6, 3, 10, 11, 14};
            for (int i = 0; i < values.length; i++) {
                root = tree.buildTree(root, values[i]);
            }
            // tree.levelorder(root);
            tree.rootToLeaves(root, new ArrayList<>());
    }
}
