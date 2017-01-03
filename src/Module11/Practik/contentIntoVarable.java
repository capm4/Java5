package Module11.Practik;

import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * Created by user on 01.01.2017.
 */
public class contentIntoVarable {
    public static void main(String[] args) {
        try{

            DataInputStream dis =
                    new DataInputStream (
                            new FileInputStream("d:\\TEXT.txt"));

            byte[] datainBytes = new byte[dis.available()];
            dis.readFully(datainBytes);
            dis.close();

            String content = new String(datainBytes, 0, datainBytes.length);

            System.out.println(content);

        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
