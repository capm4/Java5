package Module7.HW.HomeWork_7_2;

import Module7.HW.HomeWork_7_1.Order;

import java.util.Comparator;

/**
 * Created by user on 11.12.2016.
 */
public class SortPriseAndCity implements Comparator<Order> {
    @Override
    public int compare(Order a, Order b) {
        String s1City = a.getUser().getCity().toUpperCase();
        String s2City = b.getUser().getCity().toUpperCase();
        Integer s1 = a.getPrice();
        Integer s2 = b.getPrice();

        Integer count = s1 - s2;

        if (count == 0 ){
            return s1City.compareTo(s2City);
        }
        else if (count != 0){
            return s2.compareTo(s1);
        }
        else return 0;
    }
}
