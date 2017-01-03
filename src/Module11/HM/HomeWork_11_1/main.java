package Module11.HM.HomeWork_11_1;


import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_NAME_FOR_HM11_1;
import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_TYPE_FOR_HM1;
import static Module11.HM.HomeWork_11_1.varForHM_11.TEXT_FOR_HM1;

/**
 * Created by user on 03.01.2017.
 */
public class main {
    public static void main(String[] args) {
        readTheFile readTheFile = new readTheFile();
        GreatAndWriteFile greatAndWriteFile = new GreatAndWriteFile();
        greatAndWriteFile.greatFile(FILE_NAME_FOR_HM11_1, FILE_TYPE_FOR_HM1, TEXT_FOR_HM1 );
        readTheFile.replacer(FILE_NAME_FOR_HM11_1, FILE_TYPE_FOR_HM1);
    }
}
