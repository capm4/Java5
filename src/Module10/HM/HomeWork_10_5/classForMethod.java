package Module10.HM.HomeWork_10_5;

/**
 * Created by user on 30.12.2016.
 */
public class classForMethod {
    public static void cathException(Integer integer) throws exceptionLess5, exceptionOdd, expresionEven {
        try{
            if (integer < 5){
                throw new exceptionLess5(integer);
            }
            else if ((integer%2) != 0){
                throw new exceptionOdd(integer);
            }
            else if (integer%2 == 0){
                throw new expresionEven(integer);
            }
        }catch (exceptionLess5 | exceptionOdd  | expresionEven e){
            System.out.println(e);
        }
    }
}
