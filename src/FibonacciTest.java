import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {
        @Test
        public void evaluatesExpression() {
            Fibonacci fibonacci = new Fibonacci();
            assertEquals(13, fibonacci.calculate(7));
        }
}

