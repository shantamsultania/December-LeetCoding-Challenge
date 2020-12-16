public class day16 {

    Integer prev = null;
    public boolean isValidBST(TreeNode root) {

        return inorder(root);
    }

    public boolean inorder(TreeNode root)
    {
        if(root == null)
        {
            return true;
        }
        if (!inorder(root.left)) {
            return false;
        }
        if (prev != null && root.data <= prev) {
            return false;
        }
        prev = root.data;
        return inorder(root.right);
    }
}
