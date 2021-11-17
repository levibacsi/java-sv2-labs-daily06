package numbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PerfectNumbersTest {
    @Test
    void testIsPerfectNumber (){
        PerfectNumbers perfectNumbers = new PerfectNumbers();
        boolean result = perfectNumbers.isPerfectNumber(6);
        assertEquals(true,result);

        assertTrue(perfectNumbers.isPerfectNumber(8128));
        assertFalse(perfectNumbers.isPerfectNumber(127));
        assertFalse(perfectNumbers.isPerfectNumber(88));
    }


}