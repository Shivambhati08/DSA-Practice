

import java.util.LinkedList;
import java.util.Queue;

public class practicequestion {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree{
        static int idx = -1;
        public Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildTree(nodes);
            newnode.right = buildTree(nodes);

            return newnode;
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
        public boolean univalued(Node root){
            if(root == null){
                return true;
            }
            if(root.left != null && root.data != root.left.data){
                return false;
            }
            if(root.right != null && root.data != root.right.data){
                return false;
            }
            return univalued(root.left) && univalued(root.right);
        }
        public void invertbinarytree(Node root){
            if(root == null){
                return;
            }
            if(root.left == null && root.right == null){
                return;
            }
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;
            invertbinarytree(root.left);
            invertbinarytree(root.right);
        }
        public Node deleteleafwithvalue(Node root, int val){
            if(root == null){
                return null;
            }
            root.left = deleteleafwithvalue(root.left, val);
            root.right = deleteleafwithvalue(root.right, val);
            if(root.left == null && root.right == null && root.data == val){
                root = null;
                return root;
            }
            return root;
        }
        public void findDuplicatesubtree(Node root){
            if(root == null){
                return;
            }
            
        }
    }
    public static void main(String[] args) {
        // int[] nodes = {2, 2, 5, -1,-1, 2, -1, -1, 2, -1, -1};
        // int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        int[] nodes = {1,3,3,-1,-1,2,-1,-1, 3,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        tree.levelorder(root);
        System.out.println();
        // System.out.println(tree.univalued(root));
        // tree.invertbinarytree(root);
        tree.deleteleafwithvalue(root, 3);
        tree.levelorder(root);

        
    }
    
}
