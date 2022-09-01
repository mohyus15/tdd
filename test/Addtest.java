import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Addtest {
    @Test
    void Add() {
        var addtion = new Add();
        int result = addtion.Add(2,5);
        assertEquals(7,result);
    }
    @Test
    void multy() {
        var addtion = new Add();
        int result = addtion.multipy(3,7);
        assertEquals(21,result);
    }
}
