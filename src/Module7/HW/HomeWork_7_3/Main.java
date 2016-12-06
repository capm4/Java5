package Module7.HW.HomeWork_7_3;

import Module7.HW.HomeWork_7_1.Currency;
import Module7.HW.HomeWork_7_1.Order;
import Module7.HW.HomeWork_7_1.User;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by user on 05.12.2016.
 */
public class Main {
    public static void main(String[] args) {
        User Ivan = new User(1, "Ivan", "Ivanov", "NY", 1500);
        User Oleg = new User(2, "Oleg", "Olegov", "NY", 1500);
        User Max = new User (3, "Max", "Savion", "NY", 3000);
        User Andriy = new User(4, "Andriy", "Bezlik", "LA", 1500);
        User Violeta = new User(5, "Violeta", "Violet", "London", 200);
        User Oleksiy = new User(6, "Oleksiy", "Matchen", "Rome", 1200);
        User Taras = new User(7, "Taras", "Humenuy", "London", 2000);
        User Petro = new User(8, "Petro", "Petrovsliy", "Rome", 3000);
        User Vita = new User(9, "Vita", "Bogach", "LA", 200);
        User Oksana = new User(10, "Oksana", "Mizera", "London", 1500);

        TreeSet<Order> orderList = new TreeSet<>();
        orderList.add(new Order(1,100, Currency.USD, "Banan", "111", Ivan));
        orderList.add(new Order(2,100, Currency.USD, "Banan", "111", Oleg));
        orderList.add(new Order(3,300,Currency.USD, "Bear", "111", Max));
        orderList.add(new Order(4,1500,Currency.USD, "Bread", "333", Andriy));
        orderList.add(new Order(5,200,Currency.EUR, "Bread", "444", Violeta));
        orderList.add(new Order(6,400,Currency.EUR, "Bear", "111", Oleksiy));
        orderList.add(new Order(7,100,Currency.EUR, "Apple", "333", Taras));
        orderList.add(new Order(8,200,Currency.EUR, "Banan", "222", Petro));
        orderList.add(new Order(9,400,Currency.UAH, "Bear", "444", Vita));
        orderList.add(new Order(1,100,Currency.USD, "Banan", "111", Oksana));


        for (Order a : orderList) System.out.println(a);
    }
}
