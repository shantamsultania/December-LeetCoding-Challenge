import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class day6 {


    node root;
    node r;
    day6()
    {
        root = null;
    }
    void insertBT(int @NotNull []a)
    {
        for(int v : a)
        {
            insert(v);
        }
    }
    void insert(int n)
    {
        root = insertnode(root,n);
    }
    node insertnode(node root,int n)
    {
        if (root == null)
        {
            root = new node(n);
        return root;
        }
        Queue<node> q = new LinkedList<node>();
        q.add(root);

        while (!q.isEmpty())
        {
            node temp = q.poll();
            if (temp.left == null)
            {
                temp.left = new node(n);
               break;
            }
            else
            {
                q.add(temp.left);
            }
            if (temp.right == null)
            {
                temp.right = new node(n);
                break;
            }
            else
            {
                q.add(temp.right);
            }
        }
        return root;
    }
    void inorder()
    {
        inorder(root);
    }
    void inorder(node root)
    {
        if (root != null)
        {
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    void levelorder()
    {
        levelorder(root);
    }
    void levelorder(node root)
    {
        if (root == null)
        {
            System.out.println("empty Tree");
            return;
        }
        Queue<node> q = new LinkedList<>();
        q.add(root);


        while (!q.isEmpty()) {
            int c = q.size();
           for(int i=0;i<c;i++) {
                node temp = q.poll();
                if (i<c-1) {
                    temp.next = q.peek();
                }
                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            System.out.println();
        }
    }




}
