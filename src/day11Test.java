import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day11Test {


    @Test
    void test1()
    {
        day11 obj = new day11();

        int a[] = {1,1,1,2,2,3};

        assertEquals(5,obj.removeDuplicates(a));
    }

}