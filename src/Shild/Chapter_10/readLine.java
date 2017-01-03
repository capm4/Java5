package Shild.Chapter_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 01.01.2017.
 */
public class readLine {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to exit");
        do{
            str = br.readLine();
            System.out.println(str);
        }while (!(str.toLowerCase().equals("stop")));
    }

}
