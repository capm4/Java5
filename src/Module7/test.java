package Module7;

import java.util.*;

/**
 * Created by user on 03.12.2016.
 */
public class test {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("aaa");
        set.add("ccc");
        set.add("bbb");
        set.add("aaa");
        set.remove("ccc");

        List<String> list = new ArrayList<>(set);
        list.add("bbb");

        System.out.println(list);
    }
}
