package Module11.Practik;

import java.io.UnsupportedEncodingException;
import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by user on 02.01.2017.
 */
public class App00 {
    public static void main(String[] args) throws Exception {
//        System.out.println("A".getBytes().length);
//        System.out.println("A".getBytes("UTF-16").length);
//        System.out.println("AA".getBytes("UTF-16").length);
//
//        System.out.println(Arrays.toString("A".getBytes("UTF-16")));
//        System.out.println(Arrays.toString("A".getBytes("UTF-8")));
//        System.out.println(Arrays.toString("A".getBytes("Latin1")));
//        char a = 15_000;
//        System.out.println(a);

        char[] arr;
        arr = Character.toChars(150_000);
        System.out.println((int) arr[0] + " " +(int) arr[1]);
        char ch1 = arr[0];
        char ch2 = arr[1];
        System.out.println((int)ch1 +" " +(int)ch2);
    }
}
