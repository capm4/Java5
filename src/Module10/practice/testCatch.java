package Module10.practice;

class Test extends Exception{}
public class testCatch {
    public static void main(String[] args) {
        try{
            throw new Test();
        }catch (Test t){
            System.out.println(1);
        }finally {
                System.out.println(2);
        }
    }
}
