# 2. Add Two Numbers

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-ffb800?style=flat-square) ![Language](https://img.shields.io/badge/Language-Java-4c8dff?style=flat-square) ![Solved in](https://img.shields.io/badge/Solved%20in-2s-a371f7?style=flat-square)

**[Open on LeetCode →](https://leetcode.com/problems/add-two-numbers/)**

| | |
|:--|:--|
| **Difficulty** | Medium |
| **Topics** | `Linked List` · `Math` · `Recursion` |
| **Language** | Java |
| **Solved** | June 19, 2026 |
| **Time to solve** | 2s |
| **Test cases** | 1569 / 1569 passed |
| **Runtime** | 1 ms — beats **100.0%** |
| **Memory** | 46.6 MB — beats **38.5%** |

## Solution

[`solution.java`](./solution.java)

<details open>
<summary>View code</summary>

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = new ListNode(0);
        ListNode curr = temp;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = carry;
            if (l1 != null) { sum += l1.val; l1 = l1.next; }
            if (l2 != null) { sum += l2.val; l2 = l2.next; }
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
        }
        return temp.next;
    }
}
```

</details>

---

<sub>Synced from LeetCode on 2026-06-19 by <b>LeetSync</b>.</sub>
