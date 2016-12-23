package Module9;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Created by user on 20.12.2016.
 */
public class test1 {
    public static void main(String[] args) {
        Comparator<Integer> x = Integer :: compare;
        List<Integer> y = new ArrayList<>();
        y.add(1);
        y.add(2);
        y.add(3);
        y.sort(x);
        System.out.println();
    }
}
