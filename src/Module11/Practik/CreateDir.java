package Module11.Practik;

import java.io.File;

/**
 * Created by user on 01.01.2017.
 */
public class CreateDir {
    public static void main(String[] args) {
        String dirname = "d:/name";
        File d = new File(dirname);

        // Create directory now.
        d.mkdirs();
    }
}
