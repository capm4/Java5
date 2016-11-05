package Module2.HW;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class HomeWork_2_2 {
    public static void main(String[] args)
            throws java.io.IOException {
        int withdrawal;
        double balance = 100;
        System.out.println("How much cash you what: ");

        java.util.Scanner s = new java.util.Scanner(System.in);
        withdrawal = s.nextInt();

        Bank(balance, withdrawal);
    }


    public static void Bank (double balance, int withdrawal) {
        double comision = withdrawal * 0.05;
        double comisionF = new BigDecimal(comision).setScale(2, RoundingMode.UP).doubleValue();
        double output = balance - (comision + withdrawal);

        System.out.println("Input \n");
        System.out.println("balance = " + balance);
        System.out.println("withdrawal = " + withdrawal + "\n");
        System.out.println("Output");

        if (output > 0) System.out.println("OK " + comisionF + " " + output);
        else System.out.println("NO");
    }
}

