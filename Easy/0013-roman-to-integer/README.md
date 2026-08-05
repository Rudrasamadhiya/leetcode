# 13. Roman to Integer

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-00b8a3?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Solved in](https://img.shields.io/badge/Solved%20in-18s-a371f7?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/roman-to-integer/)**

| | |
|:--|:--|
| **Difficulty** | Easy |
| **Topics** | `Hash Table` · `Math` · `String` |
| **Language** | Java |
| **Solved** | August 5, 2026 |
| **Time to solve** | 18s |
| **Test cases** | 3999 / 3999 passed |
| **Runtime** | 2 ms — beats **100.0%** |
| **Memory** | 46.1 MB — beats **97.3%** |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public int romanToInt(String s) {
        int total = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int curr = value(s.charAt(i));
            
            if (i < s.length() - 1 && curr < value(s.charAt(i + 1))) {
                total -= curr;
            } else {
                total += curr;
            }
        }
        
        return total;
    }

    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        return 1000;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-08-05 by <b>LeetSync</b>.</sub>
