package Module10.HM.HomeWork_10_1;

/**
 * Created by user on 30.12.2016.
 */
public class main {
    public static void main(String[] args) {
        try{
            System.out.println("Start the try");
            if (true) {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Catch Exeption " + e);
        }finally {
            System.out.println("Finish");
        }

    }
}
