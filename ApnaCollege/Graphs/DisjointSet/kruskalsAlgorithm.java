import java.util.ArrayList;
import java.util.Collections;
public class kruskalsAlgorithm{
    static class Edge implements Comparable<Edge> {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w){
            src = s;
            dest = d;
            wt = w;
        }
        @Override
        public int compareTo(Edge o){
            return this.wt - o.wt;
        }
    }
    public static void createEdges(ArrayList<Edge> edges){
        edges.add(new Edge(0, 1, 10));
        edges.add(new Edge(0, 2, 15));
        edges.add(new Edge(0, 3, 30));
        edges.add(new Edge(1, 3, 40));
        edges.add(new Edge(2, 3, 50));
    }
    static int n = 4;
    static int[] par = new int[n];
    static int[] rank = new int[n];
    public static void init(){
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }
    }
    public static int find(int x){
        if(x == par[x]){
            return x;
        }
        return par[x] = find(par[x]);
    }
    public static void union(int a, int b){
        int parA = find(a);
        int parB = find(b);
        if(rank[parA] == rank[parB]){
            par[parB] = parA;
            rank[parA]++;
        }
        else if(rank[parA] < rank[parB]){
            par[parA] = parB;
        }
        else{
            par[parB] = parA;
        }
    }
    // public static void kruskals(ArrayList<Edge> edges, int V){
    //     init();
    //     Collections.sort(edges);
    //     int mstCost = 0;
    //     int count = 0;

    //     for (int i = 0; count < V-1; i++) {
    //         Edge e = edges.get(i);
    //         // src, dest, wt
    //         int parA = find(e.src);
    //         int parB = find(e.dest);
    //         if(parA != parB){
    //             union(e.src, e.dest);
    //             mstCost += e.wt;
    //             count++;
    //         }
    //     }
    //     System.out.println(mstCost);
    // }
    public static void kruskals(ArrayList<Edge> edges, int V){
        init();
        Collections.sort(edges);
        int mstCost = 0;
        int count = 0;
        for (int i = 0;count < V-1; i++) {
            Edge e = edges.get(i);

            int parS = find(e.src);
            int parD = find(e.dest);
            if(parS != parD){
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }
    public static void main(String[] args){
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createEdges(edges);
        kruskals(edges, V);
    }
}