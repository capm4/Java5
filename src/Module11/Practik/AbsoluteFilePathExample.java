package Module11.Practik;

import java.io.File;

/**
 * Created by user on 01.01.2017.
 */
public class AbsoluteFilePathExample {
    public static void main(String[] args) {
        File file =new File("d:\\runJava.bat");
        System.out.println("Path : " + file.getAbsolutePath());
    }
}
