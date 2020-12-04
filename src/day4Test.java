import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day4Test {


    @Test
    void test1()
    {
        day4 obj = new day4();
        assertEquals(3,obj.kthFactor(12,3));
        assertEquals(7,obj.kthFactor(7,2));
        assertEquals(-1,obj.kthFactor(4,4));
        assertEquals(1,obj.kthFactor(1,1));
        assertEquals(4,obj.kthFactor(1000,3));
    }

}