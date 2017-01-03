package Module11.HM.HomeWork_11_2;

import Module11.HM.HomeWork_11_1.GreatAndWriteFile;
import Module11.HM.HomeWork_11_1.readTheFile;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_NAME_FOR_HM11_2;
import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_TYPE_FOR_HM1;

/**
 * Created by user on 03.01.2017.
 */
public class contentReplacer {
    public static Map<String, String> fileContentReplacer (String fileName, String fileType) {
        Map<String, String> map;
        readTheFile readTheFile = new readTheFile();
        map = readTheFile.replacer(FILE_NAME_FOR_HM11_2, FILE_TYPE_FOR_HM1);
        try (BufferedWriter fileWriter = new BufferedWriter( new FileWriter(fileName+fileType))){
            fileWriter.write(map.get("fileForHM_1AfterReplace"));
            fileWriter.close();
        }catch (IOException e){
            System.out.println("I/O Error : " + e);
        }
        return map;
    }
}
