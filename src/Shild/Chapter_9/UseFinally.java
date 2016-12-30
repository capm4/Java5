package Shild.Chapter_9;

/**
 * Created by user on 27.12.2016.
 */
public class UseFinally {
    public static void genException(final int what){
        int t;
        final int nums[] = new int[2];
        System.out.println("Receiving "+what);
        try{
            switch(what){
                case 0:
                    t = 10/what;
                    break;
                case 1:
                    nums[4] =4;
                    break;
                case 2:
                    return;
            }
        }
        catch(ArithmeticException exc){
            System.out.println("Can't divide by zero!" + exc);
            return;
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("No matching element found.");
        }
        finally {
                System.out.println("leaving try");
        }
    }
}
class FinallyDemo{
    public static void main(String[] args) {
        for (int count =0; count<3; count++ ){
            UseFinally.genException(count);
            System.out.println();
        }
    }
}