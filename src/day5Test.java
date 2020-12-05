import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day5Test {


    @Test
    void test1()
    {
        int []a = {1,0,0,0,1};
        int n = 1;
        day5 obj = new day5();
        assertTrue(obj.canPlaceFlowers(a,n));
    }

}