package Module10.HM.HomeWork_10_2;

/**
 * Created by user on 30.12.2016.
 */
public class ExceptionString extends Exception {
    private String text;
    private Integer lengthExp;


    public ExceptionString(String text, Integer lengthExp) {
        this.text = text;
        this.lengthExp = lengthExp;
    }

    @Override
    public String toString() {
        return "Your text '"+text + "' char length too long then " + lengthExp;
    }
}
