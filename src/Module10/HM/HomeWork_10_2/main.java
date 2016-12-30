package Module10.HM.HomeWork_10_2;

/**
 * Created by user on 30.12.2016.
 */
public class main {
    public static void main(String[] args){
        String text = "Hello World";
        Integer lengthExp = 5;
        try {
            if (text.length() > lengthExp) throw new exceptionString(text, lengthExp);
        }catch (exceptionString e){
            System.out.println(e);
        }
    }
}
