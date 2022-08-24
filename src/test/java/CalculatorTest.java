import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void addTest() {
        System.out.println("TESTING ADD");

        int expected = 3;
        int actual = new Calculator().addNumbers(1,2);

        assertEquals(expected, actual);

    }
}