package Shild.Chapter_10;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by user on 01.01.2017.
 */
public class ktoD {
    public static void main(String[] args) {
        String string;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter texy ('stop' to quit)");
        try(FileWriter fw = new FileWriter("d://TEXT.txt")){
            do{
                System.out.println(": ");
                string = br.readLine();
                if(string.toLowerCase().compareTo("stop") == 0){
                    break;
                }
                string = string + "\r\n";
                fw.write(string);
            }while(string.toLowerCase().compareTo("stop") != 0);
        }catch (IOException e){
            System.out.println("Some Error " + e);
        }
    }
}
