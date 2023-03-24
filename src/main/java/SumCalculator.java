import org.junit.jupiter.api.BeforeEach;

public class SumCalculator {
    @BeforeEach
    public int sum(int n) {
        int result;
        if (n == 0) {
            throw new IllegalArgumentException();
        } else {
            result = 0;
            for (int i = 0; i <= n; i++) {
                result += i;
            }
        }
        return result;
    }
}
