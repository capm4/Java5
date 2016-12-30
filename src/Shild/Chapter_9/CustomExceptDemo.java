package Shild.Chapter_9;

class NonIntResultException extends Exception{
    int n, d;

    public NonIntResultException(int n, int d) {
        this.n = n;
        this.d = d;
    }

    @Override
    public String toString() {
        return "Result of " +
                 + n +
                "/" + d +
                " is non-integer";
    }
}
public class CustomExceptDemo {
    public static void main(String[] args)
            throws NonIntResultException {
        int numer[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < numer.length; i++){
            try{
                if ((numer[i]%2) != 0)
                    throw new NonIntResultException(numer[i], denom[i]);
                System.out.println(numer[i] + " / "+ denom[i]+ " is "+numer[i]/denom[i]);
            }catch (ArithmeticException e){
                System.out.println("can't divide by Zero!");
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No matching element found.");
            }
            catch (NonIntResultException e){
                System.out.println(e);
            }
        }

    }
}
