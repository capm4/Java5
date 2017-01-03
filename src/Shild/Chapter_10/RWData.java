package Shild.Chapter_10;

import java.io.*;

/**
 * Created by user on 31.12.2016.
 */
public class RWData {
    public static void main(String[] args) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        try(DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("d://TEST.txt"))){
            System.out.println("Writing " + i);
            dataOut.writeInt((byte)i);
            System.out.println("Writing " + d);
            dataOut.writeDouble(d);
            System.out.println("Writing " + b);
            dataOut.writeBoolean(b);
            System.out.println("Writing " + 12.2 * 7.4);
            dataOut.writeDouble(12.2*7.4);

        }catch (IOException e){
            System.out.println("Write error.");
            return;
        }
        System.out.println();
        try(DataInputStream dataIn = new DataInputStream(new FileInputStream("d://toWrite.txt"))){
            i = dataIn.readInt();
            System.out.println("Reading " + i);
            d = dataIn.readDouble();
            System.out.println("Reading " + d);
            b = dataIn.readBoolean();
            System.out.println("Reading " + b);
            d = dataIn.readDouble();
            System.out.println("Readinf "+  d);
        }catch (IOException e){
            System.out.println("Read error.");
        }
    }
}
