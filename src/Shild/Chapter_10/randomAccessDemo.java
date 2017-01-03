package Shild.Chapter_10;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by user on 01.01.2017.
 */
public class randomAccessDemo {
    public static void main(String[] args) {
        Double data[] = {19.4, 10.1, 123.8, 33.0, 87.9, 74.25 };
        Double d;
        try(RandomAccessFile raf = new RandomAccessFile("d://ran.dat" ,"rw")){
            for(int count = 0; count < data.length; count++){
                raf.writeDouble(data[count]);
            }
            raf.seek(0);
            d = raf.readDouble();
            System.out.println("first value is " + d);
            raf.seek(8);
            d = raf.readDouble();
            System.out.println("Second value is " + d);
            raf.seek(8*3);
            d = raf.readDouble();
            System.out.println("Fourth value is " + d);
            System.out.println();
            System.out.println("Here ios every other value: ");
            for (int count = 0; count < data.length; count +=2){
                raf.seek(8*count);
                d = raf.readDouble();
                System.out.print(d + " ");
            }
        }catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
