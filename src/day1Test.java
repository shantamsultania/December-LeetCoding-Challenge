import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day1Test {


    @Test
    void test1()
    {
        day1 obj = new day1();
        int a[] = {3,9,20,15,7};
        obj.insertTree(a);
//        obj.inorder();
        assertEquals(3,obj.maxdepth());
    }@Test
    void test2()
    {
        day1 obj = new day1();
        int a[] = {1,2};
        obj.insertTree(a);
//        obj.inorder();
        assertEquals(2,obj.maxdepth());
    }
    @Test
    void test3()
    {
        day1 obj = new day1();
        int a[] = {0};
        obj.insertTree(a);
//        obj.inorder();
        assertEquals(1,obj.maxdepth());
    }   @Test
    void test4()
    {
        day1 obj = new day1();
        int a[] = {};
        obj.insertTree(a);
//        obj.inorder();
        assertEquals(0,obj.maxdepth());
    }

}