package Module7.HW.HomeWork_7_2;

import Module7.HW.HomeWork_7_1.Order;

import java.util.Comparator;

/**
 * Created by user on 11.12.2016.
 */
public class  SortPrice implements Comparator<Order> {

    @Override
    public int compare(Order a, Order b) {
        Integer s1 = b.getPrice();
        Integer s2 = a.getPrice();
        return s1.compareTo(s2) ;
    }
}
