package Module2.HW;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;


public class HomeWork_2_3 {
    public static void main(String[] args)
            throws java.io.IOException {
        int withdrawal, i = 0;
        double balance;
        double[] MoneyBalance ={1050, 250, 1234, 1450, 90};
        String[] name = {"ALEX", "ANDERW", "ELLA", "OLGA", "DEMIAN"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String EnterName = scanner.nextLine().toUpperCase();

        while (!name[i].equals(EnterName)) {
            i++;
            if (i == name.length) {
                System.out.println("Your name wrong, type again: ");
                EnterName = scanner.nextLine().toUpperCase();
                i=0;
            }
        }

        System.out.println("How much cash you what: ");
        Scanner s = new Scanner(System.in);
        withdrawal = s.nextInt();
        balance = MoneyBalance[i];

        Bank(balance, withdrawal);
        scanner.close();
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
