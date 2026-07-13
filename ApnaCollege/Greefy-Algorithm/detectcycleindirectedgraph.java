import java.util.*;

public class detectcycleindirectedgraph{
    static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static boolean cycledetected(ArrayList<Edge>[] graph){
        boolean[] visited = new boolean[graph.length];
        boolean[] stack = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(cycleUtil(graph,i, visited, stack)){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean cycleUtil(ArrayList<Edge>[] graph , int curr, boolean[] visited, boolean[] stack){
        visited[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            if(stack[e.dest]){
                return true;
            }
            if(!visited[e.dest] && cycleUtil(graph, e.dest, visited, stack))
            {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Edge>[] graph = new ArrayList[4];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
            graph[4].add(new Edge(4, 0));
            graph[4].add(new Edge(4, 1));

            graph[5].add(new Edge(5, 2));
            graph[5].add(new Edge(5, 0));
            
            graph[2].add(new Edge(2, 3));
            graph[3].add(new Edge(3, 1));
        System.out.print(cycledetected(graph));
    }
}