package Module11.HM.HomeWork_11_3;

import Module11.HM.HomeWork_11_1.readTheFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_NAME_FOR_HM11_3;
import static Module11.HM.HomeWork_11_1.varForHM_11.FILE_TYPE_FOR_HM1;

/**
 * Created by user on 03.01.2017.
 */
public class classfileContentMerger {
    public static Map<String, String> fileContentMerger(String fileName, String fileType){
        Map<String, String> map;
        readTheFile readTheFile = new readTheFile();
        map = readTheFile.replacer(FILE_NAME_FOR_HM11_3, FILE_TYPE_FOR_HM1);
        try (PrintWriter fileWriter = new PrintWriter(new BufferedWriter( new FileWriter(fileName+fileType, true)))){
            fileWriter.append(map.get("fileForHM_1AfterReplace"));
            fileWriter.close();
        }catch (IOException e){
            System.out.println("I/O Error : " + e);
        }
        return map;
    }
}
