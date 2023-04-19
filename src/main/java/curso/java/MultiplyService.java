package curso.java;

public class MultiplyService {

    SumService sumService;
    DivisionService divisionService;

    public MultiplyService(SumService sumService, DivisionService divisionService) {
        this.sumService = sumService;
        this.divisionService = divisionService;
    }

    public int multiply(int op1, int op2) {
        return op1 * op2;
    }

    public int MultiplySum(int op1, int op2, int op3) {
        int resultado1 = multiply(op1, op2);
        return sumService.sum(resultado1, op3);
    }

    public int multiplyDivide(int op1, int op2, int op3) {
        int resultado = multiply(op1, op2);
        try {
            return divisionService.divide(resultado, op3);
        } catch (ArithmeticException e) {
            return Integer.MAX_VALUE;
        }
    }

}
