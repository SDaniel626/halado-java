package hu.me;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;

class CalculatorTest {

    @Mock
    private Logger logger;

    private Calculator calculator;

    @BeforeEach
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        calculator = new Calculator(logger);
    }

    @Test
    void additionAssertTest() {
        // GIVEN
        final int a = 6;
        final int b = 5;

        // WHEN
        int result = calculator.addition(a,b);

        // THEN
        assertEquals(11,result);
    }

    @Test
    void subtractionAssertTest() {
        // GIVEN
        final int a = 6;
        final int b = 5;

        // WHEN
        int result = calculator.subtraction(a,b);

        // THEN
        assertEquals(1,result);
    }

    @Test
    void divideWellAssertTest() {
        // GIVEN
        final int a = 6;
        final int b = 5;

        // WHEN
        double result = calculator.divide(a,b);

        // THEN
        assertEquals(1.2,result);
    }

    @Test
    void divideWithZeroAssertTest() {
        // GIVEN
        final int a = 6;
        final int b = 0;

        // WHEN

        // THEN
        assertThrows(DivisionByZeroException.class, () -> calculator.divide(a,b));
    }

    @Test
    void multiplyAssertTest() {
        // GIVEN
        final int a = 6;
        final int b = 6;

        // WHEN
        int result = calculator.multiply(a,b);

        // THEN
        assertEquals(36,result);
        verify(logger).log("Multiply method was used");
    }

    @Nested
    class NestedVerifyTestClass {

        @Test
        void additionVerifyTest() {
            // GIVEN
            final int a = 6;
            final int b = 5;

            // WHEN
            int result = calculator.addition(a, b);

            // THEN
            verify(logger).log("Addition method was used");
        }

        @Test
        void subtractionVerifyTest() {
            // GIVEN
            final int a = 6;
            final int b = 5;

            // WHEN
            int result = calculator.subtraction(a, b);

            // THEN
            verify(logger).log("Subtraction method was used");
        }

        @Test
        void divideWellVerifyTest() {
            // GIVEN
            final int a = 6;
            final int b = 5;

            // WHEN
            double result = calculator.divide(a, b);

            // THEN
            verify(logger).log("Divide method was used");
        }

        @Test
        void divideWithZeroVerifyTest() {
            // GIVEN
            final int a = 6;
            final int b = 0;

            // WHEN

            // THEN
            assertThrows(DivisionByZeroException.class, () -> calculator.divide(a, b));
            verify(logger).log("Divide method was used with the intent to divide by zero");
        }

        @Test
        void multiplyVerifyTest() {
            // GIVEN
            final int a = 6;
            final int b = 6;

            // WHEN
            int result = calculator.multiply(a, b);

            // THEN
            assertEquals(36, result);
            verify(logger).log("Multiply method was used");
        }

    }

    @ParameterizedTest
    @CsvSource({"2,3,5","5,7,12","0,0,0"})
    void parametrizedTestOfAddition(int a, int b, int expectedResult){
        // GIVEN


        // WHEN
        int result = calculator.addition(a,b);

        // THEN
        assertEquals(expectedResult, result, "Addition result is incorrect");
    }
}