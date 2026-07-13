import java.util.LinkedList;
import java.util.Queue;

public class AVLTree {
    static class Node{
        int data;
        int height;
        Node right;
        Node left;
        Node(int data){
            this.data = data;
            this.height = 1;
        }
    }
    static class AVLT{
        public int height(Node root){
            if(root == null){
                return 0;
            }
            return root.height;
        }
        public int getBalance(Node root){
            if(root == null){
                    return 0;
            }
            return height(root.left) - height(root.right);
        }
        public Node leftRotate(Node x){
            Node y = x.right;
            Node t2 = y.left;

            y.left = x;
            x.right = t2;

            x.height = Math.max(height(x.left), height(x.right) + 1);
            y.height = Math.max(height(y.left), height(y.right) + 1);

            return y;
        }
        public Node rightRotate(Node y){
            Node x = y.left;
            Node t2 = x.right;

            x.right = y;
            y.left = t2;

            x.height = Math.max(height(x.left), height(x.right) + 1);
            y.height = Math.max(height(y.left) , height(y.right) + 1);

            return x;
        }
        public Node buildAVLT(Node root, int key){
            if(root == null){
                return new Node(key);
            }
            if(key < root.data){
                root.left = buildAVLT(root.left, key);
            }
            else if(key > root.data){
                root.right = buildAVLT(root.right, key);
            }
            else {
                return root;
            }

            root.height = 1 + Math.max(height(root.left), height(root.right));

            int bf = getBalance(root);

            //  LL Case
            if(bf > 1 && key < root.left.data){
                return rightRotate(root);
            }

            // RR Case
            if(bf < -1 && key > root.right.data){
                return leftRotate(root);
            }

            // LR Case
            if(bf > 1 && key > root.left.data){
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }

            // RL Case
            if(bf < -1 && key < root.right.data){
                root.right = rightRotate(root.right);
                return leftRotate(root);
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
    }
    public static void main(String[] args) {
        int[] value = {10, 25, 50, 20, 30, 40};
        AVLT tree = new AVLT();
        Node root = null;
        for (int i = 0; i < value.length; i++) {
            root = tree.buildAVLT(root, value[i]);
        }
        tree.levelorder(root);
    }
}
