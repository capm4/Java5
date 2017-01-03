package Shild.Chapter_10;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

/**
 * Created by user on 31.12.2016.
 */
public class copyFileCompact {
    public static void main(String[] args) {
        int i;
        try(Reader fin = new BufferedReader(
                new InputStreamReader(new FileInputStream("d://TEXT.txt"),"UTF-32")); Writer fout = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream("d://ToWrite.txt"), "UTF-32"))){
            do{
                i = fin.read();
                if (i != -1){
                    fout.write(i);
                }
            }while (i != -1);
        }catch (IOException e){
            System.out.println("File Error");
        }
    }
}
