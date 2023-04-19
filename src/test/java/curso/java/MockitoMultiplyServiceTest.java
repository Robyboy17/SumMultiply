package curso.java;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockitoMultiplyServiceTest {

     MultiplyService multiplyService;
     SumService sumService;
     DivisionService divisionService;

    @BeforeEach
    void setUp() {
        SumService sumService = mock(SumService.class);
        DivisionService divisionService = mock(DivisionService.class);
        multiplyService = new MultiplyService(sumService, divisionService);
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
        assertEquals(-50, result);
    }

    @Test
    void multiplySum_PositiveNumbers_ResultMultiplySum() {
        int op1 = 5;
        int op2 = 5;
        int op3 = 10;
        when(sumService.sum(25, op3)).thenReturn(35);

        int result = multiplyService.MultiplySum(op1, op2, op3);
        assertEquals(35, result);
    }

    @Test
    void multiplySum_PositiveNumbers2_ResultMultiplySum() {
        int op1 = 5;
        int op2 = -5;
        int op3 = 10;
        when(sumService.sum(-25, op3)).thenReturn(-15);

        int result = multiplyService.MultiplySum(op1, op2, op3);
        assertEquals(-15, result);
    }

    @Test
    void miltiplyDivide_Regular_CorrectResult() {
        int op1 = 4;
        int op2 = 16;
        int op3 = 10;
        when(divisionService.divide(64,op3)).thenReturn(6);

        int result = multiplyService.multiplyDivide(op1, op2, op3);
        assertEquals(6, result);
    }

    @Test
    void miltiplyDivide_DivisionByZero_ReturnInfinity() {
        int op1 = 4;
        int op2 = 16;
        int op3 = 0;
        when(divisionService.divide(64,op3)).thenThrow(ArithmeticException.class);

        int result = multiplyService.multiplyDivide(op1, op2, op3);
        assertEquals(6, result);
    }

}
