package Module11.HM.HomeWork_11_3;

import Module11.HM.HomeWork_11_1.GreatAndWriteFile;
import Module11.HM.HomeWork_11_2.contentReplacer;

import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_NAME_FOR_HM11_3;
import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_TYPE_FOR_HM1;
import static Module11.HM.HomeWork_11_1.varForHM_11.TEXT_FOR_HM1;

/**
 * Created by user on 03.01.2017.
 */
public class main {
    public static void main(String[] args) {
        GreatAndWriteFile greatAndWriteFile = new GreatAndWriteFile();
        classfileContentMerger classfileContentMerger = new classfileContentMerger();
        greatAndWriteFile.greatFile(FILE_NAME_FOR_HM11_3, FILE_TYPE_FOR_HM1, TEXT_FOR_HM1 );
        classfileContentMerger.fileContentMerger(FILE_NAME_FOR_HM11_3, FILE_TYPE_FOR_HM1);
    }
}
