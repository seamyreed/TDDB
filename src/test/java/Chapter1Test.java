import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Chapter1Test {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}


