import java.util.ArrayList;

public class allPathSourcetoTarget {
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void allpathStoT(ArrayList<Edge>[] graph,String path, int source, int destination){
        if(source == destination){
            System.out.println(path+destination);
            return;
        }
        for(int i = 0; i < graph[source].size(); i++){
                Edge e = graph[source].get(i);
                allpathStoT(graph, path+source, e.dest, destination);
        }
    }
    public static void main(String[] args) {
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[6];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 3));
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        
        allpathStoT(graph, new String(), 5, 1);
    }
}
