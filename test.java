public class test {
    public static void main(String[] args) {
        //DFS
        int[][] graph = {{0, 1}, {0, 2}, {0, 3}, {1, 2}, {1, 3}, {2, 3}};
        int[] visited = new int[4];
        dfs(graph, 0, visited);
        System.out.println();
}

    private static void dfs(int[][] graph, int i, int[] visited) {
        visited[i] = 1;
        System.out.print(i + " ");
        for (int j = 0; j < graph[i].length; j++) {
            if (visited[graph[i][j]] == 0) {
                dfs(graph, graph[i][j], visited);
            }
        }
    }
}