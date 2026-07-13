
import java.util.*;

public class subTree {
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
            // idx = -1;
            return newnode;
        }
        public void levelorder(Node root){
            if(root == null){
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while(!q.isEmpty()){
                Node currnode = q.remove();
                System.out.print(currnode.data+" ");
                if(currnode.left != null){
                    q.add(currnode.left);
                }
                if(currnode.right != null){
                    q.add(currnode.right);
                }
            }
            System.out.println();
        }
        public boolean isIdentical(Node root, Node subroot){
            if(root == null && subroot == null){
                return true;
            }
            else if(root == null || subroot == null){
                return false;
            }
            if(root.data != subroot.data){
                return false;
            }
            return (!isIdentical(root.left, subroot.left)) && (!isIdentical(root.right, subroot.right));
        }
        public boolean isSubtree(Node root, Node subroot){
            if(root == null){
                return false;
            }
            if(root.data == subroot.data){
                if(isIdentical(root, subroot)){
                    return true;
                }
            }
            return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
        }
        static class Info{
            Node node;
            int hd;
            Info(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        public void topview(Node root){
            if(root == null){
                return;
            }
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            int min = 0, max = 0;

            q.add(new Info(root, 0));
            q.add(null);

            while(!q.isEmpty()){
                Info curr = q.remove();

                if(curr == null){
                    if(q.isEmpty()){
                        break;
                    }
                    else{
                        q.add(null);
                    }
                }
                else{
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }

                if(curr.node.left != null){
                    q.add(new Info(curr.node.left, curr.hd-1));
                    min = Math.min(min, curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Info(curr.node.right, curr.hd+1));
                    max = Math.max(max, curr.hd + 1);
                }
            }
            }
            for(int i = min ; i<= max; i++){
                System.out.print(map.get(i).data+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,6,-1,-1,7,-1,-1};
        // int[] subnodes = {2,4,-1,-1,5,-1,-1};
        BinaryTree tree = new BinaryTree();
        // BinaryTree subtree = new BinaryTree();

        Node treeroot = tree.buildtree(nodes);
        // BinaryTree.idx = -1;
        // Node subtreeroot = subtree.buildtree(subnodes);

        tree.levelorder(treeroot);
        
        // tree.levelorder(subtreeroot);
        // System.out.println(tree.isSubtree(treeroot, subtreeroot));
        tree.topview(treeroot);
       
    }
}
