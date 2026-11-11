import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        double d = 0.1;
        BigDecimal bigD = BigDecimal.ZERO;

        double doublePointThree = 0.1 + 0.2;
        System.out.println(0.1+0.2);

        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");


        BigDecimal bigDecimalPointThree = a.add(b);
        System.out.println(a.add(b));

        System.out.print("are they .equals() " + bigDecimalPointThree.equals(doublePointThree));



    }
}
