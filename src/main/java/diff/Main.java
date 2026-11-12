package diff;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        float f = 0;
        double d = 0;
        BigDecimal bigD = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++) {
            f += 0.1;
            d += 0.1;
            bigD = bigD.add(new BigDecimal("0.1"));

            System.out.println("f: " + f);
            System.out.println("d: " + d);
            System.out.println("bigD: " + bigD);
        }

            f = 0;
            d = 0;
            bigD = BigDecimal.ZERO;


            for (int i = 0; i < 1000; i++) {
                f += 19.99f;
                d += 19.99;
                bigD = bigD.add(new BigDecimal("19.99"));
            }

            System.out.println("1000 Iterations Later... ");
            System.out.println("f: " + f);
            System.out.println("d: " + d);
            System.out.println("bigD: " + bigD);


        }
    }

