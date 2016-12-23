package Module3.Practick.Scaner;

import java.util.Scanner;

public class Scaner {
    public static void main(String[] args) {


        //NextInt();
        HasNext();
    }

    public static void NextInt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Print your name ");
        String str = scan.next();
        System.out.println("Your name is " + str);
        System.out.println("How old are you?");
        int year = scan.nextInt();
        System.out.println("You are " + year);
    }

    public static void HasNext(){
        String s = "Hello World! 3+3.0=6";

        // create a new scanner with the specified String Object
        Scanner scanner = new Scanner(s);

        // check if the scanner has a token
        System.out.println("" + scanner.hasNext());

        // print the rest of the string
        System.out.println("" + scanner.nextLine());

        // check if the scanner has a token after printing the line
        System.out.println("" + scanner.hasNext());

        // close the scanner
        scanner.close();
    }


}
