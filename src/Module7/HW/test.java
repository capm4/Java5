package Module7.HW;

import Module7.HW.HomeWork_7_1.Currency;
import Module7.HW.HomeWork_7_1.Order;
import Module7.HW.HomeWork_7_1.User;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by user on 04.12.2016.
 */
public class test {
    public static void main(String[] args) {
        User Ivan = new User(2, "Ivan", "Ivanov", "NY", 1500);
        TreeSet<Order> orderList = new TreeSet<>();
        orderList.add(new Order(1,100, Currency.USD, "Banan", "111", Ivan));

        orderList.forEach((a)-> System.out.println(a));
    }
}
