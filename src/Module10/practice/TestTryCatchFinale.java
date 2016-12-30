package Module10.practice;

/**
 * Created by user on 28.12.2016.
 */
public class TestTryCatchFinale {
    public static void main(String[] args) {
        System.out.println(1);
        try{
            System.out.println(2);
            if(true){throw new RuntimeException();}
            System.out.println(2);
        }catch (NullPointerException e){
            System.out.println(3);
            if(true){throw new RuntimeException();}
            System.out.println(3);
        }catch (Exception e){
            System.out.println(4);
            if(true){throw new RuntimeException();}
            System.out.println(4);
        }finally {
            System.out.println(5);
            if(true){throw new RuntimeException();}
            System.out.println(5);
        }
        System.out.println(6);
    }

}
