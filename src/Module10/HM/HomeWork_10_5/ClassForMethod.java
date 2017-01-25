package Module10.HM.HomeWork_10_5;

/**
 * Created by user on 30.12.2016.
 */
public class ClassForMethod {
    public static void CathException(Integer integer) throws ExceptionLess5, ExceptionOdd, ExpresionEven {
        try{
            if (integer < 5){
                throw new ExceptionLess5(integer);
            }
            else if ((integer%2) != 0){
                throw new ExceptionOdd(integer);
            }
            else if (integer%2 == 0){
                throw new ExpresionEven(integer);
            }
        }catch (ExceptionLess5 | ExceptionOdd | ExpresionEven e){
            System.out.println(e);
        }
    }
}
