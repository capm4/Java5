package Module2.Practick;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args)
            throws java.io.IOException {
        int withdrawal, i = 0;
        double balance;
        double[] MoneyBalance ={1050, 250, 1234, 1450, 90};
        String[] name = {"ALEX", "ANDERW", "ELLA", "OLGA", "DEMIAN"};
        int[] pin = {1456, 4321, 1001, 1111, 1212};
        int[] operation = {1,2,3};


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
        String ToCaseName = EnterName.substring(0,1).toUpperCase() + EnterName.substring(1).toLowerCase();

        System.out.println("Enter pin-code: ");
        Scanner c = new Scanner(System.in);
        int pinCode = c.nextInt();

        if (pin[i] != pinCode) {
            System.out.println("Your pin wrong, type again: ");
            Scanner s = new Scanner(System.in);
            pinCode = s.nextInt();
            i=0;
        }


        balance = MoneyBalance[i];

        System.out.println("Choose the operation: ");
        System.out.println("1. Take money");
        System.out.println("2. Refill money");
        System.out.println("3. Cancel");

        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();

        while (!(operation[i] == choice)) {
            i++;
            if (i == operation.length) {
                System.out.println("Your choice wrong, type again: ");
                Scanner h = new Scanner(System.in);
                choice = h.nextInt();
                i=0;
            }

        }

        System.out.println(choice);
        switch (choice) {
            case 1:
                System.out.println("How much cash you what: ");
                Scanner j = new Scanner(System.in);
                withdrawal = j.nextInt();
                Issue(balance, withdrawal);
                break;
            case 2:
                System.out.println("How much cash you what to refill: ");
                Scanner k = new Scanner(System.in);
                withdrawal = k.nextInt();
                Refill(balance, withdrawal, ToCaseName);
                break;
            case 3:
                break;

        }

        scanner.close();
    }




    private static void Issue (double balance, int withdrawal) {
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

    private static void Refill (double balance, int refill, String ToCaseName) {
        double output = balance + refill;
        System.out.println("\nOutput \n");
        System.out.print(ToCaseName + " ");
        System.out.println(output);

    }



}
