package Shild.Chapter_10;

import java.io.IOException;

/**
 * Created by user on 31.12.2016.
 */
public class readBytes {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];
        System.out.println("Enter some chapters");
        System.in.read(data);
        System.out.println("You entered: ");
        for (int count = 0; count < data.length; count++){
            System.out.print((char) data[count]);
        }
    }
}
