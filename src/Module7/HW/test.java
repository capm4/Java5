package Module7.HW;

import Module7.HW.HomeWork_7_1.Currency;
import Module7.HW.HomeWork_7_1.Order;
import Module7.HW.HomeWork_7_1.User;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.*;

/**
 * Created by user on 04.12.2016.
 */
public class test {
    public static void main(String[] args) {

        List<String> StringList = new ArrayList<>();
        String as = "Worf";
        Random rng = new Random();
        for (Integer i = 0; i <= 15; i++) {
            char[] text = new char[5];
            for (int index = 0; index < 5; index++) {
                text[index] = as.charAt(rng.nextInt(as.length()));
            }
            StringList.add(new String(text));
        }
        System.out.println(StringList);
    }
}
