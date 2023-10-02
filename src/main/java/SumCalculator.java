import org.junit.jupiter.api.BeforeEach;

public class SumCalculator {

    public int sum(int m) {
        int result;
        if (m == 0) {
            throw new IllegalArgumentException();
        } else {
            result = 0;
            for (int i = 0; i <= m; i++) {
                result += i;
            }
        }
        return result;
    }
}
