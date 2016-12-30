package Shild.Chapter_9;

class ExcTest1{
    static void genException(){
        final int nums[] = new int[4];
        final int numForAr = 10;
        System.out.println("Before exception is generated.");
        nums[7] = numForAr;
        System.out.println("this won't be displayed");
    }
}

public class UseThrowableMethods {
    public static void main(String[] args) {
        try{
            ExcTest1.genException();
        }catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Standard message is : ");
            System.out.println(exc);
            System.out.println("\nStack trace: ");
            exc.printStackTrace();
        }
        System.out.println("After catch statement.");
    }
}
