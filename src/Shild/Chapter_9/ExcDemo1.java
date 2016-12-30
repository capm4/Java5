package Shild.Chapter_9;

/**
 * Created by user on 27.12.2016.
 */
public class ExcDemo1 {
    public static void main(String[] args) {
        final int [] nums = new int [4];
        final int numForAr = 10;
        try{
            System.out.println("Before exeption is generated");
            nums[4] = numForAr;
            System.out.println("this won't be displayed");
        }
        catch (ArithmeticException e){
            System.out.println("Index out-of-bounds "+ e);
        }
        System.out.println("After catch statement.");
    }
}
