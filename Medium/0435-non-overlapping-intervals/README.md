# 435. Non-overlapping Intervals

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/non-overlapping-intervals/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Dynamic Programming` · `Greedy` · `Sorting` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 44 ms |
| **Memory** | 115.7 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[1] - b[1]);
        int count = 0, lastEnd = Integer.MIN_VALUE;
        for (int[] iv : intervals) {
            if (iv[0] >= lastEnd) lastEnd = iv[1];
            else count++;
        }
        return count;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
