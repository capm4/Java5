package Shild.Chapter_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by user on 31.12.2016.
 */
public class showFile {
    public static void main(String[] args) throws FileNotFoundException {
        int i;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("d://TEXT.txt");
            do {
                i = fin.read();
                if (i != -1) {
                    System.out.print((char) i);
                }
            } while (i != 1);
        }catch (FileNotFoundException e){
            System.out.println("File Not found.");
        }catch (IOException e) {
            System.out.println("Error reading file.");
        } finally {
            try {
                if (fin != null) {
                    fin.close();
                }
            }catch(IOException e){
            System.out.println("Error closing file.");
            }
         }
    }
}