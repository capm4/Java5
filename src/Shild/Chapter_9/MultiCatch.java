package Shild.Chapter_9;

/**
 * Created by user on 27.12.2016.
 */
public class MultiCatch {
    public static void main(String[] args) {
        final int a =88, b =0;
        int result, count =0;
        final char chrs[] = {'A', 'B','C'};
        for (; count< 2; count++){
            try{
                if (count == 0){
                    result = a/b;
                }
                else{
                    chrs[5] = 'X';
                }
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Exception caugth: " + e);
            }
        }
        System.out.println("After multi-catch");
    }
}
