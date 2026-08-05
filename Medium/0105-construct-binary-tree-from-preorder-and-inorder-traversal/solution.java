class Solution {
    int idx = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return build(preorder, map, 0, inorder.length - 1);
    }

    TreeNode build(int[] pre, HashMap<Integer, Integer> map, int l, int r) {
        if (l > r) return null;
        TreeNode root = new TreeNode(pre[idx++]);
        int mid = map.get(root.val);
        root.left = build(pre, map, l, mid - 1);
        root.right = build(pre, map, mid + 1, r);
        return root;
    }
}
