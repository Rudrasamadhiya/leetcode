# 39. Combination Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/combination-sum/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Backtracking` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 2 ms |
| **Memory** | 45.5 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    void backtrack(int[] c, int rem, int start, List<Integer> curr, List<List<Integer>> res) {
        if (rem == 0) { res.add(new ArrayList<>(curr)); return; }
        if (rem < 0) return;
        for (int i = start; i < c.length; i++) {
            curr.add(c[i]);
            backtrack(c, rem - c[i], i, curr, res);
            curr.remove(curr.size() - 1);
        }
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
