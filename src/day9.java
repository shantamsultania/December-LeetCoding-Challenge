import java.util.LinkedList;
import java.util.Queue;

public class day9 {

    Queue<Integer> q = new LinkedList<>();


    public day9(TreeNode root) {

        helper(root);
    }

    public void helper(TreeNode root)
    {

        if(root != null)
        {
            helper(root.left);
            q.add(root.data);
            helper(root.right);
        }
    }

    public int next() {

        return q.poll();

    }

    public boolean hasNext() {
        return !q.isEmpty();
    }

}
