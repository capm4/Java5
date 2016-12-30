package Shild.Chapter_9;

class ExcTest{
    static void genExeption(){
        final int num[] = new int [4];
        final  int numForAr = 10;
        System.out.println("Before exception is generated.");
        num[7] = numForAr;
        System.out.println("This won't be displayed");
    }
}

public class ExcDemo2 {
    public static void main(String[] args) {
        try{
            ExcTest.genExeption();
        }
        catch (ArrayIndexOutOfBoundsException exc){
            System.out.println("Index out-of-bounds!");
        }
        System.out.println("After catch statement");
    }
}
