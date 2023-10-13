import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {
    static class Edge {
        int des;
        int src;
        int wt;

        public Edge(int d, int s, int w) {
            this.des = d;
            this.src = s;
            this.wt = w;
        }
    }

    public static void CreateGraph(ArrayList<Edge>[] graph, int V) {
        for (int i = 0; i < V; i++) {
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(1, 0, 1));
        graph[0].add(new Edge(2, 0, 1));

        graph[1].add(new Edge(0, 1, 1));
        graph[1].add(new Edge(3, 1, 1));

        graph[2].add(new Edge(0, 2, 1));
        graph[2].add(new Edge(4, 2, 1));

        graph[3].add(new Edge(1, 3, 1));
        graph[3].add(new Edge(4, 3, 1));
        graph[3].add(new Edge(5, 3, 1));

        graph[4].add(new Edge(2, 4, 1));
        graph[4].add(new Edge(3, 4, 1));
        graph[4].add(new Edge(5, 4, 1));

        graph[5].add(new Edge(3, 5, 1));
        graph[5].add(new Edge(4, 5, 1));
        graph[5].add(new Edge(6, 5, 1));

        graph[6].add(new Edge(5, 6, 1));
    }

    public static void Bfs(ArrayList<Edge>[] graph, int V,boolean vis[],int start) {
        Queue<Integer> q = new LinkedList<>();
      
        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();
            if (!vis[curr]) {
                System.out.print(curr + " "); // Print the current node
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e = graph[curr].get(i);
                    q.add(e.des);
                }
            }
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean vis[]){
               System.out.print(curr+" ");
               vis[curr]= true;
               for(int i=0;i<graph[curr].size();i++){
                Edge e= graph[curr].get(i);
                if(vis[e.des]==false){
                    dfs(graph, e.des, vis);
                }
               }
    }
    public static void main(String[] args) {
        int V = 7;
        ArrayList<Edge>[] graph = new ArrayList[V];
        
        CreateGraph(graph, V);
          boolean vis[] = new boolean[V];
          for(int i=0;i<V;i++){
            if(vis[i]== false){
                        //   Bfs(graph, V,vis,i);
                        dfs(graph,i,vis);
            }
          }
      
               
    }
}
