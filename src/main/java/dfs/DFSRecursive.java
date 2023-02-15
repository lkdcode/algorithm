package dfs;

import java.util.Scanner;

/**
 * 재귀함수로..
 */
public class DFSRecursive {
    static final int MAX_N = 10;
    static int N, E;
    static int[][] Graph = new int[MAX_N][MAX_N];
    static boolean[] Visited = new boolean[MAX_N];

    static void dfs(int node) {
        Visited[node] = true;
        System.out.print(node + " ");

        for (int next = 0; next < N; ++next) {
            if (!Visited[next] && Graph[node][next] != 0) {
                dfs(next);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        E = scanner.nextInt();
        for (int i = 0; i < E; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            Graph[u][v] = Graph[v][u] = 1;
        }

        dfs(0);
    }
}
