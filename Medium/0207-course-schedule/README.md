# 207. Course Schedule

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/course-schedule/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Depth-First Search` · `Breadth-First Search` · `Graph Theory` · `Topological Sort` · `Directed Acyclic Graph` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 4 ms |
| **Memory** | 47.1 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
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
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
