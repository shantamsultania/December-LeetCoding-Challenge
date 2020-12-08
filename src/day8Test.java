import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day8Test {

    @Test
    void test1()
    {
        day8 obj = new day8();
        int []a= {30,20,150,100,40};
        assertEquals(3,obj.get_pairs(a));

    }
    @Test
    void test2()
    {
        day8 obj = new day8();
        int []a = {60,60,60};
        assertEquals(3,obj.get_pairs(a));
    }



}