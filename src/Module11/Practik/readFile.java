package Module11.Practik;

import java.io.*;

/**
 * Created by user on 01.01.2017.
 */
public class readFile {
    public static void main(String[] args) {
        try (BufferedReader f = new BufferedReader( new FileReader("d://TEXT.txt"))){
            System.out.println(f);
        }catch (IOException e){
            System.out.println("I/O Error : " + e);
        }

    }
}
