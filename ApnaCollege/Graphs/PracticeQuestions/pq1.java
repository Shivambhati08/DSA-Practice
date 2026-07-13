import java.util.ArrayList;
public class pq1 {
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            src = s;
            dest = d;
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[1].add(new Edge(1, 5));
        graph[1].add(new Edge(1, 9));
    }
}
