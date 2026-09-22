import java.util.*;

class Edge implements Comparable<Edge> {
    int u, v, wt;

    public Edge(int u, int v, int wt) {
        this.u = u;
        this.v = v;
        this.wt = wt;
    }

    @Override
    public int compareTo(Edge other) {
        if (this.wt != other.wt) {
            return Integer.compare(this.wt, other.wt);
        } else {
            int sum1 = this.u + this.v + this.wt;
            int sum2 = other.u + other.v + other.wt;
            return Integer.compare(sum1, sum2);
        }
    }
}

public class EXP5TechTraining {

    static int[] parent;

    static int find(int u) {
        if (parent[u] != u) {
            parent[u] = find(parent[u]);
        }
        return parent[u];
    }

    static void union(int u, int v) {
        int rootU = find(u);
        int rootV = find(v);
        parent[rootU] = rootV;
    }

    static int minimumWeight(Edge[] edges, int n) {
        Arrays.sort(edges);
        int totalWeight = 0;
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            parent[i] = i;
        }
        for (Edge edge : edges) {
            int rootU = find(edge.u);
            int rootV = find(edge.v);
            if (rootU != rootV) {
                totalWeight += edge.wt;
                union(rootU, rootV);
            }
        }
        return totalWeight;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of nodes
        int m = sc.nextInt(); // Number of edges
        Edge[] edges = new Edge[m];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int wt = sc.nextInt();
            edges[i] = new Edge(u, v, wt);
        }
        int result = minimumWeight(edges, n);
        System.out.println("Overall weight of the tree is: "+result);
        sc.close();
    }
}