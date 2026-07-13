
import java.util.*;

public class zigzagtraversal {

    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    static class BinaryTree {

        static int idx = -1;

        public Node buildtree(int[] values) {
            idx++;
            if (values[idx] == -1) {
                return null;
            }
            Node newnode = new Node(values[idx]);
            newnode.left = buildtree(values);
            newnode.right = buildtree(values);

            return newnode;
        }

        public void zigzag(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            q.add(root);
            boolean flag = true;

            while (!q.isEmpty()) {
                int size = q.size();

                List<Integer> level = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();

                    level.add(curr.data);
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                if (flag) {
                    list.addAll(level);
                } else {
                    for (int i = level.size() - 1; i >= 0; i--) {
                        list.add(level.get(i));
                    }
                }
                flag = !flag;
            }
            for (int integer : list) {
                System.out.print(integer + " ");

            }
        }

        public void boundarytraversal(Node root) {
            List<Integer> list = new ArrayList<>();
            if (root == null) {
                return;
            }
            list.add(root.data);
            left(root.left, list);
            leafnode(root, list);
            right(root.right, list);

            for (Integer integer : list) {
                System.out.print(integer + " ");

            }
        }

        public void left(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                return;
            }
            list.add(root.data);
            if (root.left != null) {
                left(root.left, list);
            } else {
                left(root.right, list);
            }
        }

        public void leafnode(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                list.add(root.data);
            }
            leafnode(root.left, list);
            leafnode(root.right, list);
        }

        public void right(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                return;
            }
            if (root.right != null) {
                right(root.right, list);
            } else {
                right(root.left, list);
            }
            list.add(root.data);
        }

        public void leftview(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();

                    if (i == 0) {
                        System.out.print(curr.data + " ");
                    }
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public void rightview(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            while (!q.isEmpty()) {
                int size = q.size();
                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();
                    if (i == size - 1) {
                        System.out.print(curr.data + " ");
                    }
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public void levelorder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.print(curr.data + " ");
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public int Count(Node root) {
            if (root == null) {
                return 0;
            }
            int left = Count(root.left);
            int right = Count(root.right);

            return 1 + left + right;
        }

        public void boundaryview(Node root) {
            if (root == null) {
                return;
            }
            List<Integer> list = new ArrayList<>();
            list.add(root.data);
            lefttrav(root.left, list);
            leafnodetrav(root, list);
            righttrav(root.right, list);

            for (Integer integer : list) {
                System.out.print(integer + " ");
            }
        }

        public void lefttrav(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                return;
            }
            list.add(root.data);
            if (root.left != null) {
                lefttrav(root.left, list);
            } else {
                lefttrav(root.right, list);
            }
        }

        public void righttrav(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                return;
            }
            if (root.right != null) {
                righttrav(root.right, list);
            } else {
                righttrav(root.left, list);
            }
            list.add(root.data);
        }

        public void leafnodetrav(Node root, List<Integer> list) {
            if (root == null) {
                return;
            }
            if (root.left == null && root.right == null) {
                list.add(root.data);
            }
            leafnodetrav(root.left, list);
            leafnodetrav(root.right, list);
        }

        public void Zz(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            boolean flag = true;
            while (!q.isEmpty()) {
                int size = q.size();
                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < size; i++) {
                    Node curr = q.remove();
                    list.add(curr.data);

                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
                if (flag == true) {
                    for (int i = 0; i < size; i++) {
                        System.out.print(list.get(i) + " ");
                    }
                } else {
                    for (int i = size - 1; i >= 0; i--) {
                        System.out.print(list.get(i) + " ");
                    }
                }
                flag = !flag;
            }
        }

        // static class Info{
        //     Node node;
        //     int hd;
        //     Info(Node node, int hd){
        //         this.node = node;
        //         this.hd = hd;
        //     }
        // }
        // public void topview(Node root){
        //     if(root == null){
        //         return;
        //     }
        //     Queue<Info> q = new LinkedList<>();
        //     HashMap<Integer, Node> map = new HashMap<>();
        //     q.add(new Info(root, 0));
        //     q.add(null);
        //     int min = 0, max = 0;
        //     while(!q.isEmpty()){
        //         Info curr = q.remove();
        //         if(curr == null){
        //             if(q.isEmpty()){
        //                 break;
        //             }
        //             else{
        //                 q.add(null);
        //             }
        //         }
        //         else{
        //             if(!map.containsKey(curr.hd)){
        //                 map.put(curr.hd, curr.node);
        //             }
        //             if(curr.node.left != null){
        //                 q.add(new Info(curr.node.left, curr.hd -1));
        //                 min = Math.min(min, curr.hd -1);
        //             }
        //             if(curr.node.right != null){
        //                 q.add(new Info(curr.node.right, curr.hd + 1));
        //                 max = Math.max(max, curr.hd + 1);
        //             }
        //         }
        //     }
        //     for (int i = min; i <= max; i++) {
        //         System.out.print(map.get(i).data+" ");
        //     }
        // }
        static class Info {

            Node node;
            int hd;

            Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public void topview(Node root) {
            if (root == null) {
                return;
            }
            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();
            q.add(new Info(root, 0));
            q.add(null);
            int min = 0, max = 0;
            while (!q.isEmpty()) {
                Info curr = q.remove();
                if (curr == null) {
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    if (!map.containsKey(curr.hd)) {
                        map.put(curr.hd, curr.node);
                    }
                    if (curr.node.left != null) {
                        q.add(new Info(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if (curr.node.right != null) {
                        q.add(new Info(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }

            }
            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }
        }

        public class Pair {

            Node node;
            int idx;

            Pair(Node node, int idx) {
                this.node = node;
                this.idx = idx;
            }
        }

        public void bottomview(Node root) {
            if (root == null) {
                return;
            }
            Queue<Pair> q = new LinkedList<>();
            int idx = 0;
            HashMap<Integer, Integer> map = new HashMap<>();
            q.add(new Pair(root, 0));
            while (!q.isEmpty()) {
                Pair curr = q.remove();
                map.put(curr.idx, curr.node.data);
                if (curr.node.left != null) {
                    q.add(new Pair(curr.node.left, curr.idx - 1));
                }
                if (curr.node.right != null) {
                    q.add(new Pair(curr.node.right, curr.idx + 1));
                }
            }
            System.out.println(map);
        }
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 4, -1, -1, 5, -1, -1, 3, 6, 8, -1, -1, 9, -1, -1, 7, 10, -1, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(values);
        // tree.zigzag(root);
        // tree.boundarytraversal(root);
        // tree.rightview(root);
        // tree.levelorder(root);
        // System.out.println();
        // System.out.println(tree.Count(root));
        // tree.Zz(root);
        // tree.boundaryview(root);
        // tree.topview(root); 
        tree.bottomview(root);
    }
}
