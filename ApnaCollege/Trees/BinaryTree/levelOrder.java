
import java.util.*;
public class levelOrder {
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
        public Node buildtree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }
        public void inorder(Node root){
            if(root == null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
            // System.out.println();
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
        public int height(Node root){
            if(root == null){
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);
            return 1 + Math.max(lh, rh);
        }
        public int count(Node root){
            if(root == null){
                return 0;
            }
            int lh = count(root.left);
            int rh = count(root.right);
            return 1 + lh + rh;
        }
        public int sum(Node root){
            if(root == null){
                return 0;
            }
            int ls = sum(root.left);
            int rs = sum(root.right);
            return root.data + ls + rs;
        }
        public int diameter2(Node root){
            if(root == null){
                return 0;
            }
            int leftdia = diameter2(root.left);
            int lefthei = height(root.left);
            int rightdia = diameter2(root.right);
            int righthei = height(root.right);

            int selfdia = lefthei + righthei + 1;
            return Math.max(selfdia, Math.max(leftdia, rightdia));
        }
        static class Info{
            int height;
            int diameter;
            Info(int height, int diameter){
                this.height = height;
                this.diameter = diameter;
            }
        }
        public Info diameter(Node root){
            if(root == null){
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diameter, rightInfo.diameter), leftInfo.height + rightInfo.height + 1);
            int heigh = Math.max(leftInfo.height, rightInfo.height)+1;
            return new Info(heigh, diam);
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,9,-1,-1,-1,5,-1,6,-1,7,-1,-1,3,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        // tree.inorder(root);
        // tree.levelorder(root);
        // System.out.println(tree.height(root));
        // System.out.println(tree.count(root));
        // System.out.println(tree.sum(root));
        // System.out.println(tree.diameter(root));
        System.out.println(tree.diameter(root).diameter);
    }
}
