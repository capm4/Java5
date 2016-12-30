package Shild.Chapter_9;

import Module3.HW.HomeWork_3_2.Arithmetic;

/**
 * Created by user on 27.12.2016.
 */
public class ExcDemo3 {
    public static void main(String[] args) {
        final int[] numer = {4, 8, 16, 32, 64, 128};
        final int[] denom = {2, 0, 4, 4, 0, 8};
        for (int count = 0; count < numer.length; count++) {
            try {
                System.out.println(numer[count] + " / " + denom[count] + " is " + numer[count] / denom[count]);
            } catch (ArithmeticException exc) {
                System.out.println("Can't divide by Zero!"+exc.toString());
            }
        }
    }
}
