
import java.awt.List;
import java.util.*;

public class rootToLeaf {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BST {

        public Node buildtree(Node root, int data) {
            if (root == null) {
                root = new Node(data);
                return root;
            }
            if (root.data < data) {
                root.right = buildtree(root.right, data);
            }
            if (root.data > data) {
                root.left = buildtree(root.left, data);
            }
            return root;
        }

        public void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                System.out.print(curr.data + " ");
                if (curr.left != null) {
                    q.add(curr.left);
                }
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        public void findroot(Node root, ArrayList<Integer> list){
            if(root == null){
                return;
            }
            list.add(root.data);
            if(root.left == null && root.right == null){
                System.out.println(list);
            }
            findroot(root.left, list);
            findroot(root.right, list);
            list.remove(list.size()-1);
        }
        public boolean isValidBST(Node root, Node min , Node max){
            if(root == null){
                return true;
            }
            if(min != null && root.data <= min.data){
                return false;
            }
            else if(max != null && root.data >= max.data){
                return false;
            }
            return isValidBST(root.left, min, root) && isValidBST(root.right, root, max);
        }
        public void mirrotBST(Node root){
            if(root == null){
                return;
            }
            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            mirrotBST(root.left);
            mirrotBST(root.right);
        }
        public Node balanceBST(int[] arr, int start, int end){
            if(start > end){
                return null;
            }
            int mid = start + (end - start)/2;
            Node root = new Node(arr[mid]);
            root.left = balanceBST(arr, start, mid-1);
            root.right = balanceBST(arr, mid + 1, end);
            
            return root;
        }
        public void inOrder(Node root, ArrayList<Integer> list){
            if(root == null){
                return;
            }
            inOrder(root.left, list);
            list.add(root.data);
            inOrder(root.right, list);
        }
        public Node balance(ArrayList<Integer> list, int start, int end){
            if(start > end){
                return null;
            }
            int mid = start + (end - start)/2;
            Node root = new Node(list.get(mid));
            root.left = balance(list, start, mid - 1);
            root.right = balance(list, mid + 1, end);
            return root;
        }
        public Node convertToBalanceBST(Node root){
            ArrayList<Integer> list = new ArrayList<>();
            inOrder(root, list);

            return balance(list, 0, list.size() - 1);
        }
    }


    public static void main(String[] args) {
        int[] values = {8, 6, 5, 3, 10, 11, 12};
        // int[] values = {3,  5, 6, 8, 10, 11, 12};
        BST tree = new BST();
        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = tree.buildtree(root, values[i]);
        }
        // root = tree.balanceBST(values, 0, values.length-1);
        tree.levelOrder(root);
        // tree.InOrder(root);
        System.out.println();
        root = tree.convertToBalanceBST(root);
        tree.levelOrder(root);
        System.out.println();
        // tree.balanceBST((), 0, list.size()-1);
        // tree.findroot(root, new ArrayList<Integer>());
        // System.out.println(tree.isValidBST(root, null, null));
        // tree.mirrotBST(root);
        // tree.levelOrder(root);
        // System.out.println();

    }
}
