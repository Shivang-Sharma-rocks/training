package june_13_2026;

import java.util.*;

public class BFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        @SuppressWarnings("unchecked")
        ArrayList<Integer> arr[] = new ArrayList[n + 1];
        for (int i = 0; i <= n; i++) {
            arr[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            arr[u].add(v);
            arr[v].add(u);
        }

        sc.close();

        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n + 1];
        int source = sc.nextInt();
        vis[source] = true;
        q.add(source);

        while (!q.isEmpty()) {
            int levelSize = q.size();
            for (int i = 0; i < levelSize; i++) {
                int node = q.poll();
                System.out.print(node + " ");

                for (int neighbour : arr[node]) {
                    if (!vis[neighbour]) {
                        vis[neighbour] = true;
                        q.add(neighbour);
                    }
                }
            }
            System.out.println();
        }
    }
}
