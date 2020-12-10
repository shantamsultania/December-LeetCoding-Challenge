import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day10Test {

    @Test
    void test1()
    {
        day10 obj = new day10();
        int a[] = {3,5,5};
        int b[] = {0,3,2,1};
        assertTrue(obj.validMountainArray(b));
        assertFalse(obj.validMountainArray(a));
    }

}