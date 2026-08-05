# 6. Zigzag Conversion

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Notes](https://img.shields.io/badge/Notes-Pending-6b7280?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/zigzag-conversion/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `String` |
| **Language** | Java |
| **Solved** | August 5, 2026 |
| **Runtime** | 4 ms |
| **Memory** | 46.6 MB |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-08-05 by <b>LeetSync</b>.</sub>
