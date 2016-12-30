package Shild.Chapter_9;

/**
 * Created by user on 27.12.2016.
 */
public class ThrowsDemo {
    final public static char prompt(final String enterString)throws java.io.IOException{
        System.out.println(enterString + ": ");
        return (char) System.in.read();
    }

    public static void main(String[] args) {
        char charBox;
        try{
            charBox = prompt("Enter a letter");
        }
        catch (java.io.IOException exc){
            System.out.println("I/O exception occurred.");
            charBox = 'X';
        }
        System.out.println("You pressed " + charBox);
    }
}
