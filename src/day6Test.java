import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class day6Test {


    @Test
    void test1()
    {
        day6 obj = new day6();
        int a[] = {1,2,3,4,5,7};
        obj.insertBT(a);
//        System.out.println();
//        System.out.println();
        // convert to BT
        obj.levelorder();


    }

}