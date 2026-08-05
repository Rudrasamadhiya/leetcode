# 739. Daily Temperatures

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/daily-temperatures/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Stack` · `Monotonic Stack` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 62 ms |
| **Memory** | 107.6 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.push(i);
        }
        return res;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
