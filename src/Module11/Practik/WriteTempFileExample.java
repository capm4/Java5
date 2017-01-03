package Module11.Practik;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by user on 02.01.2017.
 */
public class WriteTempFileExample {
    public static void main(String[] args)
    {

        try{

            //create a temp file
            File temp = File.createTempFile("d://newfile1", "tmp");

            //write it
            BufferedWriter bw = new BufferedWriter(new FileWriter(temp));
            bw.write("This is the temporary file content");
            bw.close();

            System.out.println("Done");

        }catch(IOException e){

            e.printStackTrace();

        }

    }
}

