package Module10.HM.HomeWork_10_4;

/**
 * Created by user on 30.12.2016.
 */
public class classForMethod {
    public static void g(){
        throw new ArithmeticException();
    }
    public static void f(){
        try{
            g();
        }catch (ArithmeticException e){
            System.out.println("We are in method f and we have excaption " + e);
            throw new ArrayIndexOutOfBoundsException();
        }finally {
            System.out.println("The end");
        }
    }
}
