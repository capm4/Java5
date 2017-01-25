package Module10.HM.HomeWork_10_5;

/**
 * Created by user on 30.12.2016.
 */
public class ExpresionEven extends Exception {
    private Integer integer;

    public ExpresionEven(Integer integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "Your integer isn't even " + integer ;
    }
}
