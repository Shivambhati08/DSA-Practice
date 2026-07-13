import java.util.ArrayList;
import java.util.PriorityQueue;

public class DijkstrasAlgorithm {
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
        int n;
        int path;
        public Pair(int n, int p){
            this.n = n;
            this.path = p;
        }
        @Override
        public int compareTo(Pair o){
            return this.path - o.path;
        }
    }
    public static void dijsktra(ArrayList<Edge>[] graph, int src){
        int[] dist = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if(i != src){
                dist[i] = Integer.MAX_VALUE;
            }
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src, 0));

        boolean[] vis = new boolean[graph.length];
        while(!pq.isEmpty()){
            Pair curr = pq.remove();
            if(!vis[curr.n]){
                vis[curr.n] = true;
                for (int i = 0; i < graph[curr.n].size(); i++) {
                    Edge e = graph[curr.n].get(i);
                    int u =  e.src;
                    int v = e.dest;
                    int wt = e.wt;
                    if(dist[u] + wt < dist[v]){
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }
                }
            }
        }
        for (int dis : dist) {
            System.out.print(dis+" ");
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[6];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1, 2));
        graph[0].add(new Edge(0, 2, 4));

        graph[1].add(new Edge(1, 3, 7));
        graph[1].add(new Edge(1, 2, 1));

        graph[2].add(new Edge(2, 4, 3));

        graph[3].add(new Edge(3, 5, 1));

        graph[4].add(new Edge(4, 3, 2));
        graph[4].add(new Edge(4, 5, 5));
        dijsktra(graph, 0);
    }
}
