package Module11.Practik;

import java.io.File;

/**
 * Created by user on 01.01.2017.
 */
public class DeleteFileExample {
    public static void main(String[] args)
    {
        try{

            File file = new File("c:\\text.txt");
            file.createNewFile();
            if (file.exists()) {
                System.out.println("File create");
            }
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete operation is failed.");
            }

        }catch(Exception e){

            e.printStackTrace();

        }

    }
}
