package Module2.HW;

import java.util.Scanner;


public class HomeWork_2_4 {
    public static void main(String[] args)
            throws java.io.IOException {
        int withdrawal, i = 0;
        double balance;
        double[] MoneyBalance ={1200, 250, 2000, 500, 3200};
        String[] name = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String EnterName = scanner.nextLine().toUpperCase();
        String ToCaseName = EnterName.substring(0,1).toUpperCase() + EnterName.substring(1).toLowerCase();

        while (!name[i].equals(ToCaseName)) {
            i++;
            if (i == name.length) {
                System.out.println("Your name wrong, type again: ");
                EnterName = scanner.nextLine().toUpperCase();
                ToCaseName = EnterName.substring(0,1).toUpperCase() + EnterName.substring(1).toLowerCase();
                i=0;
            }
        }

        System.out.println("How much cash you what to refill: ");
        Scanner s = new Scanner(System.in);
        withdrawal = s.nextInt();
        balance = MoneyBalance[i];
        String AccoundName = name[i];

        Bank(balance, withdrawal, AccoundName);
        scanner.close();
    }

    private static void Bank (double balance, int refill, String ToCaseName) {
        double output = balance + refill;
        System.out.println("\nOutput \n");
        System.out.print(ToCaseName + " ");
        System.out.println(output);

    }



}
