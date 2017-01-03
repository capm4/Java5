package Shild.Chapter_10;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by user on 01.01.2017.
 */
public class compFiles {
    public static void main(String args[]){
        int i = 0, j = 0;
        try(FileInputStream f1 = new FileInputStream("d://toWrite.txt");
                FileInputStream f2 = new FileInputStream("d://TEXT.txt")){
                do{
                   i = f1.read();
                   j = f2.read();
                   if (i != j) {
                       break;
                        }
                }while((i !=-1) && (j !=-1));
                if(i !=j){
                    System.out.println("Feles differ.");
                }else{
                    System.out.println("Files are the same.");
                }
        }catch(IOException e){
            System.out.println("I/O Error: " + e);
        }
    }
}
