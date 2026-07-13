import java.util.ArrayList;
import java.util.PriorityQueue;

public class PrimsAlgo {
    static class Edge{
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            src = s;
            dest = d;
            wt = w;
        }
    }
    static class Pair implements Comparable<Pair>{
        int v;
        int cost;
        public Pair(int v, int cost){
            this.v = v;
            this.cost = cost;
        }
        @Override
        public int compareTo(Pair o){
            return this.cost - o.cost;
        }
    }
    public static void prims(ArrayList<Edge>[] graph, int src){
        boolean[] vis = new boolean[graph.length];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        int minCost = 0;
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.v]){
                vis[curr.v] = true;
                minCost += curr.cost;
                for (int i = 0; i < graph[curr.v].size(); i++) {
                    Edge e = graph[curr.v].get(i);
                    int v = e.dest;
                    int w = e.wt;
                    pq.add(new Pair(v, w));
                }
            }

        }
        System.out.println("Minumum cost of MST : "+minCost);
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[6];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 10));
        graph[0].add(new Edge(0, 2, 15));
        graph[0].add(new Edge(0, 3, 30));
        graph[1].add(new Edge(1, 0, -10));
        graph[1].add(new Edge(1, 3, 40));
        graph[2].add(new Edge(2, 0, 15));
        graph[2].add(new Edge(2, 3, 50));
        graph[3].add(new Edge(3, 0, 30));
        graph[3].add(new Edge(3, 1, 40));
        graph[3].add(new Edge(3, 2, 50));
        prims(graph, 0);
    }
}
