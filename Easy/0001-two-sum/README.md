# 1. Two Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/two-sum/)**

| | |
|:--|:--|
| **Difficulty** | Easy |
| **Topics** | `Array` · `Hash Table` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 3 ms |
| **Memory** | 47 MB |

## Earlier versions

Previous accepted solutions whose code differed from the current one.

- [`2025-09-19-solution.java`](./attempts/2025-09-19-solution.java) — 2025-09-19

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
