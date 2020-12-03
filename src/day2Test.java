import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day2Test {


    @Test
    void test1()
    {
        day2 obj = new day2();
        int [] a = {1,2,3};
        obj.insert(a);
        obj.printall();
        obj.get_random();
    }

}