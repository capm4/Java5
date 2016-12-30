package Module10.HM.HomeWork_10_3;

/**
 * Created by user on 30.12.2016.
 */
public class main {
    public static void main(String[] args) {
        try{
            String text;
            text = null;
            text.toString();
        }catch (NullPointerException e){
            System.out.println("Your string with problem, it's includes : "+ e.getMessage());
        }
    }
}
