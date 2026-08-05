# 7. Reverse Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Solved in](https://img.shields.io/badge/Solved%20in-30s-a371f7?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/reverse-integer/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Math` |
| **Language** | Java |
| **Solved** | August 5, 2026 |
| **Time to solve** | 30s |
| **Test cases** | 1046 / 1046 passed |
| **Runtime** | 1 ms — beats **100.0%** |
| **Memory** | 42.6 MB — beats **46.3%** |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            int digit = x % 10;

            if (result > Integer.MAX_VALUE / 10 || 
               (result == Integer.MAX_VALUE / 10 && digit > 7)) return 0;

            if (result < Integer.MIN_VALUE / 10 || 
               (result == Integer.MIN_VALUE / 10 && digit < -8)) return 0;

            result = result * 10 + digit;
            x /= 10;
        }

        return result;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-08-05 by <b>LeetSync</b>.</sub>
