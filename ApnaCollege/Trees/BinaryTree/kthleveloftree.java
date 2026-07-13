import java.util.*;

public class kthleveloftree {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class binarytree {

        static int idx = -1;

        public Node buildtree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newnode = new Node(nodes[idx]);
            newnode.left = buildtree(nodes);
            newnode.right = buildtree(nodes);

            return newnode;
        }

    //     public void levelorder(Node root, int k) {
    //         if (root == null) {
    //             return;
    //         }
    //         Queue<Node> q = new LinkedList<>();
    //         q.add(root);
    //         int level = 1;

    //         while (!q.isEmpty()) {
    //             int size = q.size();
    //             for (int i = 0; i < size; i++) {
    //                 Node curr = q.remove();
    //                 if (level == k) {
    //                     System.out.print(curr.data + " ");
    //                 }
    //                 if (curr.left != null) {
    //                     q.add(curr.left);
    //                 }
    //                 if (curr.right != null) {
    //                     q.add(curr.right);
    //                 }
    //             }
    //             if (level == k) {
    //                 break;
    //             }
    //             level++;

    //         }
    //     }
    public void kthlevel(Node root, int level, int k){
        if(root == null){
            return;
        }
        if(level == k){
            System.out.print(root.data+" ");
        }
        kthlevel(root.left, level+1, k);
        kthlevel(root.right, level+1, k);
    }
    // public boolean getPath(Node root, int n, ArrayList<Node> path){
    //     if(root == null){
    //         return false;
    //     }
    //     path.add(root);
    //     if(root.data == n){
    //         return true;
    //     }
    //     boolean foundleft = getPath(root.left, n, path);
    //     boolean foundright = getPath(root.right, n, path);

    //     if(foundleft || foundright){
    //         return true;
    //     }
    //     path.remove(path.size()-1);
    //     return false;
    // }
    // public Node lca(Node root, int n1, int n2){
    //     ArrayList<Node> path1 = new ArrayList<>();
    //     ArrayList<Node> path2 = new ArrayList<>();

    //     getPath(root, n1, path1);
    //     getPath(root, n2, path2);

    //     // last common ancestor
    //     int i = 0;
    //     for(; i < path1.size() && i < path2.size(); i++){
    //         if(path1.get(i) != path2.get(i)){
    //             break;
    //         }
    //     }
    //     Node lca  = path1.get(i-1);
    //     return lca;
    // }
    public boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }
        path.add(root);
        if(root.data == n){
            return true;
        }
        boolean foundleft = getPath(root.left, n, path);
        boolean foundright = getPath(root.right, n, path);

        if(foundleft || foundright){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
    public Node LCA(Node root, int n1, int n2){
        if(root == null){
            return null;
        }
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i = 0;
        for(; i < path1.size()-1 && i < path2.size()-1; i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }
        Node lca = path1.get(i-1);
        return lca;
    }
    public Node LCA2(Node root, int n, int m){
        if(root == null){
            return null;
        }
        if(root.data == n || root.data == m){
            return root;
        }

        Node leftnode = LCA2(root.left, n, m);
        Node rightnode = LCA2(root.right, n, m);

        if(leftnode == null){
            return rightnode;
        }
        if(rightnode == null){
            return leftnode;
        }

        return root;
    }
    public int distancefromlca(Node root, int n){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdist = distancefromlca(root.left, n);
        int rightdist = distancefromlca(root.right, n);

        if(leftdist == -1 && rightdist == -1){
            return -1;
        }
        else if(leftdist == -1){
            return rightdist + 1;
        }
        else{
            return leftdist + 1;
        }
    }
    public int minDistance(Node root, int n, int m){
        Node  lca = LCA2(root, n, m);
        int leftdis = distancefromlca(lca,  n);
        int rightdis = distancefromlca(lca, m);

        return leftdis + rightdis;
    }
    public int kthancestor(Node root, int n, int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }
        int leftdis = kthancestor(root.left, n, k);
        int rightdis = kthancestor(root.right, n, k);

        if(leftdis == -1 && rightdis == -1){
            return -1;
        }
        int max = Math.max(leftdis, rightdis);
        if(max + 1 == k){
            System.out.print(root.data+" ");
        }
        return max + 1;
    }
    public int getsum(Node root){
        if(root == null){
            return 0;
        }

        int leftsum = getsum(root.left);
        int rightsum = getsum(root.right);

        return leftsum + rightsum + root.data;
    }
    public int transformtosumtree(Node root){
        if(root == null){
            return 0;
        }
        int leftsum = transformtosumtree(root.left);
        int rightsum = transformtosumtree(root.right);

        int oldvalue = root.data;
        root.data = leftsum + rightsum;

        return oldvalue + root.data;
    }
    public int sumtree(Node root){
        if(root == null){
            return 0;
        }
        int left = sumtree(root.left);
        int right = sumtree(root.right);

        int olddata = root.data;
        root.data = left + right;

        return olddata + root.data;
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
    // public Node constructTree(Node )
}

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, -1, -1, 7, -1, -1};
        Queue<Integer> q = new LinkedList<>();
        q.r

        binarytree tree = new binarytree();
        Node root = tree.buildtree(nodes);

        // tree.kthlevel(root, 1, 3);
        // System.out.println(tree.LCA(root, 2, 3).data);
        // System.out.println(tree.minDistance(root, 4, 7));
        // tree.kthancestor(root, 5, 2);
        // tree.transformtosumtree(root);
        System.out.println(tree.LCA2(root, 6 , 15).data);
        // tree.sumtree(root);
        // tree.levelorder(root);
        // HashMap<String , Integer> map = new HashMap<>();
        // tree.duplicatesubtrees(root, map);
        

    }
}
