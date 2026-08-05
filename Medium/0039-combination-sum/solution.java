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
