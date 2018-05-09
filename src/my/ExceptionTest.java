package my;

public class ExceptionTest {

    static void div1(int a, int b) throws ArithmeticException {
        if (b != 0) {
            System.out.println(a / b);
        } else {
            throw new ArithmeticException("Division by Zero (1)");
        }

    }

    static void div2(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Division by Zero (2)");
        } catch (Exception e) {
            System.out.println("Unexpected Division by Zero (2)");
        }


    }

    public static void main(String[] args) {
        try {
            div1(5, 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        div1(15, 3);
        div2(5, 0);
        div2(15, 3);

    }
}
