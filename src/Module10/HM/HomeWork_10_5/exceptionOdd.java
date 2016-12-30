package Module10.HM.HomeWork_10_5;

/**
 * Created by user on 30.12.2016.
 */
public class exceptionOdd extends Exception {
    Integer integer;

    public exceptionOdd(Integer integer){
        this.integer = integer;
    }

    @Override
    public String toString() {
        return "Your integer isn't odd " + integer ;
    }
}
