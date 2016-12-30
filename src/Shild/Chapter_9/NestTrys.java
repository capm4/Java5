package Shild.Chapter_9;

/**
 * Created by user on 27.12.2016.
 */
public class NestTrys {
    public static void main(String[] args) {
        final int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        final int[] denom = {2, 0, 4, 4, 0, 8};
        try {
            for (int count = 0; count < numer.length; count++) {
                try {
                    System.out.println(numer[count] + " / " + denom[count] + " is " + numer[count] / denom[count]);
                } catch (ArithmeticException exc) {
                    System.out.println("can't divide by zoro! " + exc.getMessage());
                }
            }
        } catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("No matching element fount " + exc.getMessage());
            System.out.println("Fatal error - program terminated.");
        }
    }
}


