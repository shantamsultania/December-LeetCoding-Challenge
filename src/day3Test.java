import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day3Test {


    @Test
    void test1()
    {
        day3 obj = new day3();
        int []a = {5,1,7};
        obj.insertTree(a);
        obj.inorder();
        System.out.println("--");
        System.out.println();
        // method 1
//        obj.increasingBST();
//        obj.inorder();
        //

        // method 2
        System.out.println("__");
        obj.method2();
        obj.inorder();

    }

}