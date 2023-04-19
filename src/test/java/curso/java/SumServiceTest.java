package curso.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumServiceTest {

    @Test
    void sum_PositiveNumbers_ResultSum() {
        int op1 = 4;
        int op2 = 16;

        SumService sumService = new SumService();

        int result = sumService.sum(op1,op2);

        assertEquals(20,result);
    }

    @Test
    void sum_NegativeNumber_ResultSum() {
        int op1 = 4;
        int op2 = -16;

        SumService sumService = new SumService();

        int result = sumService.sum(op1,op2);

        assertEquals(-12,result);
    }
}
