import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestSumCalculator {
    SumCalculator classUnderTest;

    @BeforeEach
    void createSumCalculator() {
       classUnderTest = new SumCalculator();
    }

    @Test
    public void testThatSumCalculatorReturn1() {
        int actual = classUnderTest.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumCalculatorReturn3() {
        int actual = classUnderTest.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumCalculatorReturn0() {

        Assertions.assertThrows(Exception.class, () -> classUnderTest.sum(0), new IllegalArgumentException().toString());

    }
}
