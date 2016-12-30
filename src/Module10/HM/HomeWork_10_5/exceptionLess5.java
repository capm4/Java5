package Module10.HM.HomeWork_10_5;

/**
 * Created by user on 30.12.2016.
 */
public class exceptionLess5 extends Exception {
    Integer integer;

    public exceptionLess5(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "You integer less then " + integer ;
    }
}
