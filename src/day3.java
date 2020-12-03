import java.net.Inet4Address;
import java.util.ArrayList;

public class day3 {

    // Given the root of a binary search tree, rearrange the
    // tree in in-order so that the leftmost node in the tree is
    // now the root of the tree, and every node has no left child and only one right child.



    TreeNode root;
    TreeNode cur;
    day3()
    {
        root = null;
    }
    void insertTree(int a[] )
    {
        for(int value : a)
        {
          insertnode(value);
        }
    }
    void insertnode(int n)
    {
        root = insertnode(root,n);
    }
    TreeNode  insertnode(TreeNode root,int n )
    {

        if (root == null)
        {
            root = new TreeNode(n);
            return root;
        }
        else if(n<root.data)
        {
            root.left = insertnode(root.left,n);
        }
        else if (n>root.data)
        {
            root.right = insertnode(root.right,n);
        }
        return root;
    }

    void inorder()
    {
        inorder(root);
    }
    void inorder(TreeNode root)
    {
        if (root != null)
        {
            System.out.print(root.data+" ");
            inorder(root.left);
            inorder(root.right);
        }
    }
    void inorder(TreeNode root,ArrayList<Integer> a)
    {
        if (root != null)
        {
            inorder(root.left,a);
            a.add(root.data);
            inorder(root.right,a);
        }
    }

    void increasingBST()
    {
        root = increasingBST(root);
    }
    TreeNode increasingBST(TreeNode root)
    {
        TreeNode res = null;
        ArrayList<Integer> a = new ArrayList<>();
        inorder(root,a);
        for (Integer integer : a) {
            res = insertnode(res, integer);
        }

            return res;
    }


                               //////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // More optimised method

    void method2()
    {
        root = increasingBST2(root);
    }

    TreeNode increasingBST2(TreeNode root)
    {
        TreeNode ans = new TreeNode(0);
        cur = ans;
        inorder2(root);
        return ans.right;
    }
    void inorder2(TreeNode root)
    {
        if (root != null)
        {
            inorder2(root.left);
            root.left = null;
            cur.right = root;
            cur = root;
            inorder2(root.right);
        }
    }


}
