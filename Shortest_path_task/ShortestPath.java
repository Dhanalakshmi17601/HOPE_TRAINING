import java.util.*;

class Pair {
    int node, dist;

    Pair(int node, int dist) {
        this.node = node;
        this.dist = dist;
    }
}

public class ShortestPath {

    public static void dijkstra(int V, ArrayList<ArrayList<Pair>> adj, int src) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.dist - b.dist);
        int[] dist = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;

        pq.add(new Pair(src, 0));

        while (!pq.isEmpty()) {
            Pair current = pq.poll();

            for (Pair neighbor : adj.get(current.node)) {
                if (dist[current.node] + neighbor.dist < dist[neighbor.node]) {
                    dist[neighbor.node] = dist[current.node] + neighbor.dist;
                    pq.add(new Pair(neighbor.node, dist[neighbor.node]));
                }
            }
        }

        System.out.println("Shortest distances from source:");
        for (int i = 0; i < V; i++) {
            System.out.println("Node " + i + " → " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int V = 3;
        ArrayList<ArrayList<Pair>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());

        adj.get(0).add(new Pair(1, 1));
        adj.get(0).add(new Pair(2, 4));
        adj.get(1).add(new Pair(2, 2));

        dijkstra(V, adj, 0);
    }
}
