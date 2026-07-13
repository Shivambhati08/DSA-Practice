import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFSandDFSforconnCompo {
        static class Edge {

        int src;
        int dest;

        public Edge(int s, int d) {
            this.src = s;
            this.dest = d;
        }
    }
    public static void dfstraversal(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for(int i = 0; i < graph.length; i++){
            if(!visited[i]){
                 dfsUtil(graph, i, visited);
            }
        }
    }
    public static boolean detectCycle(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                return detectCycleUtil(graph, visited, i, -1);
            }
        }
        return false;
    }
    public static boolean detectCycleUtil(ArrayList<Edge>[] graph, boolean[] visited, int curr, int parent){
        visited[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // Case 3 - neighbour not visited
            if(!visited[e.dest]){
                if(detectCycleUtil(graph, visited, e.dest, parent)){
                    return true;
                }
            }
            // Case 1 - neighbour visited and neighbour is not parent of current
            else if (visited[e.dest] && e.dest != parent) {
                return true;
            }
            // Case 2 - neighbour visited but parent of current 
        }
        return false;
    }

    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        System.out.print(curr+" ");
        visited[curr] = true;
        
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(!visited[e.dest]){
                dfsUtil(graph, e.dest, visited);
            }
        }
    }
    public static void bfstraversal(ArrayList<Edge>[] graph, int start){
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                bfsUtil(graph, visited);
            }
        }
    }
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean[] visited) {
        Queue<Integer> q = new LinkedList<>();
        
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for (int i = 0; i < graph[curr].size(); i++) {
                Edge e = graph[curr].get(i);
                if (!visited[e.dest]) {
                    q.add(e.dest);
                    visited[e.dest] = true;
                }
            }
        }
    }
    public static boolean haspath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis){
        if(src == dest){
            return true;
        }
        vis[src] = true;
        for(int i = 0; i < graph[src].size(); i++){
            Edge e = graph[src].get(i);
            if(!vis[e.dest] && haspath(graph, e.dest, dest, vis)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[7];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));

        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));

        // bfstraversal(graph, 6);
        // dfstraversal(graph);
        System.out.println(detectCycle(graph));
        // System.out.println(haspath(graph, 0, 6, new boolean[graph.length]));
        // System.out.println(haspath(graph, 0, 7, new boolean[graph.length]));

    }
}
