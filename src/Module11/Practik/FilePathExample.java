package Module11.Practik;

import java.io.File;
import java.io.IOException;

/**
 * Created by user on 01.01.2017.
 */
public class FilePathExample {
    public static void main(String[] args) {
        try {

            String filename = "newFile.txt";
            String workingDirectory = System.getProperty("d://");

            //****************//

            File file = new File(workingDirectory, filename);

            //****************//

            System.out.println("Final filepath : " + file.getAbsolutePath());
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                System.out.println("File is already existed!");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
