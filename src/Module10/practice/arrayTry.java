package Module10.practice;

public class arrayTry {
    public static void main(String[] args) {
        try{
            int a[]= {1,2,3,4};
            for (int i =1; i<=4; i++){
                System.out.println("a["+i+"}="+a[i]+"\n");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("erroe = "+e);
        }catch (Exception e){
            System.out.println(11);
        }
    }
}
