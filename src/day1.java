import jdk.nashorn.api.tree.Tree;
import org.junit.jupiter.api.io.TempDir;

import java.net.Inet4Address;
import java.util.LinkedList;
import java.util.Queue;

public class day1 {

    // Given the root of a binary tree, return its maximum depth.
    //
    //A binary tree's maximum depth is the number
    // of nodes along the longest path from the root node down to the farthest leaf node.

    //Input: root = [3,9,20,null,null,15,7]
    //Output: 3

    TreeNode root;
    day1()
    {
        root = null;
    }
    void insertTree(int a[])
    {

        for (int value : a) {

            insertnode(value);
        }
    }
    void insertnode(int n)
    {
        root = insert(root,n);
    }
    TreeNode insert(TreeNode root,int n)
    {

        if (root == null)
        {
            root = new TreeNode(n);
            return root;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if (temp.left == null)
            {
                temp.left = new TreeNode(n);
                return root;
            }
            else
            {
                q.add(temp.left);
            }
            if (temp.right == null)
            {
                temp.right = new TreeNode(n);
                return root;
            }
            else
            {
                q.add(temp.right);
            }


        }
        return root;
    }

    public void inorder()
    {
        inorder(root);
    }
    void inorder(TreeNode root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.println(root.data+"  ");
            inorder(root.right);
        }
    }
    int maxdepth()
    {
        int x = (maxdepth(root));
    return x;
    }
    public int maxdepth(TreeNode root)
    {
        if (root == null)
        {
            return 0;
        }
        return 1+Math.max(maxdepth(root.left),maxdepth(root.right));
    }

}
