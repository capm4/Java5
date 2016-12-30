package Shild.Chapter_9;

/**
 * Created by user on 27.12.2016.
 */
public class Excdemo5 {
    public static void main(String[] args) {
        final int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        final int[] denom = {2, 0, 4, 4, 0, 8};
        for (int count = 0; count < numer.length; count++) {
            try {
                System.out.println(numer[count] + " / " + denom[count] + " is " + numer[count] / denom[count]);
            }catch (ArrayIndexOutOfBoundsException exc) {
                System.out.println("No matching element found. Elem of Array is " + exc.getMessage());
            }catch (Throwable exc){
                System.out.println("Some exception occurred " + exc.getMessage());
            }
        }
    }
}
