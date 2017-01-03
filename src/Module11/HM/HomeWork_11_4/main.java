package Module11.HM.HomeWork_11_4;

import Module11.HM.HomeWork_11_1.GreatAndWriteFile;
import Module11.HM.HomeWork_11_3.classfileContentMerger;

import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_NAME_FOR_HM11_1;
import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_TYPE_FOR_HM1;
import static Module11.HM.HomeWork_11_1.varForHM_11.TEXT_FOR_HM1;

/**
 * Created by user on 03.01.2017.
 */
public class main {
    public static void main(String[] args) {
        GreatAndWriteFile greatAndWriteFile = new GreatAndWriteFile();
        classCheckWord  classCheckWord  = new classCheckWord ();
        greatAndWriteFile.greatFile(FILE_NAME_FOR_HM11_1, FILE_TYPE_FOR_HM1, TEXT_FOR_HM1 );
        classCheckWord.checkWordWithTry_with_resources("with");
        classCheckWord.checkWordWithUsualTry("to");
    }
}
