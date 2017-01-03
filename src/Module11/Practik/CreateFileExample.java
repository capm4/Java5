package Module11.Practik;

import java.io.File;
import java.io.IOException;

/**
 * Created by user on 01.01.2017.
 */
public class CreateFileExample {
    public static void main( String[] args )
    {
        try {

            File file = new File("d://anewfile1.txt");

            if (file.createNewFile()){
                System.out.println("File is created!");
            }else{
                System.out.println("File already exists.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
