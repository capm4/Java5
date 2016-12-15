package Module8;

import Module7.HW.HomeWork_7_1.*;

import java.util.*;
import java.util.Currency;

/**
 * Created by user on 13.12.2016.
 */
public class Test {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a1");
        list.add("a2");
        list.add("a3");
        list.add("a4");
        list.add("a1");
        int s1 =(int) list.stream().filter("a1"::equals).count();
        System.out.println(s1);
    }
}
