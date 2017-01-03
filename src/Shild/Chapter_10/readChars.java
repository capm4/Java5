package Shild.Chapter_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 01.01.2017.
 */
public class readChars {
    public static void main(String[] args) throws IOException{
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter charcters, period to quit .");
        do {
            c = (char) br.read();
            System.out.println(c);
        }while (c != '.');
    }
}
