package Shild.Chapter_10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by user on 01.01.2017.
 */
public class DtoS {
    public static void main(String[] args) {
        String string;
        try(BufferedReader br = new BufferedReader(new FileReader("d://TEXT.text"))){
            while((string = br.readLine()) != null ){
                System.out.println(string);
            }
        }catch (IOException e){
            System.out.println("I/O Error " + e);
        }
    }
}
