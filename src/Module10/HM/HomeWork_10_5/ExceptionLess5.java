package Module10.HM.HomeWork_10_5;

/**
 * Created by user on 30.12.2016.
 */
public class ExceptionLess5 extends Exception {
    private Integer integer;

    protected ExceptionLess5(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "You integer less then " + integer ;
    }
}
