import java.util.*;

class Solution {

    static class Edge {
        int src;
        int dest;

        Edge(int s, int d) {
            src = s;
            dest = d;
        }
    }

    public boolean dfs(ArrayList<Edge>[] graph, int curr,
                       int destination, boolean[] vis) {

        if(curr == destination) {
            return true;
        }

        vis[curr] = true;

        for(int i = 0; i < graph[curr].size(); i++) {

            Edge e = graph[curr].get(i);

            if(!vis[e.dest]) {
                if(dfs(graph, e.dest, destination, vis)) {
                    return true;
                }
            }
        }

        return false;
    }

    public boolean validPath(int n, int[][] edges,
                             int source, int destination) {

        // Create adjacency list
        ArrayList<Edge>[] graph = new ArrayList[n];

        for(int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // Store edges
        for(int i = 0; i < edges.length; i++) {

            int u = edges[i][0];
            int v = edges[i][1];

            graph[u].add(new Edge(u, v));
            graph[v].add(new Edge(v, u));
        }

        // Apply DFS
        return dfs(graph, source, destination, new boolean[n]);
    }
}