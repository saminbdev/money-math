package Static;

import java.util.Scanner;

public class Utils {

    private Scanner myScanner = new Scanner(System.in);

    public static double promptforDouble(String message) {
        boolean done = false;
        double result = 0;

        do {
            System.out.println(message);
            String input = myScanner.nextLine();

            try {
                result = Double.parseDouble(input);
                done = true;
            } catch (NumberFormatException nfe) {
                System.err.println("Invalid number format, try again.");
            }
        }  while (!done) ;
           return result;
    }
}

