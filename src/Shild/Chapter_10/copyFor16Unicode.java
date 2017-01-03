package Shild.Chapter_10;

import java.io.*;

/**
 * Created by user on 01.01.2017.
 */
public class copyFor16Unicode {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader in = null;
        FileWriter out = null;

        try {
            in = new FileReader("d://TEXT.txt");
            out = new FileWriter("d://toWrite.txt");

            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
