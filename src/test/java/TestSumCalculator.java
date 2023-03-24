import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSumCalculator {
    @Test
    public void testThatSumCalculatorReturn1() {
        SumCalculator classUnderTest = new SumCalculator();
        int actual = classUnderTest.sum(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumCalculatorReturn3() {
        SumCalculator classUnderTest = new SumCalculator();
        int actual = classUnderTest.sum(3);
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThatSumCalculatorReturn0() {
        SumCalculator classUnderTest = new SumCalculator();

        Assertions.assertThrows(Exception.class, () -> classUnderTest.sum(0), new IllegalArgumentException().toString());

    }
}
