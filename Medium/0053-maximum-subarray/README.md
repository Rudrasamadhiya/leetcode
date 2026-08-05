# 53. Maximum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/maximum-subarray/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Array` · `Divide and Conquer` · `Dynamic Programming` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Runtime** | 1 ms |
| **Memory** | 77 MB |

## Earlier versions

Previous accepted solutions whose code differed from the current one.

- [`2026-06-19-solution.java`](./attempts/2026-06-19-solution.java) — 2026-06-19
- [`2026-06-19-solution.java`](./attempts/2026-06-19-solution.java) — 2026-06-19

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = nums[0];
        int curr = 0;
        
        for (int i = 0; i < nums.length; i++) {
            curr += nums[i];
            if (curr > maxsum) {
                maxsum = curr;
            }
            if (curr < 0) {
                curr = 0;
            }
        }
        
        return maxsum;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
