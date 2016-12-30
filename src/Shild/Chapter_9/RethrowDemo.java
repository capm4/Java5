package Shild.Chapter_9;

class Rethrow{
    public  static  void genException(){
        final int[] numer = {4, 8, 16, 32, 64, 128, 256, 512};
        final int[] denom = {2, 0, 4, 4, 0, 8};
        for (int count = 0; count < numer.length; count++) {
            try {
                System.out.println(numer[count] + " / " + denom[count] + " is " + numer[count] / denom[count]);
            }catch (ArithmeticException exc) {
                System.out.println("can't divide by Zero! " + exc.getMessage());
            }catch (ArrayIndexOutOfBoundsException exc){
                System.out.println("No matching element found. " + exc.getMessage());
                throw exc;
            }
        }
    }
}
public class RethrowDemo {
    public static void main(String[] args) {
        try{
            Rethrow.genException();
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Fatal erroe - " + "program terminated.");
        }
    }

}
