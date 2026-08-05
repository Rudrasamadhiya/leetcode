class Solution {
    public boolean canFinish(int n, int[][] prereqs) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());
        for (int[] p : prereqs) graph.get(p[1]).add(p[0]);
        int[] state = new int[n];
        for (int i = 0; i < n; i++)
            if (dfs(graph, state, i)) return false;
        return true;
    }

    boolean dfs(List<List<Integer>> graph, int[] state, int node) {
        if (state[node] == 1) return true;
        if (state[node] == 2) return false;
        state[node] = 1;
        for (int nb : graph.get(node)) if (dfs(graph, state, nb)) return true;
        state[node] = 2;
        return false;
    }
}
