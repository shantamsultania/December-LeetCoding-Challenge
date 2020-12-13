public class day12 {



    public TreeNode subtreeWithAllDeepest(TreeNode root) {

        if(root == null)
        {
            return root;
        }
        int l = dept(root.left);
        int r = dept(root.right);

        if(l == r)
        {
            return root;
        }
        else if(l<r)
        {
            return subtreeWithAllDeepest(root.right);
        }
        else
        {
            return subtreeWithAllDeepest(root.left);
        }

    }

    public int dept(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        return 1+ Math.max(dept(root.left),dept(root.right));
    }

}
