package Shild.Chapter_10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by user on 31.12.2016.
 */
public class copyFile {
    public static void main(String[] args) throws FileNotFoundException {
        int i;
        FileInputStream fin;
        FileOutputStream fout = null;
        try{
            fin = new FileInputStream("d://TEXT.txt");
        }catch (FileNotFoundException e){
            System.out.println("Input File Not Found");
            return;
        }
        try{
            fout = new FileOutputStream("d://toWrite.txt");
        }catch (FileNotFoundException e){
            System.out.println("Error Opening Output File");
            try{
                fin.close();
            }catch (IOException e2) {
                System.out.println("Error closing input file.");
            }
        }
        try{
            do{
                i = fin.read();
                if (i != -1){
                    fout.write(i);
                }
            }while (i != -1);
        }catch (IOException e){
            System.out.println("File Error");
        }
        try{
            fin.close();
        }catch (IOException e){
            System.out.println("Error closing input file.");
        }
        try{
            fout.close();
        }catch (IOException e){
            System.out.println("Error closung output file.");
        }
    }
}
