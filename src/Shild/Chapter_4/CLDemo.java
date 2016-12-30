package Shild.Chapter_4;

/**
 * Created by user on 24.12.2016.
 */
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("There are "+ args.length + " command-line arguments");
        System.out.println("they are: ");
        for (int i =0; i<args.length; i++){
            System.out.println("args["+ i+"]: "+args[i]);
        }
    }
}
