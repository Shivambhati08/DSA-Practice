import java.util.ArrayList;
import java.util.Stack;

public class toposort{
    static class Edge{
        int src;
        int dest;
        Edge(int s, int d){
            this.src = s;
            this.dest = d;
        }
    }
    public static void topoSorting(ArrayList<Edge>[] graph){
        boolean[] vis = new boolean[graph.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < graph.length; i++) {
            if(!vis[i]){
                toposortUtil(graph, i, vis, stack);
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+" ");
        }
    }
    public static void toposortUtil(ArrayList<Edge>[] graph, int src, boolean[] vis, Stack<Integer> stack){
        vis[src] =  true;

        for (int i = 0; i < graph[src].size(); i++) {
            Edge e = graph[src].get(i);
            if(!vis[e.dest]){
                toposortUtil(graph, e.dest, vis, stack);
            }
        }
        stack.push(src);
    }
    public static void main(String[] args){
        @SuppressWarnings("ignore")
        ArrayList<Edge>[] graph = new ArrayList[6];
        for(int i = 0; i < graph.length; i++){
            graph[i] = new ArrayList<>();
        }
        graph[2].add(new Edge(2, 3));
        graph[3].add(new Edge(3, 1));
        graph[4].add(new Edge(4, 1));
        graph[4].add(new Edge(4, 0));
        graph[5].add(new Edge(5, 0));
        graph[5].add(new Edge(5, 2));
        topoSorting(graph);
    }
}