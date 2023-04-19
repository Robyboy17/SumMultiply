package curso.java;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyServiceTest {

    static MultiplyService multiplyService;

    @BeforeAll
    static void setUp() {
        SumService sumService = new SumService();
        multiplyService = new MultiplyService(sumService, null);
    }

    @Test
    void multiply_PositiveNumbers_ResultMultiply() {
        int op1 = 5;
        int op2 = 5;

        int result = multiplyService.multiply(op1, op2);
        assertEquals(25,result);
    }

    @Test
    void multiply_NegativeNumbers_Resultmultiply() {
        int op1 = -10;
        int op2 = 5;

        int result = multiplyService.multiply(op1, op2);
        assertEquals(-50,result);
    }

    @Test
    void multiplySum_PositiveNumbers_ResultMultiplySum() {
        int op1 = 5;
        int op2 = 5;
        int op3 = 10;

        int result = multiplyService.MultiplySum(op1, op2, op3);
        assertEquals(35,result);
    }

    @Test
    void multiplySum_PositiveNumbers2_ResultMultiplySum() {
        int op1 = 5;
        int op2 = -5;
        int op3 = 10;

        int result = multiplyService.MultiplySum(op1, op2, op3);
        assertEquals(-15,result);
    }
}
